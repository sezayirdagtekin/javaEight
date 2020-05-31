package com.sezo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapOfMap {

	public static void main(String[] args) {

		Map<String, Map<Integer, String>> map= new HashMap<>();
		map.computeIfAbsent("one", val-> new HashMap<>()).put(1, "Java");
		map.computeIfAbsent("second", val-> new HashMap<>()).put(2, "Spring");

		System.out.println(map);

	}

}
