package com.sezo.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeek {

	public static void main(String[] args) {

		Stream.of("one", "two", "three", "four").filter(s -> s.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(k -> k.toUpperCase())
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
