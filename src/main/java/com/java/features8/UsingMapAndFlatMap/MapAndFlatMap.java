package com.java.features8.UsingMapAndFlatMap;

import java.util.List;
import java.util.logging.Logger;

public class MapAndFlatMap {

	final static Logger LOGGER = Logger.getLogger(MapAndFlatMap.class.getName());

	final static List<Customer> LISTOF_CUSTOMERS = CustomerRepo.getList();

	public static void main(String[] args) {

		LISTOF_CUSTOMERS.stream().map(Customer::getEmail).forEach(s -> System.out.println(" Email : " + s));

		LOGGER.info("----------------------------------------------");

		List<String> ListOfPhones = LISTOF_CUSTOMERS.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.toList();
		System.out.println(ListOfPhones);

		LOGGER.info("----------------------------------------------");

	}

}
