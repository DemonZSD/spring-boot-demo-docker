package org.weshzhu.gatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayDemoBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(GatewayDemoBootstrap.class, args);
    }
}
