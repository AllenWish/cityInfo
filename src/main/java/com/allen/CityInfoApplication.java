package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 访问地址 localhost:server.port/server.context-path
 * 默认为 localhost:8080/
 * 这里我配置了 yml  port为8033 添加了 context-path  为cityInfo
 */
@SpringBootApplication
public class CityInfoApplication {


	//localhost:8033/cityInfo
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CityInfoApplication.class, args);
	}
}
