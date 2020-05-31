package com.sezo.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenarete {

	public static void main(String[] args) {

		List<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(100)).limit(10)
				.collect(Collectors.toList());
		randomNumbers.forEach(System.out::println);

	}

}
