package com.java.features.book;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class BookService {

	final static Logger logger = Logger.getLogger(BookService.class.getName());

	static List<Book> getAllBooks() {
		List<Book> list = BookRepository.fetchAllBooks();
		Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return list;
	}

	static List<Book> getAllBooksReveredOrder() {
		List<Book> list = BookRepository.fetchAllBooks();
		Collections.sort(list, (o1, o2) -> o2.getName().compareTo(o1.getName()));
		return list;
	}

	public static void main(String[] args) {

		getAllBooks().forEach(System.out::println);

		logger.info(() -> "----------------------------------------------------------------");

		getAllBooksReveredOrder().forEach(System.out::println);
	}

}
