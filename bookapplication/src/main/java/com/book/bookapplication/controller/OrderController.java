package com.book.bookapplication.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.bookapplication.model.Order;
import com.book.bookapplication.model.OrderItem;
import com.book.bookapplication.repository.OrderRepository;
import com.book.bookapplication.service.OrderService;

@Controller
@RequestMapping("/order")

public class OrderController {

	@Autowired
	OrderRepository orderRepo;

	@Autowired
	OrderService orderservice;

	@GetMapping("/remove")
	public String remove(@RequestParam("id") Integer id, HttpSession session, ModelMap modelMap) {

		Order order = (Order) session.getAttribute("MY_CART");

		if (order != null && order.getOrderItems().size() > 0) {
			List<OrderItem> orderItems = order.getOrderItems();

			OrderItem itemSelected = orderItems.get(id);
			orderItems.remove(itemSelected);
			order.setOrderItems(orderItems);
			session.setAttribute("MY_CART", order);
		}

		return "orderlist";

	}

	@PostMapping("/save")
	public String save(@RequestParam("total_amount") Float totalAmount, HttpSession session) {
		System.out.println(totalAmount);
		Order orderInsideCart = (Order) session.getAttribute("MY_CART");
		if (orderInsideCart != null && orderInsideCart.getOrderItems().size() > 0) {
		
            orderInsideCart.setTotalPrice(totalAmount.intValue());
			orderservice.save(orderInsideCart);
			session.removeAttribute("MY_CART");
		}

		return "booklist";
	}

}
