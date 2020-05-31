package com.sezo.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSkipLimit {

	public static void main(String[] args) {

		Stream.of("zero","one", "two", "three", "four","five","six","seven","eight","ten")
		        .skip(2)
		        .filter(s -> s.length() > 3)
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
