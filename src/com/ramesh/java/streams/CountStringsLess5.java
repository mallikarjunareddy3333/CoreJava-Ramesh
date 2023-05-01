package com.ramesh.java.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.management.ValueExp;
import javax.xml.validation.Validator;

public class CountStringsLess5 {
	
	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<String>();
//    	names.add("Jai");
//    	names.add("Mahesh");
//    	names.add("Ajay");
//    	names.add("Hemant");
//    	names.add("Vishal");
//    	
//    	long count = names.stream().filter((name) -> {return name.length() < 5;}).count();
//    	
//    	names.stream().filter((name) -> {return name.length() < 5;}).forEach((name) -> System.out.println(name));
//    	
//    	System.out.println(count + " strings with length less than 5");
//    	
//    	List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
//    	
//    	
//    	upperCaseNames.forEach((name) -> System.out.println(name));
    	
    	// Create a Map
        Map<Integer, String> map = new HashMap<>();
  
        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");
  
        // Print the Map
        System.out.println("Map: " + map);
        
     // Convert the Map to Stream
        
        Map<Object, Object> upperMap = map.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().toUpperCase()));
    	
    	System.out.println(upperMap);
	}
	
}
