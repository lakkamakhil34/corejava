package com.languagefundamentals_1.methods;

import java.util.Scanner;

//with return type+no arguments
//find the area of rectangle, triangle,square, circle
//rec=length*breadth
//tri=0.5*b*h
//sq=Side*side
//circle=Pi*r*r

public class TestMethodsDemo8 {
	
	double areaofRectangle(double length, double breadth) {
		double arRec=length*breadth;
		return arRec;
	}

	double areaofTriangle(double base, double height) {
		double arTri=0.5*base*height;
		return arTri;
	}
	
	double areaofSquare(double side) {
		double arSq=side*side;
		return arSq;
		
	}
	
	double areaofCircle(double radius) {
		double arCir=Math.PI*radius*radius;
		return arCir;
	}
 
 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length:");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth:");
		double b=sc.nextDouble();
		double arRec=areaofRectangle(l,b);
		System.out.println("Area of Rectangle is:"+ arRec);
	System.out.println("************************");
	
	
	System.out.println("Enter Base:");
	double ba=sc.nextDouble();
	System.out.println("Enter Height:");
	double h=sc.nextDouble();
	double arTri=areaofTriangle(b,h);
	System.out.println("Area of Triangle is:"+ arTri);
	System.out.println("**************************************");
	
	
	System.out.println("Enter side:");
	double s=sc.nextDouble();
	double arSq=areaofSquare(s);
	System.out.println("Area of Square is:"+ arSq);
	System.out.println("**************************************");
	
	
	System.out.println("Enter radius:");
	double r=sc.nextDouble();
	double arCir=areaofCircle(r);
	System.out.println("Area of Circle is:"+ arCir);
	System.out.println("**************************************");
	
	}

}
