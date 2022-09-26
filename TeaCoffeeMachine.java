package Day2;


import java.util.Scanner;
public class TeaCoffeeMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("WELCOME TO TEA COFFEE VENDING MACHINE");
		System.out.println();
		
		
		//int testCase= sc.nextInt();
	//	for (int i=0; i<testCase;i++) {
			
		System.out.println("What do you choose?  \n 1 for Tea  \n 2 for Coffee.");
		int option = sc.nextInt();
		
		
		int bill = 0;
		
		
		
		switch(option) {
		
		case 1: System.out.println("Select your Favorite TEA "
				+ "\n 1. BlACK TEA"
				+ "\n 2. GREEN TEA"
				+ "\n 3. YELLOW TEA"
				+ "\n 4. HERBAL TEA");
				int teaOption = sc.nextInt();
				
				
				if(teaOption == 1) {
					bill+=10;
				
				}else if(teaOption == 2) {
					bill+=15;
				
				}else if(teaOption == 3) {
					bill+=20;
				
				}else if(teaOption == 4) {
					bill+=25;
				
				}
				System.out.println("Please Pay Bill of your " + "Favorite TEA" + " Rs " + bill );
				System.out.println();
				break;
				
		case 2: System.out.println("Select your Favorite COFFEE "
				+ "\n 1. BlACK COFFEE"
				+ "\n 2. ARABICA COFFEE"
				+ "\n 3. CAPPUCCINO "
				+ "\n 4. ESPRESSO");
				int coffeeOption = sc.nextInt();
				
				if(coffeeOption == 1) {
					bill+=10;
				
				}else if(coffeeOption== 2) {
					bill+=15;
				
				}else if(coffeeOption == 3) {
					bill+=20;
				
				}else if(coffeeOption == 4) {
					bill+=25;
				
				}
				System.out.println("Please Pay Bill of your " + "Favorite COFFEE" + " Rs " + bill );
				System.out.println();
				break;
		}
		
	}
	}
//}
