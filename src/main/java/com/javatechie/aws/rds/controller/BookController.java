package com.javatechie.aws.rds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.aws.rds.entity.Book;
import com.javatechie.aws.rds.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}

}
