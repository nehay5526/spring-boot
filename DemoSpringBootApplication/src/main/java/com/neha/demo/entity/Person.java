package com.neha.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	Long id;
	String name;
	Long age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	
	
	
}
