package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestIODemo4 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		FileWriter fw=new FileWriter("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\test121.txt");
		fw.write(67);
		fw.write('\n');
		fw.write("A");
		fw.write('\n');
		fw.write('R');
		
		
		fw.close();
		

	}

}
