package com.MicroMovies.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;

import org.springframework.context.annotation.Bean;


import com.MicroMovies.gateway.filter.AuthenticationFilter;
import com.MicroMovies.gateway.filter.AuthenticationFilter.Config;
import com.ecwid.consul.transport.HttpRequest.Builder;


@SpringBootApplication
public class GatewayApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		
	}
	
	
	 /*
	
	 @Bean
	    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route("user-service", r -> r.path("/**")
	                        .filters(f -> f.filter((GatewayFilter)new AuthenticationFilter()))
	                        .uri("http://localhost:8080"))
	                .route("movies-ms", r -> r.path("/**")
	                		.filters(f -> f.filter((GatewayFilter)new AuthenticationFilter()))
	                        .uri("http://localhost:8084"))
	                .route("config", r -> r.path("/**")
	                		.filters(f -> f.filter((GatewayFilter)new AuthenticationFilter()))
	                        .uri("http://localhost:8088"))
	                .build();
	    }*/
	
	

}
