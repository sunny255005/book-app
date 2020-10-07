package com.example.books.controllers;

import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.books.entities.Book;
import com.example.books.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createBook";
	}
	
	@RequestMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book, @RequestParam("date") String date, ModelMap modelMap) 
	throws ParseException {
		//conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		book.setDateCreation(dateCreation);
		Book saveBook = bookService.saveBook(book);
		String msg ="book saved with Id "+saveBook.getId();
		modelMap.addAttribute("msg", msg);
		return "createBook";
	}
	
	@RequestMapping("/bookList")
	public String listBooks(ModelMap modelMap) {
		List<Book> books = bookService.getAllBooks();
		modelMap.addAttribute("books", books);
		return "bookList";
	}
	
	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam("id") Long id, ModelMap modelMap) {
		bookService.deleteBookById(id);
		List<Book> books = bookService.getAllBooks();
		modelMap.addAttribute("produits", books);
		return "bookList";
	}
	
	@RequestMapping("/modifyBook")
	public String modifyBook(@RequestParam("id") Long id,ModelMap modelMap) {
		Book book = bookService.getBook(id);
		modelMap.addAttribute("book", book);
		return "editBook";
	}
	
	@RequestMapping("/updateBook")
	public String updateBook(@ModelAttribute("book") Book book,
	@RequestParam("date") String date,
		 ModelMap modelMap) throws ParseException {
		 //conversion de la date
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date dateCreation = dateformat.parse(String.valueOf(date));
		 book.setDateCreation(dateCreation);
		 bookService.updateBook(book);
		 List<Book> books = bookService.getAllBooks();
		 modelMap.addAttribute("books", books);
		 return "bookList";
	}
	
}
