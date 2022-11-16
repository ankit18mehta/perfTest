package com.dtdl.perfTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.dtdl.perfTest")

public class PerfTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfTestApplication.class, args);
	}

}
