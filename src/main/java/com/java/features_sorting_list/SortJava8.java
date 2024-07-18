package com.java.features_sorting_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

import com.java.features_Employee.Database;
import com.java.features_Employee.Employee;

public class SortJava8 {

	final static Logger LOGGER = Logger.getLogger(SortJava8.class.getName());

	public static void main(String[] args) {

		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(7);
		listOfIntegers.add(90);
		listOfIntegers.add(12);
		listOfIntegers.add(1);
		listOfIntegers.add(97);

		Collections.sort(listOfIntegers);
		System.out.println(listOfIntegers);

		LOGGER.info("--------------------------ooooooooooo----------------------");

		Collections.sort(listOfIntegers);
		Collections.reverse(listOfIntegers);
		System.out.println(listOfIntegers);

		LOGGER.info("--------------------------ooooooooooo----------------------");

		listOfIntegers.stream().sorted().forEach(s -> System.out.println("  " + s));

		LOGGER.info("--------------------------ooooooooooo----------------------");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println("  " + s));

		LOGGER.info("--------------------------ooooooooooo----------------------");

		List<Employee> employeesList = Database.getEmployeesList();

		employeesList.stream().sorted(Comparator.comparing(Employee::getSalary))
				.map(emp -> emp.getName() + " = " + emp.getSalary()).forEach(s -> System.out.println("  " + s));

		LOGGER.info("--------------------------ooooooooooo----------------------");

		employeesList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.forEach(s -> System.out.println("  " + s));

		LOGGER.info("--------------------------ooooooooooo----------------------");

		employeesList.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName))
				.forEach(System.out::println);
	}

}
