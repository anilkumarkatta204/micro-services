package com.fgse.gscoe.resource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import com.fgse.gscoe.model.Quote
import com.fgse.gscoe.repository.QuotesRepository

@RestController
@RequestMapping("/rest/db")
@ComponentScan
class DbServiceResource {
	
	@Autowired
	QuotesRepository quotesRepository
	
	@GetMapping("/{username}")
	public def getQuotes(@PathVariable("username") final String username) {
		
		/*def filtered = quotesRepository.findByUserName(username).find {
			it.id == 8
		}
		*/
		return username
		
	}
	
	@PostMapping("/{username}")
	public void saveQuotes(@PathVariable("username") final String username) {
		
		Quote q = new Quote();
		q.userName = username
		q.quote = "qewrqwer"
		
		quotesRepository.save(q)
	}
}
