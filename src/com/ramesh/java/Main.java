package com.ramesh.java;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Address address = new Address();
		
		address.setDoreNo("111");
		address.setState("AP");
		address.setCity("Nellore");
		
		s1.setId(100);
		s1.setName("Ramesh");
		s1.setAge(28);
		s1.setAddress(address);
		
		System.out.println(address.toString());
		
		System.out.println();
		
		System.out.println(s1.toString());
		
	}

}
