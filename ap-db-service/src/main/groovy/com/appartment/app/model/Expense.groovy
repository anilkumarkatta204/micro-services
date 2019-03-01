package com.appartment.app.model

import javax.persistence.Entity

@Entity
class Expense {
	def id
	def timestamp
	def description
	def amount
}
