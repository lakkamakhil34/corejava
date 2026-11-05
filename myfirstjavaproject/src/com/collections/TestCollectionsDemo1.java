package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsDemo1 {

	public static void main(String[] args) {
		
		
	//collection is a raw type
//References to generic type collections<E> should be parameterized
		
	Collection<Object> c= new ArrayList<>();
	
	
	c.add(1);
	c.add(3);
	c.add(7);
	c.add(8);
	c.add(9);
	c.add(11);
	c.add(18);
	c.add(21);
	c.add("Akhil");
	c.add("Akhil");

	System.out.println(c);
	
	Collection<String> n= new ArrayList<>();
	
	n.add("KL");
	n.add("Raina");
	n.add("Dhoni");
	n.add("Rayadu");
	n.add("Jaddu");
	n.add("Sreyas");
	n.add("Virat");
	n.add("Sanju");
	n.add("Dhoni");
	n.add("Akhil");
	
	
	
	
	System.out.println(n);
	
	}

}
