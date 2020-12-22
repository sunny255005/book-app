package com.example.books.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.books.entities.Book;

@RepositoryRestResource()
public interface BookRepository extends JpaRepository<Book, Long> {}