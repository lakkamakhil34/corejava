package com.arrays;

public class TestArrDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int [][] numbers=new int[3][3];//rows->0 1 2 3 col->0 1 2 3
		System.out.println(numbers.length);//3
		System.out.println(numbers[0].length);//4
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);
		
		
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;


		
		numbers[1][0]=40;
		numbers[1][1]=50;
		numbers[1][2]=60;
		
		
		for(int i=0;i <numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
		}
		
//		for(int[] n1:numbers) {
//			for(int n:n1) {
//				System.out.print(n+" ");
//			}
//		}
//		

		System.out.println("main method ended");
	}

}
