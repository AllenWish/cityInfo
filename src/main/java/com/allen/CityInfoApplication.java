package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CityInfoApplication {


	//localhost:8033/cityInfo
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CityInfoApplication.class, args);
	}
}
