package com.trinetra.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.trinetra")
public class EcommerceOrderConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceOrderConsumerAppApplication.class, args);
	}

}
