package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo15 {

	public static void main(String[] args) throws IOException {

		System.out.println("main method started");
		System.out.println(10/0);

		File f=new File("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\test123.txt");

		f.createNewFile();
		
		System.out.println("main method ended");
	}

}
