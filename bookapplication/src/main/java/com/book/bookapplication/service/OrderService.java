package com.book.bookapplication.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookapplication.model.Order;

import com.book.bookapplication.repository.OrderRepository;

@Service
public class OrderService {


	
	
	@Autowired
	private OrderRepository orderRepo;


	public void save(Order order) {
		orderRepo.save(order);
		
	}

}
