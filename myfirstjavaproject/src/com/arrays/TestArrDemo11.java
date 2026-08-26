package com.arrays;

public class TestArrDemo11 {

	public static void main(String[] args) {

		System.out.println("main method started");
		int [][]arr= {{1,2,3,4},{5,6,7},{8,9},{10}};
		System.out.println(arr.length);
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}

		
		
		System.out.println("main method ended");
	}

}
