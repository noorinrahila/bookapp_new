package com.book.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bookapplication.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
