package com.johnh_harris.drawr.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner run(FeedService feedService) {
		return args -> {
			// Logic to run at startup
			feedService.startFeed();
		};
	}*/

}
