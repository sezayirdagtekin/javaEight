package com.sezo.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		// Java 7
		Consumer<String> printer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		printer.accept("Lamda consumer");

		// java 8
		Consumer<String> consumer = System.out::println;
		consumer.accept("java 8 version...");

	}

}
