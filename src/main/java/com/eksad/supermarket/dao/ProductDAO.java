package com.eksad.supermarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.eksad.supermarket.entity.Product;

public interface ProductDAO extends CrudRepository<Product, Long>
{
	
	
	
}
