package com.languagefundamentals_1.constructors;

//constructor chaining
public class StudentAdmission {

	
	int id;
	String name;
	String course;
	
	StudentAdmission(){
		System.out.println("default constructor");
	}
	StudentAdmission(int id){
		this.id=id;
	}
	StudentAdmission(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	StudentAdmission(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		StudentAdmission s=new StudentAdmission(1, "Akhil","CS");
		s.display();
		
		StudentAdmission s1=new StudentAdmission(2, "Srikanth","JFS");
		s1.display();
		
		StudentAdmission s2=new StudentAdmission(3, "Vishwanath","JFS");
		s2.display();
		
		StudentAdmission s3=new StudentAdmission(4, "Kapil","Python");
		s3.display();
		
		System.out.println("main method ended");

	}
	
	void display() {
		System.out.println("************************************");
		System.out.println("Student age:"+id);
		System.out.println("Student Name:"+name);
		System.out.println("Course:"+course);
		System.out.println("************************************");
	}
}
