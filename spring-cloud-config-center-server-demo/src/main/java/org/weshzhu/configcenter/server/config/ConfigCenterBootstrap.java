package org.weshzhu.configcenter.server.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weshzhu
 * @date 2021-11-13
 * the bootstrap class of config center server side
 */
@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterBootstrap.class, args);
    }
}
