package com.fgse.gscoe

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories("com.fgse.gscoe.repository")
@SpringBootApplication
@EnableEurekaClient
class DbServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(DbServiceApplication, args)
	}

}
