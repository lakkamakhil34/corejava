package com.oops.inheritance;

//Implicit single inheritance
//every class extends obj class will consider as single inheritance.


//parent or super or base
class Animal{
	void animalInfo() {
		System.out.println("Animal info called");
	}
	void sound() {
		System.out.println("animals can sound!!");
	}
	
}

//single inheritance :one class extends another class will consider as SI.
//child or sub or derived
class Dog extends Animal{
	void dogInfo() {
		System.out.println("Dog info called");
	}
	@Override
	void sound() {
		System.out.println("Bow Bow!!");
	}
	
}
//grand child

class BabyDog extends Dog{
	void babyDogInfo() {
		System.out.println("Baby dog info called");
	}
	@Override
	void sound() {
		System.out.println("Uff Uff");
	}
	
}
public class TestInhDemo1 {

	public static void main(String[] args) {
		BabyDog bd=new BabyDog();
		bd.animalInfo();
		bd.dogInfo();
		bd.babyDogInfo();
		
		
	}

}
