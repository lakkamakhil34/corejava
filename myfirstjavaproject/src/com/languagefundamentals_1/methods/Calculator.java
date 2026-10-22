package com.languagefundamentals_1.methods;

import java.util.Scanner;

public class Calculator {
	
	void add(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	
	void sub(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
	}
	
	void multiply(int a, int b) {
		System.out.println("Multiplication:"+(a*b));
	}
	
	void divide(int a, int b) {
		System.out.println("Divison:"+(a/b));
	}

	void main(String[] args) {
		System.out.println("mian method started");
        Scanner sc= new Scanner(System.in);
       
        
        System.out.println("enter first number:");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        
       
        
        add(num1,num2);
        sub(num1,num2);
        multiply(num1,num2);
        divide(num1,num2);
		
		System.out.println("main method ended");
	}

}
