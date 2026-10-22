package com.exceptionhandling;

public class TestExDemo13 {

	public static void main(String[] args) {
		
		try {
			System.out.println("in try-1");
			//System.out.println(10/0);
			try {
				System.out.println("in try-2");
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("in catch-2");
				System.out.println(10/0);
			}finally {
				System.out.println("in finally-2");
			}
		}catch(Exception e){
			System.out.println("in catch-1");
		}finally {
			System.out.println("in finally-1");
		}

	}

}
