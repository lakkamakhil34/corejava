package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestIODemo5 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		FileWriter fw=new FileWriter("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\java123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Java is simple");
		bw.newLine();
		bw.write("Jfs");
		bw.newLine();
		bw.write("Java is robust");
		bw.flush();
		
		
		System.out.println("main method ended");

	}

}
