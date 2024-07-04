package com.trainingapps.favouritems;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PlayerappApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PlayerappApplication.class, args);
	}
   
	
}
