package com.trainingapps.favouritems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainingapps.favouritems.dto.AddToFavorite;
import com.trainingapps.favouritems.dto.FavoritedPlayerDetails;
import com.trainingapps.favouritems.dto.RemoveFavorite;
import com.trainingapps.favouritems.exceptions.PlayerAlreadyExistException;
import com.trainingapps.favouritems.exceptions.PlayerNotFoundException;
import com.trainingapps.favouritems.service.IFavoritedPlayerService;

@RequestMapping("/favouritePlayers")
@RestController
public class FavoritePlayerController {
	
	@Autowired
	IFavoritedPlayerService service;
	
	@PostMapping("/add")
	public FavoritedPlayerDetails addFavoritePlayer(@RequestBody AddToFavorite requestPlayer) throws PlayerAlreadyExistException {
		FavoritedPlayerDetails playerdetails = service.addToFavorite(requestPlayer);
		return playerdetails;
	}	

	@DeleteMapping("/delete")
	public void removeFavoritePlayer(@RequestBody RemoveFavorite requestPlayer) throws PlayerNotFoundException {
		 service.removeFavorite(requestPlayer);
	}	
	
	@GetMapping("/allFavoritedPlayer/{userName}")
	public List<FavoritedPlayerDetails> listOfFavoritePlayer(@PathVariable String userName){
		List<FavoritedPlayerDetails> playerDetailsList = service.listFavoritePlayersByUserName(userName);
		return playerDetailsList;
	}
}
