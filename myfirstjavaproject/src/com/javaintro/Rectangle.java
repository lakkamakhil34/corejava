package com.javaintro;

public class Rectangle {

		void calculateArea() {
			
			int length= 20;
			int breadth= 15;
		int area = length*breadth;
		
		System.out.println("Length:"+ length);
		System.out.println("Breadth:"+ breadth);
		System.out.println("Area of rectangle="+ area);
		}
			
		
		public static void main(String[] args) {
			Rectangle r= new Rectangle();
			r.calculateArea();
			
		}
		
	}


