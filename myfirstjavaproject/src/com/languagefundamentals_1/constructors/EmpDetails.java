package com.languagefundamentals_1.constructors;

public class EmpDetails {
	
	int empId;
	String empName;
	double sal;
	
	//parameterized constructor
	EmpDetails(int empId,String empName,double sal){
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
		
	}
	EmpDetails(EmpDetails e){
		this.empId=e.empId;
		this.empName=e.empName;
		this.sal=e.sal;
	}

	void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee name:"+empName);
		System.out.println("Salary of employee:"+sal);
	}
	void incrementSalary(double amount) {
		sal=sal+amount;
	}
	
	
	public static void main(String[] args) {
	System.out.println("main method method");
	
	EmpDetails e=new EmpDetails(101,"krishna",50000);
	
	EmpDetails e1=new EmpDetails(e);
	
	e1.incrementSalary(10000);
	e1.empName="Ravi";
			
			System.out.println("Employee 1");
	e.display();
	
	System.out.println("Employee 2");
	e1.display();
	

	
	System.out.println("main method ended");
	}

}
