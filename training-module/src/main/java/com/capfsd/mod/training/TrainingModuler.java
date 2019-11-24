package com.capfsd.mod.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class TrainingModuler {

    public static void main(String[] args) {
        SpringApplication.run(TrainingModuler.class, args);
    }

}
