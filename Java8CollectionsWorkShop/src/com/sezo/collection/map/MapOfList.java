package com.sezo.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapOfList {

	public static void main(String[] args) {

		Map<Integer, ArrayList<String>> map= new HashMap<>();
		map.computeIfAbsent(1, val-> new ArrayList<>()).add("Java");
		map.computeIfAbsent(2, val-> new ArrayList<>()).add("Spring");

		System.out.println(map);

	}

}
