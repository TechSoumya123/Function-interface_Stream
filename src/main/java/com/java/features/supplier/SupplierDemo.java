package com.java.features.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class SupplierDemo {

	final static Logger LOGGER = Logger.getLogger(SupplierDemo.class.getName());

	public static void main(String[] args) {

		Supplier<Integer> supplierExample = () -> 2 + 3;
		System.out.println(supplierExample.get());

		LOGGER.info("-------------------------------");

		List<Integer> listOfStrings = Arrays.asList();

		System.out.println(listOfStrings.stream().findAny().orElseGet(() -> 5 + 8));
	}

}
