package com.sezo.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MapOperations {

	public static void main(String[] args) {
		
		Consumer<String> printer= System.out::println;

		Person p1= new Person("Sezayir", 25);
		Person p2= new Person("Cem", 28);
		Person p3= new Person("Ali", 19);

		Person p4= new Person("John", 17);
		Person p5= new Person("Catrine", 58);
		Person p6= new Person("Sam", 61);
		
		List<Person> people= new ArrayList<Person>(Arrays.asList(p1,p2,p3,p4,p5,p6));
		printer.accept("Initial List:");
		people.forEach(System.out::println);
		
		printer.accept("After removin age > 60");
		people.removeIf(p->p.getAge() > 60);
		people.forEach(System.out::println);
		
		printer.accept("After Uppercase name and sort by age ");
        people.replaceAll(p-> new Person(p.getName().toUpperCase(),p.getAge()));
        people.sort(Comparator.comparing(Person::getAge));
		people.forEach(System.out::println);

	}

}
