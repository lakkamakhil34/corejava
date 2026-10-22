package com.languagefundamentals_1.constructors;

public class Movie {
	
	String name;
	String director;
	String producer;
	String hero;
	String heroine;
	double budget;
	
	public Movie() {
		System.out.println("no arg constructor called");
		
	}
	Movie(String director){
		this.director= director;
	}
	
	Movie(Movie m,String producer, String name){
		this.director=m.director;
		this.producer=producer;
		this.name=name;
	}
	Movie(Movie m, String hero, String heroine, double budget){
		this.director=m.director;
		this.producer=m.producer;
		this.name=m.name;
		this.hero=hero;
		this.heroine=heroine;
		this.budget=budget;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m=new Movie("Atlee");
		m.Movieinfo();
		
		Movie m1=new Movie(m,"Allu Aravind","RAAKA");
				m1.Movieinfo();
				
				Movie m2=new Movie(m1,"Allu Arjun","Deepika",50000000000.00);
				m2.Movieinfo();
				
				
	}
	
	void Movieinfo() {
		System.out.println("************************");
		System.out.println("Name of the movie:"+name);
		System.out.println("Name of the Director:"+director);
		System.out.println("Name of the Producer:"+producer);
		System.out.println("Name of the Hero:"+hero);
		System.out.println("Name of the Heroine:"+heroine);
		System.out.println("Budget of the movie:"+budget);
		
	}

}
