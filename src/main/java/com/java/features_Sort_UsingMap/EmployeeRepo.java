package com.java.features_Sort_UsingMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeRepo {

	public static Map<Employee, Integer> getEmployeesList() {

		Map<Employee, Integer> listOfMapOfMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

		listOfMapOfMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		listOfMapOfMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		listOfMapOfMap.put(new Employee(470, "Bimal", "ARMY", 500000), 50);
		listOfMapOfMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		listOfMapOfMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);
		return listOfMapOfMap;
	}
}
