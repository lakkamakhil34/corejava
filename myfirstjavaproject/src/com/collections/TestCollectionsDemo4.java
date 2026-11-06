package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsDemo4 {

	public static void main(String[] args) {
		Collection<Integer>c1=new ArrayList<>();
		
		c1.add(9);
		
		if(c1.isEmpty()) {
			c1.add(18);
			c1.add(1);
			c1.add(45);
			c1.add(8);
			c1.add(6);
		}
		System.out.println(c1);

	}

}
