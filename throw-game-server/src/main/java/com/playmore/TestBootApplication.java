package com.playmore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.playmore.database.dbqueue.IDBQueue;

@SpringBootApplication
public class TestBootApplication {

	public static void main(String[] args) {
		// DefaultDBQueue  IDBQueue
		
		SpringApplication.run(TestBootApplication.class, args);
	}

}
