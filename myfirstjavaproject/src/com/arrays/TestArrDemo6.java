package com.arrays;

//WAP to print Array in reverse order..?
//4 5 6 7 8 1 2 3-->3 2 1 8 7 6 5 4

public class TestArrDemo6 {

	public static void main(String[] args) {
		int[]arr= {4,5,6,7,8,1,2,3};//0 1 2 3 4 5 6 7
		
		for(int i=arr.length-1; i>=0;i--) {
			System.out.println(arr[i]+"");
		}
		

	}

}
