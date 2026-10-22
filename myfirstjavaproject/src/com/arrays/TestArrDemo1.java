package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		//step1:Declaration
		int[]ages;
		
		//step2:Creation
//Variable must provide either dimension expressions or an array initializer
		//ages=new int[];
		ages=new int[5];//0 1 2 3 4
		
		//step3:Initialisation
		ages[0]=22;
		ages[1]=21;
		ages[2]=18;
		ages[3]=20;
		ages[4]=22;
		
		//step4:Representation based on your requirements
		
		//for loop
	//	for(int i=0;i < ages.length;i++) {
		//	System.out.println(ages[i]);
	//	}
		
		//for each loop
		for(int age:ages) {
			if(age>20) {
				System.out.println(age);
			}
		}

	}

}
