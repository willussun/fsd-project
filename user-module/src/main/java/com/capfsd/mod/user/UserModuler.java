package com.capfsd.mod.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class UserModuler {
    public static void main(String[] args) {
	System.out.println("aaa");
        SpringApplication.run(UserModuler.class);
    }
}
