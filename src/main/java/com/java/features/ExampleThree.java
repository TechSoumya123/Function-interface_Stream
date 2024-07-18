package com.java.features;

@FunctionalInterface
interface IExampleThree {

	void switchOn();
}

public class ExampleThree {

	public static void main(String[] args) {
		IExampleThree calculator = () -> System.out.println("Switch On");
		calculator.switchOn();
	}

}
