package com.exceptionhandling;

public class TestExDemo8 {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		int []arr=new int[5];
		
		try {
			String str="one";
			int x=Integer.parseInt(str);
			System.out.println(x);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------------------------------");
		
		try {
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;
			arr[5]=60;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			System.err.println("in catch");
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("main method ended");

		
	}

}
