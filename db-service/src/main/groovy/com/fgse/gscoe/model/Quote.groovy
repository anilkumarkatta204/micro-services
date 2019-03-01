package com.fgse.gscoe.model

import static javax.persistence.GenerationType.AUTO

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "quote", catalog = "test")
public class Quote {
	
	public Quote() {
	}	 
	
	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id")
	Integer id
	
	@Column(name = "user_name")
	String userName
	
	@Column(name = "quote")
	String quote

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	
}
