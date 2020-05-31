package com.sezo.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> add= (a,b)-> System.out.print(a+b);
	     add.accept(3, 5);
		
	}

}
