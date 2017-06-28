package com.book.bookapplication.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bookapplication.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

	public Order findById(int id);
}