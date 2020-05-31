package com.sezo.collection.map;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {

		// create a HashMap and add some values
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("e", 5);

		// print original map
		System.out.println("HashMap:\n " + map.toString());

		// put a new value which is not mapped
		// before in map
		map.putIfAbsent("d", 4);

		// print newly mapped map
		System.out.println("New HashMap:\n " + map);

		map.putIfAbsent("f", 88); // will be add
		map.putIfAbsent("e", 77); // does not add
		// print newly mapped map
		System.out.println("Last HashMap:\n " + map);

	}

}
