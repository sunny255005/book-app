package com.example.books.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.books.entities.Book;

public interface BookService {
	Book saveBook(Book book);
	Book updateBook(Book book);
	void deleteBook(Book book);
	void deleteBookById(Long id);
	Book getBook(Long id);
	List<Book> getAllBooks();
	Page<Book> getAllBooksParPage(int page, int size);
}
