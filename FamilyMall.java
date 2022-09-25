

import java.awt.Desktop;
import java.io.File;

import java.util.Scanner;

public class FamilyMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ======================================= ");
		
		
		System.out.println(" WELCOME to JAVA  FAMILY MALL !!!! ");
		
		
		System.out.println(" ======================================= ");
		
		
		System.out.println(" Which Topic you are Looking here ? "
				+ "\n 1. Introduction to Java."
				+ "\n 2. Classes and Objects."
				+ "\n 3. Arrays and Strings."
				+ "\n 4. Inheritance. ");
		
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
				try {
			Desktop.getDesktop().open(new File("/Users/bibimariyamsardar/Desktop/Files/Introduction+to+Java+Programming.pdf"));
				
				}catch(Exception e) {
					
				}
				break;
				//System.out.println(" ======================================= ");
		
		case 2:
			try {
		Desktop.getDesktop().open(new File("/Users/bibimariyamsardar/Desktop/Files/Classes%2C+Objects+%26+Methods.pdf"));
			
			}catch(Exception e) {
				
			}
			break;
		//	System.out.println(" ======================================= ");
			
		case 3:
			try {
		Desktop.getDesktop().open(new File("/Users/bibimariyamsardar/Desktop/Files/Arrays+And+Strings.pdf"));
			
			}catch(Exception e) {
				
			}
			break;
			//System.out.println(" ======================================= ");
			
		case 4:
			try {
		Desktop.getDesktop().open(new File("/Users/bibimariyamsardar/Desktop/Files/Inheritance.pdf"));
			
			}catch(Exception e) {
				
			}
			break;
			
			
			
			
	}
		
		System.out.println(" ======================================= ");
	}
}
