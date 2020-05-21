package com.emim.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		System.out.println("Application starting up...");
		SpringApplication.run(KafkaApplication.class, args);
	}

}
