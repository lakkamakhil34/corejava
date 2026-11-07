package com.collections;

import java.util.ArrayList;

public class TestArrayListDemo1 {

	public static void main(String[] args) {
		System.out.println("main method ended");
		
		ArrayList<Integer> a1= new ArrayList<>();
		System.out.println(a1.size());
		
		a1.add(1);
		a1.add(3);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		a1.add(11);
		a1.add(18);
		a1.add(21);
		a1.add(27);
		a1.add(33);
		System.out.println(a1);
		System.out.println(a1.size());
		
		System.out.println("main method ended");



	}

}
