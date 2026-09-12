package com.oops.inheritance;

class Parent{
	public void display() {
		System.out.println("Parent ");
	}
}
class child extends Parent{
	@Override
	public void display() {
		System.out.println("child ");
	}
}
public class TestDemo {

	public static void main(String[] args) {
		Parent p=new child();
		p.display();
	}

}
