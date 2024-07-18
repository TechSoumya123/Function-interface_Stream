package com.java.features.book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

	private BookRepository() {
	}

	public static List<Book> fetchAllBooks() {

		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(363, "Hibernate", 100));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "WebServices", 300));
		return books;
	}
}
