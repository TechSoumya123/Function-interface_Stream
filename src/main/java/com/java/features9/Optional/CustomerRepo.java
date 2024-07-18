package com.java.features9.Optional;

import java.util.Arrays;

public class CustomerRepo {

	public static Customer getCustomer() {
		return new Customer(101, "Ajay", "ajay@gmai.com", Arrays.asList("6879899", "763879793"));

	}

	public static Customer getCustomerWithNull() {
		return new Customer(102, "ohho", null, Arrays.asList("1234658791", "1092835716"));

	}
}
