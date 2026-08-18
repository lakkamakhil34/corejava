package com.logicalstatements.loops;

public class Perfectnumbers {

	public static void main(String[] args) {

		System.out.println("main method ");
		for(int n=1;n<=100;n++) {
			int sum=0;
			
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(sum==n) {
				System.out.print(n+" ");
			}
		}

	}

}
