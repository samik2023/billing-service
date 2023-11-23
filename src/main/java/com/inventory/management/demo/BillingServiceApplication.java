package com.inventory.management.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BillingServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

}
