package com.arrays;
//String

public class TestArrDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String[] names=new String[5];//0 1 2 3 4
		
		names[0]="Dhoni";
		names[1]="Kl.Rahul";
		names[2]="Virat";
		names[3]="Raina";
		names[4]="SanjuS";
	
		//for loop-->index
		//for(int i=0; i< names.length;i++) {
			//System.out.println(names[i]);
		//}
		
		//for each loop-->element
		for(String name:names) {
			System.out.println(name);
		}
	}

}
