package com.oops;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e1=new Employee();
		
		e1.setEid(3);
		e1.setEname("Raina");
		e1.setSalary(300000);
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());
		
//		if the data is private, we cannot access the data outside of 
//		the classes.
//		Accessing data outside of the classes directly..
//		e1.eid=1;
//		e1.ename="Ak";
//		e1.salary=30000.00;
//		
//		System.out.println(e1.eid);
//		System.out.println(e1.ename);
//		System.out.println(e1.salary);


	}

}
