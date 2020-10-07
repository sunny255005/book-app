package com.example.books.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.books.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
}