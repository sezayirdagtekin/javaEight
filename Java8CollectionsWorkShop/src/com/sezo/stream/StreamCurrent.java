package com.sezo.stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamCurrent {

	public static void main(String[] args) {

		Stream<Integer> numbers = Stream.generate(() -> ThreadLocalRandom.current().nextInt(0, 100)).limit(10);

		numbers.forEach(System.out::println);

	}

}
