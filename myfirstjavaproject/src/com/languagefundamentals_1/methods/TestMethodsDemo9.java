package com.languagefundamentals_1.methods;


class Student{
	int sid;
	String name;
	int age;
	String city;
	
}
public class TestMethodsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s= new Student();
				//getStudentinfo();
		//printStudentinfo();
	
		System.out.println("main method ended");
	}
	
	void printStudentinfo(Student s) {
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.city);
		
		
	}
	
	void getStudentinfo() {
	 Student s= new Student();
		s.sid= 3;
		s.name="Raina";
		s.age=38;
		s.city="UttarPradesh";
	}

}
