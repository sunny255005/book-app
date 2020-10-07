package com.example.books.service;

import java.util.List;
import com.example.books.entities.Book;

public interface BookService {
	Book saveBook(Book book);
	Book updateBook(Book book);
	void deleteBook(Book book);
	void deleteBookById(Long id);
	Book getBook(Long id);
	List<Book> getAllBooks();
}
