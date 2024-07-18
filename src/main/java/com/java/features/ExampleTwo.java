package com.java.features;

@FunctionalInterface
interface IExampleTwo {

	void sum(int num);
}

public class ExampleTwo {
	public static void main(String[] args) {
		IExampleTwo check = num -> System.out.println(num + 5);
		check.sum(90);
	}

}
