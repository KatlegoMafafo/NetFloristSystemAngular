package com.florist.NetFlorist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={
    "com.florist.NetFlorist",
    "com.florist.NetFlorist.controller",
    "com.florist.NetFlorist.services",
    "com.florist.NetFlorist.model",
    "com.florist.NetFlorist.repositories"})

public class NetFloristApplication {
	public static void main(String[] args) 
        {
        //Start of main Applications
	SpringApplication.run(NetFloristApplication.class, args);
	}
} //end of code
