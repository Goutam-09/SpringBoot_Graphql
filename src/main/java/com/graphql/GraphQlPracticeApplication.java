package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.models.Book;
import com.graphql.service.IBookService;

@SpringBootApplication
public class GraphQlPracticeApplication implements CommandLineRunner{

	@Autowired
	private IBookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphQlPracticeApplication.class, args);
	}

	
	  @Override public void run(String... args) throws Exception {
	  
	  Book book1 = Book.builder() .title("C Programming")
	  .desc("This is fundamental of programming language")
	  .author("Dennis Ritchie") .price(500) .pages(1000) .build();
	  
	  Book book2 = Book.builder() .title("C++")
	  .desc("This is advance of C programming language")
	  .author("Bjarne Stroustrup") .price(750) .pages(5000) .build();
	  
	  Book book3 = Book.builder() .title("Java")
	  .desc("This is Strong programming language") .author("James Gosling")
	  .price(1570.50) .pages(8000) .build();
	  
	  Book book4 = Book.builder() .title("Python")
	  .desc("This is Alphabetical Based programming language")
	  .author("I dnt know") .price(1650.11) .pages(8000) .build();
	  
	  Book book5 = Book.builder() .title("ROR")
	  .desc("This is programming language") .author("God Father") .price(560.56)
	  .pages(6000) .build();
	  
	  Book book6 = Book.builder() .title("Word Press")
	  .desc("This is used for website creation") .author("Unknown") .price(400)
	  .pages(3000) .build();
	  
	  bookService.createBook(book1); bookService.createBook(book2);
	  bookService.createBook(book3); bookService.createBook(book4);
	  bookService.createBook(book5); bookService.createBook(book6);
	  
	  }
	 

}
