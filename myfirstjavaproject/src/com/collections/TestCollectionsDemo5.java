package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionsDemo5 {

	public static void main(String[] args) {


		Collection<String> names=new ArrayList<>();
		names.add("Virat");
		names.add("Rahul");
		names.add("Rohit");
		names.add("Jaddu");
		names.add("Hardik");
		names.add("Sanju");
		names.add("KL");
		names.add("Dhoni");
		names.add("Raina");
		names.add("Rayudu");
		names.add("Surya");
		names.add("Sharma");
		
		
		for(String name:names) {
			System.out.println(names);
			
//			if(name.equals("Dhoni")) {
//				names.remove(names);
//			}
		}
		
		System.out.println("******************************");
		Iterator<String> itr=names.iterator();
		
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			
			String name=itr.next();
			if(name.equals("Dhoni")) {
				itr.remove();
			}
			}
		System.out.println(names);
		

	}

}
