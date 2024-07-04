package com.trainingapps.favouritems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainingapps.favouritems.dao.IFavoritedPlayerRepository;
import com.trainingapps.favouritems.dto.AddToFavorite;
import com.trainingapps.favouritems.dto.FavoritedPlayerDetails;
import com.trainingapps.favouritems.dto.RemoveFavorite;
import com.trainingapps.favouritems.entity.FavoritedPlayer;
import com.trainingapps.favouritems.exceptions.PlayerAlreadyExistException;
import com.trainingapps.favouritems.exceptions.PlayerNotFoundException;
import com.trainingapps.favouritems.util.FavoritePlayerUtil;
/**
 * Service Implementation For Watch List Service
 *
 */
@Service
public class FavoritedPlayerService implements IFavoritedPlayerService{
	
	@Autowired
	private IFavoritedPlayerRepository dao ;
	
	@Autowired
	private FavoritePlayerUtil utility;
	
	
	public String generateNewID(String userName , String externalServerId) {
		String autoId =externalServerId + "-u-"+userName;
		return autoId;
	}

    /**
     * Saves  favorited player Information For a user and returns FavoritedPlayerDetails ,
     * If User has already favorited the player information then PlayerAlreadyExistException is thrown
     *
     * @param  requestData
     * @return FavoritedPlayerDetails
     * @throws PlayerAlreadyExistException If Player Already Exist For a User
     */
	@Override
	public FavoritedPlayerDetails addToFavorite(AddToFavorite requestData) throws PlayerAlreadyExistException {
		
		Optional<FavoritedPlayer> optional = dao.findByUserNameAndExternalServerId(requestData.getUserName(), requestData.getExternalServerId());
		if(optional.isPresent()) {
		  throw new PlayerAlreadyExistException("Player Already Exist ");
		}
		String id = generateNewID(requestData.getUserName(), requestData.getExternalServerId());
		FavoritedPlayer player =  utility.convertToFavoritedPlayer(requestData);
		player.setId(id);
		player = dao.save(player);
		FavoritedPlayerDetails playerDetails = utility.convertToFavoritePlayerDetails(player);
		return playerDetails;
	}
	
	/**
     * Find the  Player from the favorite list
     *
     * @param userName ,externalServerId
     * @throws PlayerNotFoundException
    */
	public FavoritedPlayer findPlayer(String userName,String externalServerId) throws PlayerNotFoundException {
		Optional<FavoritedPlayer> optional =  dao.findByUserNameAndExternalServerId(userName, externalServerId);
		if(!optional.isPresent()) {
			throw new PlayerNotFoundException();
		}
		FavoritedPlayer playerGot = optional.get();
		return playerGot;
	}
	
	/**
     * Remove the  Player from the favorite list
     *
     * @param requestData
     * @throws PlayerNotFoundException
     */
	@Override
	public void removeFavorite(RemoveFavorite requestData) throws PlayerNotFoundException {
		FavoritedPlayer playerFound = findPlayer(requestData.getUserName(),requestData.getExternalServerId());
		dao.delete(playerFound);
	}

	/**
     * Return the list of favorited added Item of a user
     *	 	
     * @param userName
     * @return FavoritedPlayerDetailsList
     */
	@Override
	public List<FavoritedPlayerDetails> listFavoritePlayersByUserName(String userName) {
		
		List<FavoritedPlayer> playerList = dao.findByUserName(userName);
		
		List<FavoritedPlayerDetails> playerDetailsList = utility.toFavoritePlayerDetailsList(playerList);
		return playerDetailsList;
	}

	
}
