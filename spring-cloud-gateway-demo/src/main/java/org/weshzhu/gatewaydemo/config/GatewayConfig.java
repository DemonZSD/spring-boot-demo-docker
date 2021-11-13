package org.weshzhu.gatewaydemo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weshzhu
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder rb = builder.routes();
        rb.route("route_id", r -> r.path("/route11/**").uri("http://127.0.0.1:8088/route")).build();
        return rb.build();
    }
}
