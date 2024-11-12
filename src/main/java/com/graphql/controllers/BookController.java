package com.graphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.graphql.input.model.BookInput;
import com.graphql.models.Book;
import com.graphql.service.IBookService;

@Controller
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@MutationMapping("createBook")
	public Book createBook(@Argument BookInput book) {
		Book book1 = Book.builder()
				.title(book.getTitle())
				.desc(book.getDesc())
				.author(book.getAuthor())
				.price(book.getPrice())
				.pages(book.getPages())
				.build();
		return this.bookService.createBook(book1);
	}
	

	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	
	@QueryMapping("getBook")
	public Book getBook(@Argument Integer id) {
		return this.bookService.getSingleBook(id);
	}
	
	@QueryMapping("allBooks")
	public List<Book> getAllBook() {
		return this.bookService.getAllBooks();
	}
}
