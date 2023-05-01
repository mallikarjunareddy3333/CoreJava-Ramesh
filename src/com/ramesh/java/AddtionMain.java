package com.ramesh.java;

import java.util.ArrayList;
import java.util.List;

public class AddtionMain {
	public static void main(String[] args) {
		
		Addition addition = (a, b) -> {
			System.out.print(a.concat(b));
		};
		
		List<String> list=new ArrayList<String>();  
        list.add("Jai");  
        list.add("Vivek");  
        list.add("Mahesh");  
        list.add("Vishal");  
        list.add("Naren");  
        list.add("Hemant");  
        list.add("Vikas"); 
        list.add("Ajay");
		
		list.forEach((a) -> {addition.concat(a, " ");});
		
		System.out.println();
		
		list.forEach((a) -> {addition.concat(a, "-");});
		
		System.out.println();
		
		list.forEach((a) -> {addition.concat(a, "->");});
		
	}
}
