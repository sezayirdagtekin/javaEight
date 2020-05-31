package com.sezo.stream;

import java.util.stream.Stream;

public class StreemBuilder {

	public static void main(String[] args) {

		Stream.Builder<String> builder = Stream.builder();
		// by chaining add()
		builder.add("one").add("two");
		// or use accept
		builder.accept("third");

		Stream<String> stream = builder.build();
		stream.forEach(System.out::println);

	}

}
