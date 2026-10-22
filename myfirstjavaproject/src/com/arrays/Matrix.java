package com.arrays;

public class Matrix {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int[][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		
		};
		//reverse even-indexed rows
		for(int i=0;i<arr.length;i++){
			if(i%2==0) {
				int temp=arr[i][0];
				arr[i][0]=arr[i][2];
				arr[i][2]=temp;
			}
			
		}
		//multiply odd index rows with 2 except middle element
		for(int j=0;j<arr.length;j++) {
			if(j!=1) {
				arr[1][j]=arr[1][j]*2;
			}
		}
		//square diagonal elements
		for(int i=0;i<arr.length;i++) {
			arr[i][i]=arr[i][i]*arr[i][i];
		}
		//Display Matrix
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
