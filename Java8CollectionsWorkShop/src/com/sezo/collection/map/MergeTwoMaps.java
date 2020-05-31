package com.sezo.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeTwoMaps {

	public static void main(String[] args) {

		Person p1 = new Person("Sezayir", 25);
		Person p2 = new Person("Cem", 28);
		Person p3 = new Person("Ali", 19);
		Person p4 = new Person("John", 17);
		Person p5 = new Person("Catrine", 58);
		Person p6 = new Person("Sam", 61);


		City c1 = new City("Paris");
		City c2 = new City("Berlin");
		City c3 = new City("Tokyo");

		Map<City, List<Person>> map1 = new HashMap<City, List<Person>>();
	    map1.computeIfAbsent(c1, city-> new ArrayList<>()).add(p1);
	    map1.computeIfAbsent(c2, city-> new ArrayList<>()).add(p2);
	    map1.computeIfAbsent(c3, city-> new ArrayList<>()).add(p3);
	    
	    System.out.println("Map 1:");
	    map1.forEach( (city,people) -> System.out.println(city +":"+people));

		Map<City, List<Person>> map2 = new HashMap<City, List<Person>>();
	    map2.computeIfAbsent(c3, city-> new ArrayList<>()).add(p4);
	    map2.computeIfAbsent(c1, city-> new ArrayList<>()).add(p5);
	    map2.computeIfAbsent(c2, city-> new ArrayList<>()).add(p6);
		
	    System.out.println("Map 2:");
	    map2.forEach( (city,people) -> System.out.println(city +":"+people));
	    
	    map2.forEach((city,people)->{
	    	map1.merge(city, people, (peopleMap1,peopleMap2)->{
	    		peopleMap1.addAll(peopleMap2);
	    		return peopleMap1;
	    	});
 	
	    });
	    
	    System.out.println("After merge :");
	    
	    map1.forEach( (city,people) -> System.out.println(city +":"+people));
	   
	}

}
