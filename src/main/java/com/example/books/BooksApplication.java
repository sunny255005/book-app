package com.example.books;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.books.entities.Book;
import com.example.books.service.BookService;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner {
	
	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		bookService.saveBook(new Book("book 1", "author 1", 20, new Date()));
		bookService.saveBook(new Book("book 2", "author 2", 20, new Date()));
		bookService.saveBook(new Book("book 3", "author 3", 20, new Date()));
	}

}
