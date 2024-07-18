package com.java.features8.UsingMapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomerRepo {

	public static List<Customer> getList() {

		return Stream
				.of(new Customer(101, "Ajay", "ajay@gmail.com", Arrays.asList("6879899", "763879793")),
						new Customer(102, "Smith", "smith@hotmail.com", Arrays.asList("3927890910", "4567890098")),
						new Customer(103, "petter", "petter@hotmail.com", Arrays.asList("1234567809", "5678909876")),
						new Customer(104, "kely", "kely@hotmail.com", Arrays.asList("345634509", "987098745")))
				.toList();
	}
}
