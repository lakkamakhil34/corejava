package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//WAP to read data from file
public class TestExDemo16 {

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\text123.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		
		while(i!=-1) {
			System.out.println((char)i);
			Thread.sleep(500);
			i=fr.read();
		}
		System.out.println("main method ended");

	}

}
