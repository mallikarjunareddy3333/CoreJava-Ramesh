package com.ramesh.java;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		HelloWorld helloWorld = (value) -> { return "Hello " + value;};
		
		System.out.println(helloWorld.sayHello("Ramesh"));
		
	}
	
}
