package com.javaintro;

public class CricketPlayer {
	
	static String teamName= "India";
	
	int runs;
	String playerName;

	public static void main(String[] args) {
		System.out.println("Welcome to the world of Indian Cricket");
		
		CricketPlayer p1= new CricketPlayer();
		CricketPlayer p2= new CricketPlayer();
		
		p1.playerName= "Suresh Raina";
		p1.runs=113;
		
		System.out.println("Player 1 Details:");
		System.out.println("Player Name:"+p1.playerName);
		System.out.println("Runs :"+p1.runs);
		System.out.println("Team Name:"+teamName);
		
		p2.playerName= "Akhil";
		p2.runs=87;
		
		System.out.println("Player 2 Details:");
		System.out.println("Player Name:"+p2.playerName);
		System.out.println("Runs :"+p2.runs);
		System.out.println("Team Name:"+teamName);
		
		
	}

}
