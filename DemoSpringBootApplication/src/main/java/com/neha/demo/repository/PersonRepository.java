package com.neha.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neha.demo.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

}
