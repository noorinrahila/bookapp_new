package com.book.bookapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.book.bookapplication.model.Book;
import com.book.bookapplication.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

	

}