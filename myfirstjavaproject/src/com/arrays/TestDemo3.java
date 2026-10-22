package com.arrays;

import java.util.Arrays;

public class TestDemo3 {

	public static void main(String[] args) {
	
    System.out.println("main method started");
		
		int[] a1= {3,4,5,6,7,8};//3
		int[] a2= {6,7,8,4,5};//5
		int len=0;
		
		if(a1.length>a2.length) {
			len=a1.length;
		}else {
			len=a2.length;
		}
		int []c=new int[len];
		
		for(int i=0;i<len;i++) {
			if(a1.length<=i) {
				c[i]=a2[i];
			}else if (a2.length<=i) {
				c[i]=a1[i];
			}else {
				c[i]=a1[i]+a2[i];//9 11 13 14 5
			}
				
			
		}
		System.out.println(Arrays.toString(c));
	}

}
