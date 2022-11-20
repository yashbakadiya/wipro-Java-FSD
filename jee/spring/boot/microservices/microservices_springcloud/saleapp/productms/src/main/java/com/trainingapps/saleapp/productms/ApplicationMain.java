package com.trainingapps.saleapp.productms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationMain {

    public static void main(String args[]){
       SpringApplication.run(ApplicationMain.class,args);

    }
}
