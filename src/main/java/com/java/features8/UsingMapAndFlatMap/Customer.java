package com.java.features8.UsingMapAndFlatMap;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private int id;
	private String name;
	private String email;
	private List<String> phoneNumbers = new ArrayList<>();

}
