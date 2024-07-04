package com.trainingapps.favouritems.dto;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.trainingapps.favouritems.entity.Stat;
/**
 * Request Data for adding a Player For a User
 */

public class AddToFavorite {
	
	@NotBlank
	@Length(min = 2,max =15)
	private String userName;
	@NotBlank
	@Length(max=50)
	private String externalServerId;
	@NotBlank
	@Length(min = 2,max =30)
	private String name;
	// @NotBlank
	@Length(min = 2,max =30)
	private String battingStyle;
	// @NotBlank
	@Length(min = 2,max =30)
	private String bowlingStyle;
	@NotBlank
	@Length(min = 2,max =50)
	private String placeOfBirth;
	@NotBlank
	@Length(min = 2,max =30)
	private String country;
	@NotBlank
	@Length(min = 2,max =100)
	private String imageUrl;
	@NotEmpty
	private List<Stat> stats;

	

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

	@Override
	public int hashCode() {
		return Objects.hash(externalServerId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddToFavorite other = (AddToFavorite) obj;
		return Objects.equals(externalServerId, other.externalServerId) && Objects.equals(userName, other.userName);
	}

}
