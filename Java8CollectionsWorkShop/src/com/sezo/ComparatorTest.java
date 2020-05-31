package com.sezo;

import java.util.Comparator;
import java.util.function.Consumer;

public class ComparatorTest {

	public static <T> void main(String[] args) {

		Consumer<Integer> consumer= System.out::println;
		
		Comparator<String> comp = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
		String s1 = "java2";
		String s2 = "java";
		int result = comp.compare(s1, s2);
		consumer.accept(result);
	}

}
