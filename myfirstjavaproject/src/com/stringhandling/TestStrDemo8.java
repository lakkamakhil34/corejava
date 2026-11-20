package com.stringhandling;

public class TestStrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		char[]data= {'a','b','c'};
		String s1=String.copyValueOf(data);
		System.out.println(s1);
		
		
String[] names= {"Dhoni","Raina","Virat","Rahul","Rohit","Jadeja"};
		
		for(String name:names) {
			if(name.startsWith("R")) {
				System.out.println(name);
			}
		}
		System.out.println("*****************");
		for(String name:names) {
			if(name.toLowerCase().startsWith("r")) {
				System.out.println(name);
			}
		}
		
		System.out.println("*****************");
		for(String name:names) {
			if(name.toLowerCase().startsWith("j") || name.toLowerCase().endsWith("r")) {
				System.out.println(name);
			}
		}
		
		System.out.println("*****************");
		for(String name:names) {
			if(name.toLowerCase().startsWith("j") || name.toLowerCase().endsWith("r") || name.contains("dhoni")) {
				System.out.println(name);
			}
		}

	}

}
