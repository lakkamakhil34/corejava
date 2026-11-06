package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsDemo2 {

	public static void main(String[] args) {
		
		Collection<String>boys=new ArrayList<>();
		
		boys.add("Virat");
		boys.add("Rohith");
		boys.add("Rahul");
		boys.add("Sanju");
		boys.add("Sreyas");
		boys.add("Hardik");
		boys.add("Akhil");
		boys.add("Bumrah");
		boys.add("Bhuvi");
		boys.add("Kuldeep");
		
		System.out.println(boys);
		
		
Collection<String>girls=new ArrayList<>();
		
		girls.add("Anushka");
		girls.add("Ileana");
		girls.add("Samantha");
		girls.add("Kajal");
		girls.add("Thammanaha");
		girls.add("Rakul");
		girls.add("Pooja");
		girls.add("Kriti");
		girls.add("Sreeleela");
		girls.add("Rashmika");
		
		System.out.println(girls);
		
		
		Collection<String>students=new ArrayList<>();

		students.addAll(boys);
		students.addAll(girls);
		
		girls.clear();
		System.out.println(girls);
		System.out.println(students);
		
		students.remove("Sreeleela");
		
		System.out.println(students.contains("Rahul"));
		System.out.println(students.contains(girls));

		

	}

}
