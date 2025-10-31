package com.encomendaTracker.encomenda_tracker_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EncomendaTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncomendaTrackerApplication.class, args);
	}

}
