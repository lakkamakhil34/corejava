package com.languagefundamentals_1;

public class StringConversionExample {

	public static void main(String[] args) {
	
		String value="250";
		
		int intvalue= Integer.parseInt(value);
		double doublevalue=Double.parseDouble(value);
		float floatvalue=Float.parseFloat(value);
		
		System.out.println(value);
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(floatvalue);

	}

}
