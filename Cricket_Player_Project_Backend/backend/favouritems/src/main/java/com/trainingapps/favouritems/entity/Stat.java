package com.trainingapps.favouritems.entity;
/*
 * Class for Stat used in FavoritedPlayer class
 * @author REPULBEHL
 * 
 *  {
            "fn": "bowling",    stat type
            "matchtype": "odi", 
            "stat": "m",        stat name 
            "value": "344"
        },
        
 * */
public class Stat {
	private String statType;
	private String matchType;
	private String statName;
	private String value;
	
	public String getStatType() {
		return statType;
	}
	public void setStatType(String statType) {
		this.statType = statType;
	}

	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getStatName() {
		return statName;
	}
	public void setStatName(String statName) {
		this.statName = statName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}



}
