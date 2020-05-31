package com.sezo.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MapsDefaultValue {

	public static void main(String[] args) {

		Consumer<String> printer = System.out::println;

		Person p1 = new Person("Sezayir", 25);
		Person p2 = new Person("Cem", 28);
		Person p3 = new Person("Ali", 19);

		Person p4 = new Person("John", 17);
		Person p5 = new Person("Catrine", 58);
		Person p6 = new Person("Sam", 61);
		List<Person> people = new ArrayList<Person>(Arrays.asList(p1, p2, p3, p4, p5, p6));

		City c1 = new City("Paris");
		City c2 = new City("Berlin");
		City c3 = new City("Tokyo");

		Map<City, List<Person>> map = new HashMap<City, List<Person>>();
		printer.accept("People from Paris return null:"+map.get(c1));
		printer.accept("People from Paris return empty list:"+map.getOrDefault(c1, Collections.EMPTY_LIST));
		
		 map.putIfAbsent(c1, new ArrayList<>());
		 map.get(c1).add(p1);
		// printer.accept(map.get(c1).toString());
	    printer.accept("People from Paris "+map.getOrDefault(c1, Collections.EMPTY_LIST));
	    
	    map.computeIfAbsent(c2, city-> new ArrayList<>()).add(p2);
	    map.computeIfAbsent(c2, city-> new ArrayList<>()).add(p3);
	    printer.accept("People from Berlin "+map.getOrDefault(c2, Collections.EMPTY_LIST));

	}

}
