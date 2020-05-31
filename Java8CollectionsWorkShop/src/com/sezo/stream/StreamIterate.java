package com.sezo.stream;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		

		Stream<Integer> numbers = Stream.iterate(0, n->n+1).limit(10);	
		numbers.forEach(System.out::println);
		
		System.out.println("Even numbers");
		
		Stream<Integer> evenNumbers = Stream.iterate(0, n->n+1).filter(x-> x%2==0).limit(10);	
		evenNumbers.forEach(System.out::println);


		
		int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0]) // Stream<Integer>
                .mapToInt(n -> n)
                .sum();

        System.out.println("Fibonacci 10 sum : " + sum);
	}

}
