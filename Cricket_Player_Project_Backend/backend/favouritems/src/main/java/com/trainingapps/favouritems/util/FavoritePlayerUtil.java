package com.trainingapps.favouritems.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.trainingapps.favouritems.dto.AddToFavorite;
import com.trainingapps.favouritems.dto.FavoritedPlayerDetails;
import com.trainingapps.favouritems.entity.FavoritedPlayer;
/**
 * Class user for conversion of data from FavoritedPlayer to FavoritedPlayerDetails and List of FavoritedPlayer
 * To FavoritedPlayerDetails
 * @Author REPULBEHL
 */
@Component
public class FavoritePlayerUtil {
    
	/**
     * Method Use for converting the data From FavoritedPlayer to FavoritedPlayerDetails
     * @param FavoritedPlayer
     * @return FavoritedPlayerDetails
     */
	public FavoritedPlayerDetails convertToFavoritePlayerDetails(FavoritedPlayer requestData) {
		FavoritedPlayerDetails playerDetails = new FavoritedPlayerDetails();
		playerDetails.setExternalServerId(requestData.getExternalServerId());
		playerDetails.setName(requestData.getName());
		playerDetails.setBattingStyle(requestData.getBattingStyle());
		playerDetails.setBowlingStyle(requestData.getBowlingStyle());
		playerDetails.setPlaceOfBirth(requestData.getPlaceOfBirth());
		playerDetails.setCountry(requestData.getCountry());
		playerDetails.setImageUrl(requestData.getPlayerImg());
		playerDetails.setStats(requestData.getStats());
		return playerDetails;
	}
	
    
	public FavoritedPlayer convertToFavoritedPlayer(AddToFavorite requestData) {
		FavoritedPlayer player = new FavoritedPlayer();
		player.setExternalServerId(requestData.getExternalServerId());
		player.setUserName(requestData.getUserName());
		player.setName(requestData.getName());
		player.setBattingStyle(requestData.getBattingStyle());
		player.setBowlingStyle(requestData.getBowlingStyle());
		player.setPlaceOfBirth(requestData.getPlaceOfBirth());
		player.setCountry(requestData.getCountry());
		player.setPlayerImg(requestData.getImageUrl());
		player.setStats(requestData.getStats());
		return player;

	}
	
	/**
     * method to convert the list of FavoritedPlayer to FavoritedPlayerDetails
     * @param FavoritedPlayerList
     * @return FavoritedPlayerDetailsList
     */
	public List<FavoritedPlayerDetails> toFavoritePlayerDetailsList(Collection<FavoritedPlayer> requestData) {
		List<FavoritedPlayerDetails> playerDetailsList = new ArrayList<>();
		for (FavoritedPlayer iter : requestData) {
			FavoritedPlayerDetails playerDetail = convertToFavoritePlayerDetails(iter);
			playerDetailsList.add(playerDetail);
		}
		return playerDetailsList;
	}
}
