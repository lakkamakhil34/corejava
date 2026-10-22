package com.oops.inheritance;

public class Developer implements Attendance {
	
	public static void main(String[] args) {
		Attendance a1=new Developer();
		
		a1.markAttendance();
		
	}

	@Override
	public void markAttendance() {
		System.out.println("Developer attendance marked");
				
	}

}
