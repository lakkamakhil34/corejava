package com.javaintro;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException  {
		System.out.println("main method started");

		//below classes are loading Bootstrap class loader
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		
		//below are loading application class loader
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ended");
	}

}
 