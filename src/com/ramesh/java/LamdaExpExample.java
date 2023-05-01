package com.ramesh.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExpExample {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();  
        list.add("Jai");  
        list.add("Vivek");  
        list.add("Mahesh");  
        list.add("Vishal");  
        list.add("Naren");  
        list.add("Hemant");  
        list.add("Vikas"); 
        list.add("Ajay");
//        
//        Iterator it = list.iterator();
//        
//        while(it.hasNext()) {
//        	System.out.println(it.next());
//        }
//        
//        for(int i =0; i < list.size(); i++) {
//        	System.out.println(list.get(i));
//        }
        
        list.forEach((i) -> {
        	System.out.print("\"");
        	System.out.print(i);
        	System.out.println("\"");
        });
		
	}

}
