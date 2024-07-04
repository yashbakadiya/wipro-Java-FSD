package com.trainingapps.favouritems.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trainingapps.favouritems.entity.FavoritedPlayer;
@Repository
public interface IFavoritedPlayerRepository extends MongoRepository<FavoritedPlayer,String> {
	Optional<FavoritedPlayer> findByUserNameAndExternalServerId(String userName , String id);
	List<FavoritedPlayer> findByUserName(String userName);
}
