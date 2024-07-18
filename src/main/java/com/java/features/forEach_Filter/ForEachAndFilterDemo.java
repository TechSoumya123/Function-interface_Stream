package com.java.features.forEach_Filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class ForEachAndFilterDemo {

	final static Logger LOGGER = Logger.getLogger(ForEachAndFilterDemo.class.getName());

	public static void main(String[] args) {

		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Marry");
		listOfStrings.add("John");
		listOfStrings.add("Peter");
		listOfStrings.add("Morphy");

		List<String> listOfStringsWithNull = new ArrayList<>();
		listOfStringsWithNull.add("Marry");
		listOfStringsWithNull.add("John");
		listOfStringsWithNull.add("Peter");
		listOfStringsWithNull.add("Morphy");
		listOfStringsWithNull.add(null);

		listOfStrings.stream().forEach(System.out::println);

		LOGGER.info("------------------------ooooooo--------------------");

		listOfStringsWithNull.stream().filter(p -> p != null).forEach(System.out::println);

		LOGGER.info("------------------------ooooooo--------------------");

		Map<Integer, String> exampleOfMap = new HashMap<>();
		exampleOfMap.put(1, "One");
		exampleOfMap.put(2, "Two");
		exampleOfMap.put(3, "Three");
		exampleOfMap.put(4, "Four");

		exampleOfMap.forEach((k, v) -> System.out.println(k + " = " + v));

		LOGGER.info("------------------------ooooooo--------------------");

		exampleOfMap.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " = " + s.getValue()));

		LOGGER.info("-----entrySet()-------------------ooooooo--------------------");

		// TODO internal Implementation
		Consumer<String> consumerIterate = t -> System.out.println(t);
		for (String t : listOfStrings) {
			consumerIterate.accept(t);
		}

		LOGGER.info("--------------oooooooo-------------Filter--------------oooooooooo-------------");

		listOfStrings.stream().filter(s -> s.startsWith("M")).forEach(System.out::println);

		LOGGER.info("--------------oooooooo-------------Filter--------------oooooooooo-------------");

		exampleOfMap.entrySet().stream().filter(t -> t.getKey() % 2 != 1)
				.forEach(s -> System.out.println(s.getKey() + " = " + s.getValue()));

	}

}
