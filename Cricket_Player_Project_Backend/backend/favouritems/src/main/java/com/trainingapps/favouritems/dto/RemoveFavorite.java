package com.trainingapps.favouritems.dto;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class RemoveFavorite {
	@NotBlank
	@Length(max=50)
	private String externalServerId;
	@NotBlank
	@Length(min = 2,max =15)
	private String userName;
	
	
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
		RemoveFavorite other = (RemoveFavorite) obj;
		return Objects.equals(externalServerId, other.externalServerId) && Objects.equals(userName, other.userName);
	}
	
	
	

}
