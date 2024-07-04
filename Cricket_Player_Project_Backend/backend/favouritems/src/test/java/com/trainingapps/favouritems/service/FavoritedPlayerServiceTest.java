package com.trainingapps.favouritems.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.trainingapps.favouritems.dao.IFavoritedPlayerRepository;
import com.trainingapps.favouritems.dto.AddToFavorite;
import com.trainingapps.favouritems.dto.FavoritedPlayerDetails;
import com.trainingapps.favouritems.dto.RemoveFavorite;
import com.trainingapps.favouritems.entity.FavoritedPlayer;
import com.trainingapps.favouritems.exceptions.PlayerAlreadyExistException;
import com.trainingapps.favouritems.exceptions.PlayerNotFoundException;
import com.trainingapps.favouritems.service.FavoritedPlayerService;
import com.trainingapps.favouritems.util.FavoritePlayerUtil;

@ExtendWith(MockitoExtension.class)
class FavoritedPlayerServiceTest {
	
		 	@Mock
		 	IFavoritedPlayerRepository repo; 	//mock of dao

		    @Mock
		    FavoritePlayerUtil utility; // mock of util class

		    @Spy
		    @InjectMocks
		    FavoritedPlayerService service;

		    
		    /**
		     * scenerio when list is return of a given userName
		     * input: userName="Repul"
		     * expected: expected mock object returned  is result
		     * verifying  {@link IFavoritedPlayerRepository#findByUserName(*)} is called only once
		     */
		    @Test
		    public void testListFavoritePlayersByUserName_1()
		    {
		    	String username= "Repul";
		    	List<FavoritedPlayer> favoriteplayerlsit = mock(List.class);
		    	List<FavoritedPlayerDetails> expected  = mock(List.class);
		    	when(repo.findByUserName(username)).thenReturn(favoriteplayerlsit);
		    	when(utility.toFavoritePlayerDetailsList(favoriteplayerlsit)).thenReturn(expected);
		    	List<FavoritedPlayerDetails> result = service.listFavoritePlayersByUserName(username);
		    	assertEquals(expected, result);
		    	verify(repo).findByUserName(username);
		    }
		    
		    /**
		     * Scenerio: player added to favorite successfully
		     * input:AddToFavorite add data {userName:"Repul",externalServerId:"sachin2432-tendulkar02-m"}
		     * Expexted: expected mock object  is equal to returned result   
		     * verifying {@link IFavoritedPlayerRepository#save(*)} is run once  
		     */
		    @Test
		    public void testAddToFavorite_1() throws Exception 
		    {
		    	AddToFavorite add =  new AddToFavorite();
		    	add.setUserName("Repul");
		    	add.setExternalServerId("sachin2432-tendulkar02-m");
		    	
		    	String id = "id2";
		    	Optional<FavoritedPlayer> optional = Optional.empty();
		    	when(repo.findByUserNameAndExternalServerId(add.getUserName(), add.getExternalServerId())).thenReturn(optional);
		    	
		    	FavoritedPlayer player = mock(FavoritedPlayer.class);
		    	when(utility.convertToFavoritedPlayer(add)).thenReturn(player);
		    	
		    	doReturn(id).when(service).generateNewID(add.getUserName(), add.getExternalServerId());
		    
		    	FavoritedPlayer playerSaved = mock(FavoritedPlayer.class);
		    	when(repo.save(player)).thenReturn(playerSaved);
		    	
		    	FavoritedPlayerDetails expected =  mock(FavoritedPlayerDetails.class);
		    	when(utility.convertToFavoritePlayerDetails(playerSaved)).thenReturn(expected);
		    	
		    	FavoritedPlayerDetails result = service.addToFavorite(add);
		    	assertEquals(expected,result);
		    	verify(repo).save(player);
		    	
		    }

		    /**
		     * Scenerio: player already exist and PlayerAlreadyExistException is thrown
		     * input:AddToWatchList add
		     * @throws PlayerAlreadyExistException
		     * Expexted:PlayerAlreadyExistException is thrown
		     */
		    @Test
		    public void testAddToFavorite_2() throws PlayerAlreadyExistException
		    {
		    	AddToFavorite add =  new AddToFavorite();
		    	add.setUserName("Repul");
		    	add.setExternalServerId("sachin2432-tendulkar02-m");
		    	
		    	FavoritedPlayer player = mock(FavoritedPlayer.class);
		    	Optional<FavoritedPlayer> optional = Optional.of(player);
		    	when(repo.findByUserNameAndExternalServerId(add.getUserName(), add.getExternalServerId()))
		    	.thenReturn(optional);
		    	
		    	Executable executable= ()->{
		            service.addToFavorite(add);
		        };
		        assertThrows(PlayerAlreadyExistException.class, executable);
		    	verify(repo,never()).save(any());
		    }

		    /**
		     * scenerio: when favorite player is removed successfully
		     * input: RemoveFavorite remove
		     * @throws PlayerNotFoundException
		     */
		    @Test
		    public void testRemoveFavorite_1() throws PlayerNotFoundException{
		    	RemoveFavorite remove = new RemoveFavorite();
		    	remove.setUserName("Repul");
		    	remove.setExternalServerId("sachin2432-tendulkar02-m");
		    	FavoritedPlayer player = mock(FavoritedPlayer.class);
		    	doReturn(player).when(service).findPlayer(remove.getUserName(), remove.getExternalServerId());
		    	service.removeFavorite(remove);
		    	
		    }
		   
		    
	
	
		    /**
		     * scenerio: PlayerNotFound  exception is thrown
		     * input: RemoveFromWatchList remove
		     * @throws PlayerNotFoundException
		     * expected:PlayerNotFound Excpetion
		     */
		    @Test
		    public void testRemoveFavorite_2() throws PlayerNotFoundException{
		    	RemoveFavorite remove = new RemoveFavorite();
		    	remove.setUserName("Repul");
		    	remove.setExternalServerId("sachin2432-tendulkar02-m");
		    	doThrow(PlayerNotFoundException.class).when(service)
		    	.findPlayer(remove.getUserName(),remove.getExternalServerId());
		    	
		    	Executable executable = ()->{
		    		service.removeFavorite(remove);
		    	};
		    	assertThrows(PlayerNotFoundException.class, executable);
		    }

	}

