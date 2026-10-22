package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	 String username="Akhil";
	transient String password="Akhil123";
	 int cvv=143;
}
public class TestSerializableDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		Employee emp=new Employee();
		
		File f=new File("C:\\Users\\pc\\Akhiljava\\workspace\\corejavaworkspace\\ak.ser");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);;


			System.out.println("main method ended");
	}

}
