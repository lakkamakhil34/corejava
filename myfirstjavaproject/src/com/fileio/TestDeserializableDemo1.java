package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserializableDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\ak.ser");
		FileInputStream fis= new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee obj=(Employee) ois.readObject();
		System.out.println(obj.username);
		System.out.println(obj.password);
		
		System.out.println("main method ended");

	}

}
