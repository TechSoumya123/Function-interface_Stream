package com.java.features_Employee;

import java.util.List;
import java.util.logging.Logger;

public class EmployeeStreamExample {

	final static Logger LOGGER = Logger.getLogger(EmployeeStreamExample.class.getName());

	final static List<Employee> LISTOF_EMPLOYEES = Database.getEmployeesList();

	public static List<Employee> evaluateTaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? LISTOF_EMPLOYEES.stream().filter(emp -> emp.getSalary() > 500000).toList()
				: LISTOF_EMPLOYEES.stream().filter(emp -> emp.getSalary() <= 500000).toList();

	}

	public static void main(String[] args) {
		evaluateTaxUsers("NO TAX").forEach(System.out::println);
	}

}
