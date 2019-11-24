package com.capfsd.mod.technology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TechnologyModuler {
    public static void main(String[] args) {
        System.out.println("This is for test");
        SpringApplication.run(TechnologyModuler.class, args);
    }

}
