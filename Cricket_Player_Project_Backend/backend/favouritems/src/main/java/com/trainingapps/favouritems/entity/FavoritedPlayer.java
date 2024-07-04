package com.trainingapps.favouritems.entity;

import java.util.List;
import java.util.Objects;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Document Class For WatchList Module
 * @author REPULBEHL
 *
 */
@Document("favoriteplayers")
public class FavoritedPlayer {

	@Id	
	private String id;
	private String userName;
	private String externalServerId;
	private String name;
	private String battingStyle;
	private String bowlingStyle;
	private String placeOfBirth;
	private String country;
	private String playerImg;
	private List<Stat> stats;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExternalServerId() {
		return externalServerId;
	}

	public void setExternalServerId(String externalServerId) {
		this.externalServerId = externalServerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlayerImg() {
		return playerImg;
	}

	public void setPlayerImg(String playerImg) {
		this.playerImg = playerImg;
	}

	public List<Stat> getStats() {
		return stats;
	}

	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoritedPlayer other = (FavoritedPlayer) obj;
		return Objects.equals(id, other.id);
	}


	

}
