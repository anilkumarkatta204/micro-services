package com.fgse.gscoe.repository

import org.springframework.data.jpa.repository.JpaRepository

import com.fgse.gscoe.model.Quote

interface QuotesRepository extends JpaRepository<Quote, Integer> {
	List<Quote> findByUserName(String userName);
}
