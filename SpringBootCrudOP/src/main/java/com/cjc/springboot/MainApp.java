package com.cjc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class MainApp {

	public static void main(String[] args) {
		System.out.println("in main method");
		
	SpringApplication.run(MainApp.class, args);
		
		
	}
	
	
	
}
