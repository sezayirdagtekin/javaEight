package com.sezo.stream;

import java.util.stream.Stream;

public class StreamChars {

	public static void main(String[] args) {

		String testString = "Java";
		Stream<Character> stream = testString.chars().mapToObj(c -> (char) c);

		stream.forEach(System.out::println);

	}

}
