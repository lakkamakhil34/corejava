package com.oops.abstraction;

//What to do, but not how to do!!
public interface Animal {
	
	public static final String org_name="Vcube PET Store";
	
	void sound();//whether we declared or not every method is public&abstract
	
	public abstract void eat();
	
	public void walk();
	
	public default void run() {
		System.out.println("All Animals can run");
		
	}
	static void breath() {
		System.out.println("Every animals breath");
	}
	
	default void sleep() {
		System.out.println("Every animal sleeps");
	
	}
	
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	//Abstract methods do not specify a body
//	void eat() {
//		
//	}

}
