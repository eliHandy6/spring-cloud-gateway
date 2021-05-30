package com.ciffertech.springcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudRoutingConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder locatorBuilder){

        return locatorBuilder.routes().route(
                r->r.path("/apis/v1/product-inquiry/**")
                     .uri("http://localhost:8700/")
        ).build();

    }
}
