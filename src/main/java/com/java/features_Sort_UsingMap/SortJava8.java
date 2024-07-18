package com.java.features_Sort_UsingMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class SortJava8 {

	final static Logger LOGGER = Logger.getLogger(SortJava8.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> stringAndValueMap = new HashMap<>();
		stringAndValueMap.put("eight", 8);
		stringAndValueMap.put("four", 4);
		stringAndValueMap.put("ten", 10);
		stringAndValueMap.put("two", 2);

		List<Entry<String, Integer>> entriesList = new ArrayList<>(stringAndValueMap.entrySet());

		Collections.sort(entriesList, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Entry<String, Integer> entry : entriesList) {
			System.out.println(entry.getKey() + " =  " + entry.getValue());
		}

		LOGGER.info("-----------------------------------------");

		List<Entry<String, Integer>> entriesList1 = new ArrayList<>(stringAndValueMap.entrySet());

		Collections.sort(entriesList1, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		for (Entry<String, Integer> entry : entriesList1) {
			System.out.println(entry.getKey() + " =  " + entry.getValue());
		}

		LOGGER.info("-----------------------------------------");

		stringAndValueMap.entrySet().stream().sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey()))
				.forEach(s -> System.out.println(s.getKey() + " = " + s.getValue()));

		LOGGER.info("-------------Direct Comparator.compareTo()----------------------------");

		stringAndValueMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(s -> System.out.println(s.getKey() + " = " + s.getValue()));

		LOGGER.info("-------------comparingByKey()------------------------------------");

		stringAndValueMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(s -> System.out.println(s.getKey() + " = " + s.getValue()));

		LOGGER.info("----------------comparingByValue()----------------------------");

		EmployeeRepo.getEmployeesList().entrySet().stream()
				.sorted((o1, o2) -> (int) (o1.getKey().getSalary() - o2.getKey().getSalary()))
				.forEach(System.out::println);

		LOGGER.info("-----------------------------------------");

		EmployeeRepo.getEmployeesList().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);

		LOGGER.info("---------------------------ok--------------");

		EmployeeRepo.getEmployeesList().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
				.forEach(System.out::println);
	}

}
