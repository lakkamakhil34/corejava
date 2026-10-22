package com.languagefundamentals_1;



//integral literals
//decimal literals-->0to9-->base is 10
//octal literals-->0to7-->base is 8
//Hexadecimal-->0to9 &a-f/A-F-->base is 16
//binary literals-->0&1--> base 2		
		

public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		TestLiteralsDemo1 t= new TestLiteralsDemo1();
		System.out.println(t);
		System.out.println(t.hashCode());

		
		
		//Decimal Literals
		int a1=123;
		int a2=789;

// octal Literals, Any numbers starts with 0 will consider as octal	
		
		int a3= 0123;//0*8^3 +1*8^2 +2*8^1 +3*8^0=64+16+3=83
		int a4= 0456;
		int a5= 0765;
	//	int a6= 0876;//The literal 0876 of type int is out of range 
	
// Hexa-decimal literals, any number starts with 0x will consider as hexa decimal literals
 // a/A=10, b/B=11, c/C=12, d/D=13, e/E=14, f/F=15     
		
		int a6=0x123;//1*16^2 +2*16^1 +3*16^0=291		
		int a7=0x456;
		int a8=0x567;
		int a9=0xa1b2;
		int a10=0xfaa;//
		int a11=0xDAD;
		int a12=0xBeE;
		
		
		int a13=0b1010;
		int a14=0B1111;
		int a15=0B0001;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);
		
	}

}
