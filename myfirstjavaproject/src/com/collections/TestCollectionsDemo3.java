package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsDemo3 {

	public static void main(String[] args) {
		
		Collection<String>c3=new ArrayList<>();
		c3.add("A");
		c3.add("B");
		System.out.println(c3.hashCode());
		
		
		System.out.println("**********************************");
		Collection<Integer> c1= new ArrayList<>();
		c1.add(20);
		c1.add(40);
		System.out.println(c1);
		
		
		Collection<Integer> c2= new ArrayList<>();
		c2.add(10);
		c2.add(1);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}

}
