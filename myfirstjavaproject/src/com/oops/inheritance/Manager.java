package com.oops.inheritance;

public class Manager implements Attendance {

	@Override
	public void markAttendance() {
		System.out.println("Manager attendance is marked");
		
	}

	public static void main(String[] args) {
		Attendance a3=new Manager();
		a3.markAttendance();

	}

}
