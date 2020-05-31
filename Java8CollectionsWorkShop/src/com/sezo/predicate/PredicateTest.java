package com.sezo.predicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		// Java 7
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.length() > 5;
			}
		};
		System.out.println(p.test("sezayir"));

		// Java 8
		Consumer<Boolean> printer = System.out::println;
		Predicate<String> pLamda = (s) -> s.length() > 5;
		printer.accept(pLamda.test("sezayir"));
	}

}
