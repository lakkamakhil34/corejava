package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestIODemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		File f= new File("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\std.txt");
		
		try {
			System.out.println("in try");
			
			if(!f.exists()) {
				boolean flag=f.createNewFile();
				
				if(flag) {
					System.out.println("File has created Successfully!!");
				}else {
					System.out.println("Something went wrong");
				}
			}else {
				System.out.println("with this name the file already exists");
			}
			
		}catch(IOException e) {
			System.err.println("in catch");
			e.printStackTrace();
		}

		System.out.println("main method ended");
	}

}
