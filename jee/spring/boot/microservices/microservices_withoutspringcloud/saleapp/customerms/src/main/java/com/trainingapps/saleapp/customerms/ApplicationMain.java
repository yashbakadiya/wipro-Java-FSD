package com.trainingapps.saleapp.customerms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApplicationMain {

    public static void main(String args[]){
       SpringApplication.run(ApplicationMain.class,args);

    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate;
    }

}
