package com.sezo.collection.map;

import java.util.HashMap;

public class MapReplace {

	public static void main(String[] args) {

		// create a HashMap and add some values
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("e", 5);

		// print original map
		System.out.println("HashMap:\n " + map.toString());
        map.replace("e", 9);
        map.replaceAll((key, oldval)-> oldval*2);
		// print newly mapped map
		System.out.println("New HashMap:\n " + map);


	}

}
