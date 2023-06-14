package com.abdo.moviesms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoAuditing
public class MoviesMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesMsApplication.class, args);
    }
    /*
    @Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			for(int i=0; i<20 ;i++) {
				kafkaTemplate.send("Notification","vrai" );
			}
		};
	}*/

}
