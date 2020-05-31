package com.sezo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {
	
	public static void main(String[] args) {
		
		List<String>  list= Arrays.asList("A","B","C","D");
		Optional<String> op= list.stream().findFirst();
		
		System.out.println(op.isPresent());
		System.out.println(op.get());
		
	   op = list.stream().findAny();
		
		System.out.println(op.isPresent());
		System.out.println(op.get());
	}
	}
	
	
