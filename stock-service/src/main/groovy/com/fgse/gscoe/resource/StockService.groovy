package com.fgse.gscoe.resource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/rest/stock")
class StockService {
	
	@Autowired
	RestTemplate restTemplate
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate()
	}
	
	@GetMapping("/{username}")
	public def getQuotes(@PathVariable("username") final String username) {
		
		ResponseEntity<String> response = restTemplate.exchange("http://DB-SERVICE/rest/db/"+username,HttpMethod.GET, null, String.class )
		return response
		
	}
}
