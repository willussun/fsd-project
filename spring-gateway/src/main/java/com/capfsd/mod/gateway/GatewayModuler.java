package com.capfsd.mod.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableZuulProxy
public class GatewayModuler {
    public static void main(String[] args) {
        SpringApplication.run(GatewayModuler.class);
    }
}
