package com.logicalstatements;
import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you attending the class daily ..? ");
		boolean areYouAttendingClasses = sc.nextBoolean();
		
		if(areYouAttendingClasses) {
			System.out.println("You will understand the classes easily ");
			
			boolean areYouAttendingWeeklyExams = sc.nextBoolean();
			
			if(areYouAttendingWeeklyExams) {
				System.out.println("You can complete any Written test easily you will get more opportunities ");
			
				boolean areYouAttendingMocks = sc.nextBoolean();
				
				if(areYouAttendingMocks) {
					System.out.println("You will get job if you attend 20+ mocks without a doubt ");
				}else {
					System.out.println("Dont watse your time if you are not attending mocks you will get a job when varanasi movie release !!");
				}
				
			}else {
				System.out.println("You came to Hyd for Entertainment but not for job !!");
			}
			
		}else {
			System.out.println("You must need to go to Temple !! God will save you !");
		}
	}
	
	
}
