package com.javaintro;

public class Cricketer {
	
	int jerseyNo;
	String cricketerName;
	
	static int countryId=91;
	static String countryName= "India";
	
	

	public static void main(String[] args) {
		System.out.println("welcome to the world of Indian cricket");
		
		
		System.out.println("Object1 info");
		Cricketer raina= new Cricketer();
		
		raina.jerseyNo= 3;
		raina.cricketerName= "Suresh Raina";
		
		
		System.out.println("country ID:"+ countryId);
		System.out.println("Country name:"+ countryName);
		System.out.println("Jersey Number:"+ raina.jerseyNo);
		System.out.println("Name of the Cricketer:"+ raina.cricketerName);
		
		
		System.out.println("Object2 info");
		Cricketer akki= new Cricketer();
		
		akki.jerseyNo= 03;
		akki.cricketerName= "Akhil";
		
		
		System.out.println("country ID:"+ countryId);
		System.out.println("Country name:"+ countryName);
		System.out.println("Jersey Number:"+ akki.jerseyNo);
		System.out.println("Name of the Cricketer:"+ akki.cricketerName);


	}

}
