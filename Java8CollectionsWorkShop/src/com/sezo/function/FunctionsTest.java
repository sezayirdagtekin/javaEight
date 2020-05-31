package com.sezo.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionsTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(25);
		p.setName("sezayir");
		
		//Java 7
		Function<Person, Integer> f = new Function<Person, Integer>() {
			@Override
			public Integer apply(Person p) {
				return p.getAge();
			}
		};
		int age = f.apply(p);
		System.out.println(age);
		
		Consumer<String> printer= System.out::println;
		//Function<Person, String> lamda= person-> person.getName();
		Function<Person, String> lamda=Person::getName;
		printer.accept(lamda.apply(p));
	}

}
