package com.java.features9.Optional;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> phoneNumbers = new ArrayList<>();
}
