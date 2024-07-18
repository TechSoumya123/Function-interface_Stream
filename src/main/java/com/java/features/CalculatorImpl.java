package com.java.features;

interface Calculator {

	int subtract(int num1, int num2);
}

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator calculator = (a, b) -> a - b;
		System.out.println(calculator.subtract(10, 10));
	}

}
