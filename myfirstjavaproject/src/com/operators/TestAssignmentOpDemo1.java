package com.operators;

//Assignment op
// = += -= *= /= %=
public class TestAssignmentOpDemo1 {

	public static void main(String[] args) {
		
		int result=10;
		result= result+5;
		
		//result= result +5.5 CE:type mismatch
		
		result =(int)(result+5.5);//explicit type casting
		
		//result+=5.5//result= result +5.5;//narrowing
		
		System.out.println("Result:"+result);
		
	//result=result - 4.5;ce
		result -= 4.5;
		System.out.println("result:"+result);
		
		//result= result*4.3;
		result *= 4.3;
		System.out.println("Result:"+result);
		
		//result =result/4.2;
		result /= 4.2;
		System.out.println("Result:"+result);
		
		result %=2.5;
		System.out.println("Result:"+result);
		
		
		
	}

}
