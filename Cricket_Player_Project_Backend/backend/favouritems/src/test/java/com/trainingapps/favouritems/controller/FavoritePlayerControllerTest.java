package com.trainingapps.favouritems.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trainingapps.favouritems.dto.AddToFavorite;
import com.trainingapps.favouritems.dto.FavoritedPlayerDetails;
import com.trainingapps.favouritems.dto.RemoveFavorite;
import com.trainingapps.favouritems.entity.Stat;
import com.trainingapps.favouritems.exceptions.PlayerAlreadyExistException;
import com.trainingapps.favouritems.exceptions.PlayerNotFoundException;
import com.trainingapps.favouritems.service.IFavoritedPlayerService;

@WebMvcTest(FavoritePlayerController.class)
class FavoritePlayerControllerTest {
	private FavoritedPlayerDetails favouritePlayerDetails;

	@MockBean
	IFavoritedPlayerService service;

	@Autowired
	MockMvc mvc;

	@BeforeEach
	public void setup() {
		List<Stat> stats = new ArrayList<>();
		Stat statOne = new Stat();
		statOne.setMatchType("odi");
		statOne.setStatName("tr");
		statOne.setStatType("fn");
		statOne.setValue("100");
		stats.add(statOne);

		favouritePlayerDetails = new FavoritedPlayerDetails();
		favouritePlayerDetails.setExternalServerId("Sachin-738hu-Tendulkar02schTend-09kr");
		favouritePlayerDetails.setName("Sachin Tendulkar");
		favouritePlayerDetails.setDateOfBirth("10/nov/1986");
		favouritePlayerDetails.setRole("Batsman");
		favouritePlayerDetails.setBattingStyle("Right Handed Batsman");
		favouritePlayerDetails.setBowlingStyle("Right Handed Bowling");
		favouritePlayerDetails.setPlaceOfBirth("Mumbai");
		favouritePlayerDetails.setCountry("India");
		favouritePlayerDetails.setImageUrl("https://encrypted-tbn0.yE&usqp=CAU");
		favouritePlayerDetails.setStats(stats);
	}

	@AfterEach
	public void reset() {
		favouritePlayerDetails = null;
	}

	/**
	 * scenario: When userName is founded successfully input : userName = "Repul"
	 * expectation: List of FavoritePlayerDetails is returned as response. status 200/OK
	 * @throws Exception
	 */

	@Test
	public void testlistOfFavoritePlayer_1() throws Exception {
		String userName = "sample";

		List<FavoritedPlayerDetails> playerDetailsList = new ArrayList<>();
		playerDetailsList.add(favouritePlayerDetails);

		when(service.listFavoritePlayersByUserName(userName)).thenReturn(playerDetailsList);
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(playerDetailsList);
		String url = "/favouritePlayers/allFavoritedPlayer/" + userName;
		mvc.perform(get(url)).andExpect(status().isOk()).andExpect(content().json(json));
	}

	
	    /**
	     * scenario: When FavoritedPlayer is added successfully
	     * input : AddToWatchlist
	     * expectation:  weather is added successfully. status 200/OK
	     */
	    @Test
	    public void testAddCity_1() throws Exception {
	    	List<Stat> stats = new ArrayList<>();
	    	Stat statOne = new Stat();
	    	statOne.setMatchType("odi");
	    	statOne.setStatName("tr");
	    	statOne.setStatType("fn");
	    	statOne.setValue("100");
	    	stats.add(statOne);
	    	
	        AddToFavorite request = new AddToFavorite();
	        request.setUserName("Repul");
	        request.setExternalServerId("Sachin-738hu-Tendulkar02schTend-09kr");
	        request.setName("Sachin Tendulkar");
	        request.setBattingStyle("Right Handed Batsman");
	        request.setBowlingStyle("Right Handed Bowling");
	        request.setPlaceOfBirth("Mumbai");
	        request.setCountry("India");
	        request.setImageUrl("https://encrypted-tbn0.yE&usqp=CAU");
	        request.setStats(stats);
	        
	        when(service.addToFavorite(request)).thenReturn(favouritePlayerDetails);
	        ObjectMapper objectMapper = new ObjectMapper();
	        String jsonRequest = objectMapper.writeValueAsString(request);
	        String jsonResponse = objectMapper.writeValueAsString(favouritePlayerDetails);
	        String url = "/favouritePlayers/add";
	        mvc.perform(post(url)
	                        .contentType(MediaType.APPLICATION_JSON)
	                        .content(jsonRequest))
	                .andExpect(status().isOk())
	                .andExpect(content().json(jsonResponse));
	        verify(service).addToFavorite(request);

	    }

	    /**
	     * scenario: When FavriotedPlayer already exist
	     * input : AddToWatchlist
	     * expectation: @Throws PlayerAlreadyExistException
	     */
	    @Test
	    public void testAddCity_2() throws Exception {
	    	List<Stat> stats = new ArrayList<>();
	    	Stat statOne = new Stat();
	    	statOne.setMatchType("odi");
	    	statOne.setStatName("tr");
	    	statOne.setStatType("fn");
	    	statOne.setValue("100");
	    	stats.add(statOne);
	    	
	        AddToFavorite request = new AddToFavorite();
	        request.setUserName("Repul");
	        request.setExternalServerId("Sachin-738hu-Tendulkar02schTend-09kr");
	        request.setName("Sachin Tendulkar");
	        request.setBattingStyle("Right Handed Batsman");
	        request.setBowlingStyle("Right Handed Bowling");
	        request.setPlaceOfBirth("Mumbai");
	        request.setCountry("India");
	        request.setImageUrl("https://encrypted-tbn0.yE&usqp=CAU");
	        request.setStats(stats);
	        
	        String msg = "Player Already Exist";
	        PlayerAlreadyExistException e = new PlayerAlreadyExistException(msg);
	        doThrow(e).when(service).addToFavorite(request);
	        
	        ObjectMapper objectMapper = new ObjectMapper();
	        String jsonRequest = objectMapper.writeValueAsString(request);
	        String url = "/favouritePlayers/add";
	        mvc.perform(post(url)
	                        .contentType(MediaType.APPLICATION_JSON)
	                        .content(jsonRequest))
	                .andExpect(status().isBadRequest())
	                .andExpect(content().string(msg));
	        verify(service).addToFavorite(request);

	    }
	
	
	 /**
	 * scenario: When Player is removed successfully
	 * input : RemoveFavorite
	 * expectation: Player is removed successfully. status 200/OK
	 */
	@Test
	public void testremoveFavoritePlayer_1() throws Exception {

		RemoveFavorite request = new RemoveFavorite();
		request.setExternalServerId("Sachin-738hu-Tendulkar02schTend-09kr");
		request.setUserName("sample");

		doNothing().when(service).removeFavorite(request);
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonRequest = objectMapper.writeValueAsString(request);
		String url = "/favouritePlayers/delete";
		mvc.perform(delete(url).contentType(MediaType.APPLICATION_JSON).content(jsonRequest))
				.andExpect(status().isOk());
	}

	/**
	 * scenario: PlayerNotFound  exception is thrown
	 * input : RemoveFavorite
	 * expectation: @Throws PlayerNotFoundException
	 */
	@Test
	public void testremoveFavoritePlayer_2() throws Exception {

		RemoveFavorite request = new RemoveFavorite();
		request.setExternalServerId("Sachin-738hu-Tendulkar02schTend-09kr");
		request.setUserName("sample");
		
		String msg= "Player not Found";
		PlayerNotFoundException e = new PlayerNotFoundException(msg);
		doThrow(e).when(service).removeFavorite(request);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonRequest = objectMapper.writeValueAsString(request);
		String url = "/favouritePlayers/delete";
		mvc.perform(delete(url).contentType(MediaType.APPLICATION_JSON).content(jsonRequest))
				.andExpect(status().isNotFound()).andExpect(content().string(msg));
		 verify(service).removeFavorite(request);
	}
}
