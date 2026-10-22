package com.languagefundamentals_1.methods;

public class MobileRecharge {

	void main(String[] args) {
		showPlanDetails();
		recharge(299);
		
	}
//no return type+no arguments
	void showPlanDetails() {
		System.out.println("Current plan");
		System.out.println("Plan name:Unlimited 299");
		System.out.println("Pack validity:28 days");
		System.out.println("Data:1.5GB/Day");
		System.out.println("Calls:Unlimited");
		
		
	}
	//no return type+ with arguments
	void recharge(double amount) {
		System.out.println("\nRecharge Successfull!");
		System.out.println("Recharge Amount:"+amount);
	}
}
