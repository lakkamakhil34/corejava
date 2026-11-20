package com.stringhandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		
		String[] names= {"Dhoni","Raina","Virat","Rahul","Rohit","Jadeja"};
		
		for(String name:names) {
			if(name.contains("i")) {
				System.out.println(name);
			}
		}

	}

}
