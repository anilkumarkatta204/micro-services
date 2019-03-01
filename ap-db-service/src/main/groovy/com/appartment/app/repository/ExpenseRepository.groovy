package com.appartment.app.repository

import org.springframework.data.mongodb.repository.MongoRepository

import com.appartment.app.model.Expense

interface ExpenseRepository extends MongoRepository<Expense, Integer> {
}
