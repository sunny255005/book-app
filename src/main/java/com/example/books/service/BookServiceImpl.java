package com.example.books.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.books.entities.Book;
import com.example.books.entities.Type;
import com.example.books.repos.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Page<Book> getAllBooksParPage(int page, int size) {
		return bookRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Book> findByTitleBook(String title) {
		return bookRepository.findByTitleBook(title);
	}

	@Override
	public List<Book> findByTitleBookContains(String title) {
		return bookRepository.findByTitleBookContains(title);
	}

	@Override
	public List<Book> findByTitlePages(String title, int pages) {
		return bookRepository.findByTitlePages(title, pages);
	}

	@Override
	public List<Book> findByType(Type type) {
		return bookRepository.findByType(type);
	}

	@Override
	public List<Book> findByTypeId(Long id) {
		return bookRepository.findByTypeId(id);
	}

	@Override
	public List<Book> findByOrderByTitleBookAsc() {
		return bookRepository.findByOrderByTitleBookAsc();
	}

	@Override
	public List<Book> trierBooksTitlePages() {
		return bookRepository.trierBooksTitlePages();
	}

}
