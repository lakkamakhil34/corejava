package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestIODemo2 {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\std");
        boolean flag=f.mkdir();
        
        if(flag) {
        	System.out.println("created a new directory or folder ");
        }else {
        	System.out.println("Something went wrong");
        }
		File f1=new File(f,"A.txt");
		f1.createNewFile();
		
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());
		
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		
//		String[] files= f1.list();
//		for(String filename:files) {
//			System.out.println(filename);
//			
			File f2=new File("C:\\Users\\pc\\Akhiljava");
			String[] files= f2.list();
			int count=0;
			
			for(String filename:files) {
				System.out.println(filename);
				count++;
		}
			System.out.println("total files " + count);
			System.out.println("total files " + f2.length());
	}

}
