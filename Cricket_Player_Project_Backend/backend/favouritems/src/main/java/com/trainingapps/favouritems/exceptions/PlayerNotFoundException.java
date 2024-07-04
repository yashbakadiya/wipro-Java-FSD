package com.trainingapps.favouritems.exceptions;

public class PlayerNotFoundException extends Exception {
	public PlayerNotFoundException() {
		super("Player not Found");
	}
	public PlayerNotFoundException(String msg) {
		super(msg);
	}
	
}
