package com.db.reconciliation.hack_ep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HackEpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackEpApplication.class, args);
	}

}
