package com.java.features.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class PredicateDemo {

	final static Logger LOGGER = Logger.getLogger(PredicateDemo.class.getName());

	public static void main(String[] args) {

		Predicate<Integer> evenOrOddPredicate = t -> t % 2 == 0;

		System.out.println(evenOrOddPredicate.test(13));

		LOGGER.info(() -> "---------------------------------------------------");

		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		listOfIntegers.stream().filter(t -> t % 2 != 1).forEach(System.out::println);

	}

}
