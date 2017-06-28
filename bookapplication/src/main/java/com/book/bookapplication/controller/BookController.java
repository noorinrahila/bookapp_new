package com.book.bookapplication.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.bookapplication.model.Book;
import com.book.bookapplication.service.BookService;


@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public String list(ModelMap modelMap) {

		System.out.println("Listing the book");
		List<Book> booksList = bookService.findAll();
		modelMap.addAttribute("BOOK_LIST",booksList);
		System.out.println(booksList);

		return "booklist";
	}
@GetMapping("/{id}")
	
	public String view(@PathVariable("id") Long id,ModelMap modelMap,HttpSession session)
	{
		System.out.println("ShowBook:" + id);
		
		Book book =bookService.findOne(id);
		session.setAttribute("book",book);
		modelMap.addAttribute("BOOK_ORDER", book);

		return "view";
		
	}

	
	

}