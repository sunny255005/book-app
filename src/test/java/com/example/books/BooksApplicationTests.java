package com.example.books;

import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.books.entities.Book;
import com.example.books.repos.BookRepository;
import com.example.books.service.BookServiceImpl;

import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BooksApplicationTests {
	
	@Autowired
	private BookRepository bookRepository;
	private BookServiceImpl bookService;


	@Test
	public void testCreateBook() {
		Book book = new Book("book 1", "author 1", 50, new Date());
		bookRepository.save(book);
	}
	
	@Test
	public void testFindBook() {
		Book book = bookRepository.findById(1L).get();
		System.out.println(book);
	}
	
	@Test
	public void testUpdateBook() {
		Book book = bookRepository.findById(1L).get();
		book.setPages(51);
		bookRepository.save(book);
	}
	
	@Test
	public void testDeleteBook() {
		bookRepository.deleteById(1L);
	}
	
	@Test
	public void testListBooks() {
		List<Book> books = bookRepository.findAll();
		for (Book book : books) System.out.println(book);
	}
	
	@Test
	public void testFindByNomBookContains() {
		Page<Book> books = bookService.getAllBooksParPage(0,2);
		System.out.println(books.getSize());
		System.out.println(books.getTotalElements());
		System.out.println(books.getTotalPages());
		books.getContent().forEach(p -> {
			System.out.println(p.toString());
		});
	}

	
}
