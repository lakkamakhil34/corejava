package com.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]arr= {1,2,3,2,4,1,5};
		System.out.println("Unique elements:");
		
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				System.out.println(arr[i]+" ");
			}
		}

	}

}
