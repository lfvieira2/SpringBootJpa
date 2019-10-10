package com.spring.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.entities.Category;
import com.spring.web.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
