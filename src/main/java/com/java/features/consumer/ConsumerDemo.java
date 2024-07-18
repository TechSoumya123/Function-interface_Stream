package com.java.features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class ConsumerDemo {

	final static Logger LOGGER = Logger.getLogger(ConsumerDemo.class.getName());

	public static void main(String[] args) {

		Consumer<String> consumer1 = t -> System.out.println(t);
		consumer1.accept("Consumer Interface....");

		LOGGER.info(() -> "------------------------------------------------------------");

		Consumer<Integer> grasConsumer = t -> System.out.println(t);
		grasConsumer.accept(10);

		LOGGER.info(() -> "------------------------------------------------------------");

		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
		listOfIntegers.stream().forEach(grasConsumer);

	}

}
