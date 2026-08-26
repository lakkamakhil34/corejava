package com.arrays;
//Array of arrays will consider as jagged array
public class TestArrDemo10 {

	public static void main(String[] args) {

		int[][]arr= new int[2][];//0 1
		
		arr[0]=new int [3];//0 1 2
		arr[1]=new int[4];// 0 1 2 3
		
		arr[0][0]=101;
		arr[0][1]=102;
		arr[0][2]=103;
		
		arr[1][0]=104;
		arr[1][1]=105;
		arr[1][2]=107;
		arr[1][3]=108;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}

	}

}
