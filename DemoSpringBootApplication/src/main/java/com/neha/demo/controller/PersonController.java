package com.neha.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neha.demo.entity.Person;
import com.neha.demo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/test/api")
	 Map<String,String> testApi(){
		 Map<String,String> map = new  HashMap<>();
		 map.put("abc", "1234");
		return map;
	}

	@PostMapping("/person")
	 Map<String,String> savePerson(@RequestBody Person person ){
		return personService.savePerson(person);
	}

	
}
