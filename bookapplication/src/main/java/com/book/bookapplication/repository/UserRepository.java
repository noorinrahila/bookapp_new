package com.book.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bookapplication.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailAndPassword(String email ,String password);
}
