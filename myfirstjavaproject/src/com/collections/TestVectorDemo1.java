package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVectorDemo1 {

	public static void main(String[] args) {
		Vector<String> li=new Vector<>();
		
		li.add("AlluArjun");
		li.add("Prabhas");
		li.add("NTR");
		li.add("Ramcharan");
		li.add("Maheshbabu");
		li.add("Gopichand");
		li.add("Raviteja");
		li.add("Yash");
		
		
		Enumeration<String> en=li.elements();
		
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
		
		Iterator<String> itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(li);
		

	}

}
