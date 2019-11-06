package com.neha.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neha.demo.entity.Person;
import com.neha.demo.repository.PersonRepository;

@Service
public class PersonService implements IPerson{

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Map<String,String> savePerson(Person person) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		if(person!=null) {
			personRepository.save(person);
			map.put("data", "data saved successfully");
		}
		else {
			map.put("data", "data is null");
		}
		
		return map;
		
	}

}
