package com.driveEasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer	
public class DriveEasyServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriveEasyServiceRegistryApplication.class, args);
	}

}
