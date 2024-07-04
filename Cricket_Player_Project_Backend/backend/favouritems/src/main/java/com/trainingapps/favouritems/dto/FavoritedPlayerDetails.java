package com.trainingapps.favouritems.dto;

import java.util.List;

import com.trainingapps.favouritems.entity.Stat;
/**
 * 
 * Response dto
 * 
 */
public class FavoritedPlayerDetails {

	private String externalServerId;  
	private String name;
	private String dateOfBirth;
	private String role;
	private String battingStyle;
	private String bowlingStyle;
	private String placeOfBirth;
	private String country;
	private String imageUrl;
	private List<Stat> stats;

	

	public String getExternalServerId() {
		return externalServerId;
	}

	public void setExternalServerId(String externalServerId) {
		this.externalServerId = externalServerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<Stat> getStats() {
		return stats;
	}

	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

}
