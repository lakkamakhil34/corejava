package com.javaintro;

public class ObjectCount {

	int ObjectNumber;
	
	static int count=0;
	
	ObjectCount(){
		count++;
		ObjectNumber= count;
		System.out.println("Object" + ObjectNumber + "is created.");
	}
	
	static void displayCount() {
		
		System.out.println("Total number of Objects created:"+ count);
		
	}
	public static void main(String[] args) {
		
		ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount obj3 = new ObjectCount();
		ObjectCount obj4 = new ObjectCount();
		ObjectCount obj5 = new ObjectCount();
	}

}
