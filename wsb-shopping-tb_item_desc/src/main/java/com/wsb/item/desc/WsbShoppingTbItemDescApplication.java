package com.wsb.item.desc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WsbShoppingTbItemDescApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsbShoppingTbItemDescApplication.class, args);
    }

}
