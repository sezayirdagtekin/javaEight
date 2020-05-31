package com.sezo.stream;

import java.util.stream.Stream;

public class StreamBasic {

	public static void main(String[] args) {

		Stream<Object> stream1 = Stream.empty();
		print(stream1);
		
		Stream<String> stream2  = Stream.of("one");
		print(stream2);
		Stream<Integer> stream3  = Stream.of(1,2,3);
		print(stream3);
	}

	public static void print(Stream<?> stream) {
		System.out.println("print value:");
		stream.forEach(System.out::println);

	}

}
