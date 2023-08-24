package com.example.POI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@SpringBootApplication

public class PoiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PoiApplication.class, args);
		System.out.println("hi!");
	}
}

