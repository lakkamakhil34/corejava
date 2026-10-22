package com.languagefundamentals_1.constructors;

public class Quiz  {

	String subject;
	int totalques;
	int timelmt;
	
	Quiz(){
		this("Java");
		System.out.println("Quiz()constructor executed");
	}
	
	Quiz(String subject){
		this(subject,10);
		System.out.println("Quiz(subject)constructor executed");
	}

	
	Quiz(String subject,int totalques){
		this(subject,totalques,40);
		System.out.println("Quiz(subject,total questions)constructor executed");
	}
	
	
	Quiz(String subject, int totalques, int timelmt) {
		this.subject = subject;
		this.totalques = totalques;
		this.timelmt = timelmt;
		System.out.println("Quiz(subject,totalques,timelmt called)");
	}

	
	public static void main(String[] args) {
		System.out.println("main method started");
		Quiz q=new Quiz();
		
 System.out.println("main method ended");
		
		
	}

}
