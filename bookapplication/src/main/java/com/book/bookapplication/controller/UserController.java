package com.book.bookapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.bookapplication.model.User;
import com.book.bookapplication.repository.UserRepository;
import com.book.bookapplication.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String login() {
		return "register";
	}

	@PostMapping("/save")
	public String add_user(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password) throws Exception {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		userService.save(user);

		return "login";
	}

	@GetMapping("/login")
	public String login_user() {
		return "login";
	}

	@PostMapping("/validate")
	public String findByEmailAndPassword(@RequestParam("email") String email,
			@RequestParam("password") String password) {

		User user = userRepo.findByEmailAndPassword(email, password);
		if (user != null) {
			System.out.println("valid user");
			return "book";
		} else {
			System.out.println("invalid user");
			return "register";

		}

	}

}
