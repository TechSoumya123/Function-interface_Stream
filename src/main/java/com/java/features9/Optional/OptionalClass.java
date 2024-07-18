package com.java.features9.Optional;

import java.util.Optional;
import java.util.logging.Logger;

public class OptionalClass {

	final static Logger LOGGER = Logger.getLogger(OptionalClass.class.getName());

	final static Customer CUSTOMERS_CUSTOMER = CustomerRepo.getCustomer();

	final static Customer CUSTOMER = CustomerRepo.getCustomerWithNull();

	public static void main(String[] args) {

		Optional<Object> empty = Optional.empty();
		System.out.println(empty);

		LOGGER.info(() -> "----------------------------------------------------");

		Optional<String> ofNullable = Optional.ofNullable(CUSTOMERS_CUSTOMER.getEmail());
		System.out.println(ofNullable.get());

		LOGGER.info(() -> "----------------------------------------------------");

		Optional<String> optional = Optional.ofNullable(CUSTOMER.getEmail());

		System.out.println(optional.orElseGet(() -> "ok............."));

		LOGGER.info(() -> "----------------------------------------------------");
	}

}
