package com.trainingapps.userms;


import com.trainingapps.userms.util.AuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)EnableAutoConfiguration
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);

    }

    @Bean
    public AuthenticationFilter authenticateFilter(){
        return new AuthenticationFilter();
    }

    @Bean
    public FilterRegistrationBean<AuthenticationFilter>filterRegisteration(){
        FilterRegistrationBean<AuthenticationFilter> registration=new FilterRegistrationBean<>();
        registration.setFilter(authenticateFilter());
        // add uris on which filter should work
        registration.addUrlPatterns("/users/*");
        registration.setOrder(2);
        return registration;
    }

}
