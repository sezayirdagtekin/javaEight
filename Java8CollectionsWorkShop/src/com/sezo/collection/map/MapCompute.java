package com.sezo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapCompute {

	public static void main(String[] args) {

		  // Create a Map and add some values 
        Map<String, String> map = new HashMap<>(); 
        map.put("name", "Sezayir"); 
        map.put("adress", "Istanbul"); 
  
        // Print the map 
        System.out.println("Map: " + map); 
        
        // remap the values using compute() method 
        map.compute("name", (key,val)-> val.concat(" Dagtekin"));
        map.compute("adress", (key,val)-> val.concat("/Turkey"));
        
        // print new mapping 
        System.out.println("New Map: " + map); 
        
        map.computeIfAbsent("job", val -> "Developer");

        // print new mapping 
        System.out.println("New Map: " + map); 
        
        map.computeIfPresent("job", (key,val)-> "java ".concat(val) );
        
        // print new mapping 
        System.out.println("New Map: " + map); 



	}

}
