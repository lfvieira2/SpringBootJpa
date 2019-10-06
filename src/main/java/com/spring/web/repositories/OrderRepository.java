package com.spring.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
