package com.spring.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
