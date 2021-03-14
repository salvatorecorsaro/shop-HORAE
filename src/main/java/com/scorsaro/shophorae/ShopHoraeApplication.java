package com.scorsaro.shophorae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShopHoraeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopHoraeApplication.class, args);
    }

}
