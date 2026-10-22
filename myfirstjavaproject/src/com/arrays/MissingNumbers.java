package com.arrays;

public class MissingNumbers {

	public static void main(String[] args) {


		int[]arr= {1,2,3,4,5};
		int n=6;
		
		int expsum=n*(n+1)/2;
		int actualsum=0;
		
		for(int i=0;i<arr.length;i++) {
			actualsum=actualsum+arr[i];
		}

		int missing=expsum-actualsum;
        System.out.println("Missing number:"+missing);
	}

}
