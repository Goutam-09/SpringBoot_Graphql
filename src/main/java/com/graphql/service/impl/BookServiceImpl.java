package com.graphql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.models.Book;
import com.graphql.repositories.BookRepository;
import com.graphql.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book createBook(Book book) {
		return this.bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		return this.createBook(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return this.bookRepository.findAll();
	}

	@Override
	public Book getSingleBook(int id) {
		return this.bookRepository.findById(id).get();
	}

}
