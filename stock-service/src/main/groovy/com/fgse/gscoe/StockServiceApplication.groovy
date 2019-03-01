package com.fgse.gscoe

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class StockServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(StockServiceApplication, args)
	}

}
