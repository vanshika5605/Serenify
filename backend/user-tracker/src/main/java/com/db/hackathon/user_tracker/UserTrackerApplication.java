package com.db.hackathon.user_tracker;

import com.db.hackathon.user_tracker.adapters.PostgreSQLJDBCExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserTrackerApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserTrackerApplication.class, args);
	}

}
