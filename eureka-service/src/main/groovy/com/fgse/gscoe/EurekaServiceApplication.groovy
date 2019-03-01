package com.fgse.gscoe

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
class EurekaServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication, args)
	}

}
