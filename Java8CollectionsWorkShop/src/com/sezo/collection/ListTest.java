package com.sezo.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Java","C++","php","spring","Anguar");
		names.sort(Comparator.naturalOrder());
	    names.replaceAll(s-> s.toUpperCase());
		names.forEach(System.out::println);
	}

}
