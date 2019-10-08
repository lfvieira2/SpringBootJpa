package com.spring.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
