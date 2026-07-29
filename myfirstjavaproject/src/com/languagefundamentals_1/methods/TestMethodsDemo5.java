package com.languagefundamentals_1.methods;
import java.util.Scanner;

// No return type+with arguments-->Scanner
public class TestMethodsDemo5 {
	
	
	void getFullName(String fname, String lname){
		 System.out.println("Employee Full name:"+fname+""+lname);
		 
	 }
	 
	 void getAge(int age) {
		 System.out.println("Age of the Employee:"+age);
	 }
	 
	 
	 void salaryInfo(double salary) {
		 System.out.println("Employee salary:"+ salary);
	 }

	 void getHeightAndWeight(float height, double weight) {
		 System.out.println("Employee Height:"+height);
		 System.out.println("Employee Weight:"+weight);
	 }
	 
	 void genderInfo(char c) {
		 System.out.println("Gender status:"+c);
	 }
	 
	 
     void main(String[] args) {
    	 System.out.println("main method started");
    	 
    	 String s=new String();
    	 TestMethodsDemo5 t=new TestMethodsDemo5();
    	 
    	 Scanner sc=new Scanner(System.in);
    	
    	
    	 System.out.println("Enter your First name:");
    	// sc.nextLine();
    	 String firstname=sc.nextLine();
    	 
    	 System.out.println("Enter your Last name:");
    	 String lastname=sc.next();
    	
    	 System.out.println("Enter your age:");
//    Reading the element from scanner  	 
    	int age=sc.nextInt();
 
    	 System.out.println("Enter your salary info:");
    	 double sal=sc.nextDouble();
    	 
    	 System.out.println("Enter your Height:");
    	 System.out.println("Enter your Weight:");
    	 float h=sc.nextFloat();
    	 double w=sc.nextDouble();
    	 
    	 
    	System.out.println("Gender:");
    	char c=sc.next().charAt(0);//method chaining
    	 
    	
    	 
    	
    	 
    	 // calling the getAge method by passing the value from scanner
    	 getFullName(firstname, lastname);
    	 getAge(age);
    	 salaryInfo(sal);
    	 getHeightAndWeight(h,w);
    	 genderInfo(c);
    	 
    	 
    	 System.out.println("main method ended");
    	 
    	 
    	 
	
    
    	
	}

}
