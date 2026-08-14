package com.logicalstatements.loops;

public class Primenumbers {

	public static void main(String[] args) {

		System.out.println("main method started");
		
		for(int i=2;i<=100;i++) {
			int count=0;
			for (int n=1;n<=i;n++) {
				if(i%n==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}

	}

}
