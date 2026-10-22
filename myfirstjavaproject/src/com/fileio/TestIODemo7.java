package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestIODemo7 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		FileReader fr=new FileReader("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\test121.txt");
		BufferedReader br=new BufferedReader(fr);		
				
			String s= br.readLine();
			
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
		br.close();
		fr.close();
		
		System.out.println("main method ended");
	}

}
