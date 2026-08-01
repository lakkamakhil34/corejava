package com.languagefundamentals_1.constructors;

public class Vehicle {
	
//parent or super or base
			String model="cl";
			String brand="fg";
			double price=2330;
			


	public static void main(String[] args) {
		System.out.println("main method started from Vehicle");
				
				
		System.out.println("main method ended for Vehicle");
				
				}
			
			

		}

		//child sub or derived
		class Bike extends Vehicle{
			
			String model="l";
			String brand="g";
			double price=330;
			
			public static void main(String[]args) {
				System.out.println("main method started from Bike");
				
		//by using child object&child reference, we can access both child&parent
		//class function		
				Bike b= new Bike();
				b.Vehicleinfosub();
				b.Vehicleinfosup();
				
		//Cannot use this in a static context		
				//System.out.println(this.model);
		//Cannot use super in a static context
				//System.out.println(super.model);
				
				System.out.println("main method ended from Bike");
				
			}
			void Vehicleinfosub() {
				System.out.println("Model of Vehicle:"+this.model);
				System.out.println("Brand of Vehicle:"+this.brand);
				System.out.println("Price of Vehicle:"+this.brand);

				}
			
			void Vehicleinfosup() {
				System.out.println("Model of Vehicle:"+super.model);
				System.out.println("Brand of Vehicle:"+super.brand);
				System.out.println("Price of Vehicle:"+super.brand);

				}
			
		
		

	}


	


