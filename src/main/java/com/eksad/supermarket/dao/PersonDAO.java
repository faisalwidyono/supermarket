package com.eksad.supermarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.eksad.supermarket.entity.Person;

public interface PersonDAO extends CrudRepository<Person, Long>{

}
