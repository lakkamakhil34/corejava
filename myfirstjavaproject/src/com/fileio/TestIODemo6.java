package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestIODemo6 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");
		
		PrintWriter pw= new PrintWriter("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\cricket.txt");
		pw.println(123);
		pw.println('X');
		pw.println("Akhil");
		pw.println(123.5F);
		
		pw.close();

		System.out.println("main method ended");
	}

}
