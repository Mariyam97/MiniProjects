 
package com.innovator.main;
import java.util.Scanner;

import com.innovator.service.*;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("WELCOME TO CURRENCY EXCHANGE OFFICE");
		System.out.println("Choose Option\n"
				+ "1. INR TO DOLLAR EXCHANGE\n"
				+ "2. DOLLAR TO INR EXCHANGE");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: INR_To_Dollar obj = new INR_To_Dollar();
				System.out.print("Please Enter the Rupees = ");
			    float rupees = sc.nextFloat();
				System.out.println("Your Dollars "+"="+ obj.rupees_to_Dollar(rupees));
				break;
			
		case 2: Dollar_To_INR obj1 = new Dollar_To_INR();
				System.out.print("Please Enter the Dollars = ");
				Float dollars = sc.nextFloat();
				System.out.println("Rupees "+"="+ obj1.dollar_to_Rupees(dollars));
				break;
				
		default:System.out.println("Please Enter the Valid Inputs");
			
			
		}
		
		System.out.println("THANK YOU FOR VISITING");
		System.out.println("===================================\n");
		
		
	}

	

}
