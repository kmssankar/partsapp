package com.springboot.parts.partsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(exclude = { EurekaClientAutoConfiguration.class,
		EurekaDiscoveryClientConfiguration.class })
//@EnableEurekaClient
public class PartsappApplication {
	public static void main(String[] args) {
		SpringApplication.run(PartsappApplication.class, args);
	}
}
