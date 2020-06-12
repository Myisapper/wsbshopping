package com.wsb.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WsbShoppingConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsbShoppingConsumerApplication.class, args);
    }

}
