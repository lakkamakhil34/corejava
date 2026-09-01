package com.oops;

class Student implements Cloneable{
	int sid;
	String sname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address =address;
	}
	
}

class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
	
}
public class TestShallowCopyDemo1 {

	public static void main(String[] args)throws CloneNotSupportedException {
		System.out.println("main method started");
		
		Address address=new Address("Hyderabad");
		Student s1=new Student(1,"Akhil",address);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		Student s2=(Student) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("-----___________-----___________");
		
		s2.sid=2;
		s2.sname="Vinod";
		s2.address.city="Banglore";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		System.out.println(s1);
		System.out.println(s2);
		

		System.out.println("main method ended");
	}

}
