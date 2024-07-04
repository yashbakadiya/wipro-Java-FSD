package com.trainingapps.favouritems.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import com.trainingapps.favouritems.dto.AddToFavorite;
import com.trainingapps.favouritems.dto.FavoritedPlayerDetails;
import com.trainingapps.favouritems.dto.RemoveFavorite;
import com.trainingapps.favouritems.exceptions.PlayerAlreadyExistException;
import com.trainingapps.favouritems.exceptions.PlayerNotFoundException;

@Validated
public interface IFavoritedPlayerService {
	
	FavoritedPlayerDetails addToFavorite(@Valid AddToFavorite requestData)throws PlayerAlreadyExistException;

	void removeFavorite(@Valid RemoveFavorite requestData) throws PlayerNotFoundException;

	List<FavoritedPlayerDetails> listFavoritePlayersByUserName(@NotBlank @Length(min = 2,max =15) String userName) ;
}
