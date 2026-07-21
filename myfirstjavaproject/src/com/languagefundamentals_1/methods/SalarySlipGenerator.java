package com.languagefundamentals_1.methods;
import java.util.Scanner;
public class SalarySlipGenerator {
	
	void salarySlip(String employeename,double basicSalary) {
		double hra=basicSalary*20/100;
		double da= basicSalary*10/100;
		double grossSalary=basicSalary+hra+da;
		
		System.out.println("Salary details");
		System.out.println("Employee name:"+employeename);
		System.out.println("Basic salary:"+ basicSalary);
		System.out.println("HRA:"+hra);
		System.out.println("DA:"+da);
		System.out.println("Gross salary:"+grossSalary);
		
	}
	

	 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Employee name:");
		String employeeName=sc.nextLine();
		
		System.out.println("Basic salary");
		double basicSalary=sc.nextDouble();
		
		salarySlip(employeeName,basicSalary);
		
		

	}

}
