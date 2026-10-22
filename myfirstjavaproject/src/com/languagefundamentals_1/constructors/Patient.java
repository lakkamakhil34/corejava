package com.languagefundamentals_1.constructors;
//parameterised constructor
public class Patient {
	
	int age;
	String patientName;
	double roomchargeperday;
	int numberofdaysadmitted;
	
	public Patient() {
		System.out.println("no arg constructor called");
		age=35;
		patientName="Rahul";
		roomchargeperday=2500;
		numberofdaysadmitted=4;
		}

	Patient(String patientName, int age, double roomchargeperday,int numberofdaysadmitted){
		System.out.println("Parameterised constructor called");
		this.patientName=patientName;
		this.age=age;
		this.roomchargeperday=roomchargeperday;
		this.numberofdaysadmitted=numberofdaysadmitted;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Patient p=new Patient();
		p.display();
		Patient p1=new Patient("Rahu",27,20000,5);
		p1.display();
		
		System.out.println("main method ended");
	}

	void display() {
		System.out.println("*****************************************");
	 double TotalHospitalBill=(roomchargeperday*numberofdaysadmitted);
		 System.out.println("Patient's Name:"+patientName);
		System.out.println("Patient's Age:"+age);
		System.out.println("Room Charge per Day:"+roomchargeperday);
		System.out.println("Number of days Admitted:"+numberofdaysadmitted);
		System.out.println("Total Bill:"+TotalHospitalBill);
		System.out.println("*****************************************");
	
	
	}
		
}

