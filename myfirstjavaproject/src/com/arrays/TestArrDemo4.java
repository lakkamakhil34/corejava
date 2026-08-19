package com.arrays;

public class TestArrDemo4 {

	public static void main(String[] args) {
	System.out.println("main method started");
	
	int[]marks= {99,98,97,96,95,94};
	System.out.println(marks);
	int totalmarks=0;
	int avg=0;
	
	//for loop
	for(int i=0; i<marks.length;i++) {
		totalmarks += marks[i];
	}
	
	//for each loop
	//for(int m:marks) {
		//totalmarks=m+totalmarks;
	//}
	avg= totalmarks/marks.length;
	
	
	System.out.println("Total marks of the student:"+totalmarks);
	System.out.println("Average marks of the student:"+avg);
	
	System.out.println("main method ended");

	}

}
