package com.example.books.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.books.entities.Book;
import com.example.books.entities.Type;

@RepositoryRestResource(path = "rest")
public interface BookRepository extends JpaRepository<Book, Long> {
	 List<Book> findByTitleBook(String title);
	 List<Book> findByTitleBookContains(String title);
	 @Query("select b from Book b where b.title like %?1 and b.pages > ?2")
	 List<Book> findByTitlePages (@Param("title") String title, int pages);
	 @Query("select b from Book b where b.type = ?1")
	 List<Book> findByType (Type type);
	 List<Book> findByTypeId(Long id);
	 List<Book> findByOrderByTitleBookAsc();
	 @Query("select b from Book b order by b.title ASC, b.pages DESC")
	 List<Book> trierBooksTitlePages ();
}