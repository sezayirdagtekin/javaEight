package com.sezo.supplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		// Java 7
		Supplier<Person> supplier = new Supplier<Person>() {
			@Override
			public Person get() {
				return new Person();
			}
		};

		Person p = supplier.get();
		p.setAge(25);
		p.setName("sezayir");

		Consumer<Person> printer = System.out::println;
		printer.accept(p);

		// Java 8
		// Supplier<Person> lamda= ()-> new Person();
		Supplier<Person> lamda = Person::new;
		p = lamda.get();
		p.setAge(28);
		p.setName("Jane");
		printer.accept(p);
	}

}
