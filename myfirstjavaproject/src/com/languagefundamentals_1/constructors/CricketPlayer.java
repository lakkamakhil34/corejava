package com.languagefundamentals_1.constructors;
import java.util.Scanner;

public class CricketPlayer {
	
	String playerName;
	int matchesPlayed;
	double totalRuns;
	
	CricketPlayer(String playerName, int matchesPlayed, double totalRuns){
		this.playerName=playerName;
		this.matchesPlayed=matchesPlayed;
		this.totalRuns=totalRuns;
	}
	
	void displayplayerDetails() {
		double averageRuns=(double) totalRuns/matchesPlayed;
		
		System.out.println("****Stats****");
		System.out.println("Player Name:"+ playerName);
		System.out.println("Matches Played:"+matchesPlayed);
		System.out.println("Total Runs:"+totalRuns);
		System.out.println("Average Runs:"+ averageRuns);
		
	}

	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Player Name:");
		String playerName=sc.nextLine();
		
		System.out.println("Enter Matches Played:");
		int matchesPlayed=sc.nextInt();		
		
		System.out.println("Enter Total runs:");
		double totalRuns=sc.nextDouble();
		
		
		CricketPlayer p=new CricketPlayer(playerName,matchesPlayed,totalRuns);
	p.displayplayerDetails();
		
		System.out.println("main method ended");
		

	}

}
