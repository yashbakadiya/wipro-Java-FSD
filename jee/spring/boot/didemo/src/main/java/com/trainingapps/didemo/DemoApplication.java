package com.trainingapps.didemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)EnableAutoConfiguration
 */
@SpringBootApplication
public class DemoApplication {
    private static final Logger Log= LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
      Canvas canvas=context.getBean(Canvas.class);
      canvas.drawShape();
      Log.debug("***i am logged with debug ");
      Log.info("***i am logged with info");
      Log.error("***i am logged with error");


    }

}
