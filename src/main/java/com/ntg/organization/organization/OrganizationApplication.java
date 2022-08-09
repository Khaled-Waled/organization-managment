package com.ntg.organization.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrganizationApplication {
//for api documentation open:
//http://localhost:8090/swagger-ui.html
	public static void main(String[] args) {
		SpringApplication.run(OrganizationApplication.class, args);
	}

}
