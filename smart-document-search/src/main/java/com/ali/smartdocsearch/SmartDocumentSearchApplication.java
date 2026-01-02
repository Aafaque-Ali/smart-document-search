package com.ali.smartdocsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SmartDocumentSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartDocumentSearchApplication.class, args);
	}

}
