package com.book.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bookapplication.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
