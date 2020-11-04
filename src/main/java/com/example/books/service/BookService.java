package com.example.books.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.books.entities.Book;
import com.example.books.entities.Type;

public interface BookService {
	Book saveBook(Book book);
	Book updateBook(Book book);
	void deleteBook(Book book);
	void deleteBookById(Long id);
	Book getBook(Long id);
	List<Book> getAllBooks();
	Page<Book> getAllBooksParPage(int page, int size);
	List<Book> findByTitleBook(String title);
	List<Book> findByTitleBookContains(String title);
	List<Book> findByTitlePages (String title, int pages);
	List<Book> findByType (Type type);
	List<Book> findByTypeId(Long id);
	List<Book> findByOrderByTitleBookAsc();
	List<Book> trierBooksTitlePages ();
}
