package com.javaintro;

public class Test1 {

	int id;
	String name;
	
	static int orgid;
	static String orgName;
	
	{
		System.out.println("Hello instance");
	}
	
	
	void main(String[] args) {
		System.out.println("main method started!");
		
		int id = 10;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(orgid);
		System.out.println(orgName);
	}
	

}
