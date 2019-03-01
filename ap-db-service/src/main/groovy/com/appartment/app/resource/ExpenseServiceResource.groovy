package com.appartment.app.resource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import com.appartment.app.model.Expense
import com.appartment.app.repository.ExpenseRepository

@RestController
@RequestMapping("/rest/db")
@ComponentScan
@EnableMongoRepositories
class ExpenseServiceResource {
	
	@Autowired
	ExpenseRepository expenseRepository
	
	@PostMapping("/expense")
	public void saveExpense(@RequestBody final Expense expense) {
		expenseRepository.save(expense)
	}
}
