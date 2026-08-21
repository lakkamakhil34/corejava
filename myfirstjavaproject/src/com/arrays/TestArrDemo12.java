package com.arrays;

import java.util.Arrays;

public class TestArrDemo12 {

	public static void main(String[] args) {
		
		int[]arr= {31,11,54,65,9,8};
		int temp=0;
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		int count=0;
		int count1=0;
		
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-1;j++) {
				
				
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				count1++;
			}
			count++;
			if(!flag) {
				break;
			}
		}
		
		
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));

	}

}
