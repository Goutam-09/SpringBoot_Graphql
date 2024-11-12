package com.graphql.service;

import java.util.List;

import com.graphql.models.Book;

public interface IBookService {

	public Book createBook(Book book);
	public Book updateBook(Book book);
	public List<Book> getAllBooks();
	public Book getSingleBook(int id);
} 
