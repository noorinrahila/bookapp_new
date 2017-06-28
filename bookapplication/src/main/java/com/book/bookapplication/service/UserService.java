package com.book.bookapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookapplication.model.User;
import com.book.bookapplication.repository.UserRepository;
import com.book.bookapplication.util.EmailUtil;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	

	@Autowired
	EmailUtil emailUtil;

	public void save(User user) throws Exception {
		userRepo.save(user);
		String subject = "conformation mail";
		String body = "registered successfully";
		emailUtil.send(user.getEmail(), subject, body);
	}

}
