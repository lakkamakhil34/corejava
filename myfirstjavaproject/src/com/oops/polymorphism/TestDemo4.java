package com.oops.polymorphism;

///wap to find areas of triangle,square,rectangle,& circle..?
/// triangle:0.5*base*height
/// square:s* s
/// rectangle:l*b
/// circle:PI*r*r
public class TestDemo4 {

	 void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("Triangle Area: "+findArea(12.5,24.5));
		System.out.println("Rectangle Area: "+findArea(10,20));
		System.out.println("Square Area: "+findArea(20F));
		System.out.println("Circle Area: "+findArea(10));
		
		
		System.out.println("main method ended");
	
	}
	 double findArea(double r) {
		 return Math.PI*r*r;
	 }
	 double findArea(double l,float b) {
		 return l*b;
	 }
	 double findArea(float side) {
		 return side* side;
	 }
	
	double findArea(double base,double height) {
		return 0.5 * base* height;
		
	}

}
