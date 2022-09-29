package Samples;

import java.util.Scanner;
public class TreasureIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to Treasure Island.");
		System.out.println();
		System.out.println("Your mission is to find the treasure.");
		
		System.out.println();
		
	System.out.println("You\'re at a cross road. Where do you want to go?\n 1. Left \n 2. Right");
	 int crossRoad=sc.nextInt();
	 //System.out.println();
		if(crossRoad==1) {
			
			System.out.println("'You\\'ve come to a lake. There is an island in the middle of the lake. \n 1.Wait for a boat.\n 2.To swim across.");
			 int crossLake=sc.nextInt();
			 if(crossRoad==1) {
				 System.out.println("Wait");
				 System.out.println();
				 System.out.print("You arrive at the island unharmed. There is a house with 3 doors.\n 1.Red,\n 2.Yellow.\n 3.blue.\n Which colour do you choose? : ");
				 int door=sc.nextInt();
				 System.out.println();
				 switch(door) {
				 case 1:  System.out.println("It's a room full of fire. Game Over.");
				 			break;
				 case 2:  System.out.println("You found the treasure! You Win!");
		 					break;	
				 case 3 :System.out.println("You enter a room of beasts. Game Over.");
		 			
				 }
			 }else {
				 System.out.println("You get attacked by an angry trout. Game Over.");
			 }
			 
		}else {
			System.out.println("You fell into a hole. Game Over.");
		}
	}

}
