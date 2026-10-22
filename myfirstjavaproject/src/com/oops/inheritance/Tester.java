package com.oops.inheritance;

public class Tester implements Attendance {
	
	@Override
	public void markAttendance() {
		System.out.println("Tester attendance marked");
		
	}
	
	public static void main(String[] args) {
		Attendance a2=new Tester();
		a2.markAttendance();

	}

	

}
