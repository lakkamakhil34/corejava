package com.operators;

//shift op
//<< >> >>>
public class TestShiftOpDemo1 {

	public static void main(String[] args) {
		
		int a=54;
		int b=2;
		
		int x=93;
		int y=3;
		
		//left shift op
		System.out.println(a << b );//216
		System.out.println(a >> b);//13
		
		//right shift op
		System.out.println(x >> y);//11
		System.out.println(x >>> y);//11
		
		
	}

}
