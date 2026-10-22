package com.arrays;

public class TestArrDemo5 {

	public static void main(String[] args) {


		int[]numbers= {4,5,8,9,13,2,15,7,17};
		
		int min=numbers[0];
		int max=numbers[0];
		
		
		//for loop
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min){
				min=numbers[i];
			}else if(numbers[i]>max){
				max=numbers[i];
			}
		}
		
		
		//for each
		//for(int n:numbers) {
			//if(n<min) {
				//min=n;
			//}
			//if(n>max) {
				//max=n;
		//	}
		//}
		
		System.out.println("Minimum number is:"+min);
		System.out.println("Maximum number is:"+max);

	}

}
