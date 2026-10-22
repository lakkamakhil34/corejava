package com.languagefundamentals_1.constructors;

public class Employee {
	
	int eid;
	String ename;
	double esal;
	
	public Employee() {
		System.out.println("no arg constructor called");
		eid=100;
		ename="unknown";
		esal=10000.00;
				
	}

//To avoid data conflicts, we need to maintain exact variables in
//parameters and if we have same parameter name we must need to usethis
//product to pass the values to current object data,which will help to	
//provide better readability
	
	
	Employee(int eid,String ename,double esal){
		System.out.println("parameterized constructor called");
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	

	public static void main(String[] args) {
	System.out.println("main method started");
	
	Employee e1=new Employee();
	e1.empinfo();
	
	Employee e2=new Employee(1, "Akhil",25000.00);
	e2.empinfo();
	
	System.out.println("main method ended");
	}

	void empinfo() {
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+esal);
	}
}
