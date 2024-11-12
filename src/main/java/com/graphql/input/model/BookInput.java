package com.graphql.input.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookInput {
	
	private String title;
	private String desc;
	private String author;
	private double price;
	private int pages;
}
