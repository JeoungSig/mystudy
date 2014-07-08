package com.book.customer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	private Integer id;
	private int age;
	private String name;

	public Customer() {
	}

	public Customer(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Id
	@Column(name = "CUST_ID")
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
