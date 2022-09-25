package Day1;

import java.util.*;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ROCK PAPER SCISSORS GAME!!!!.");
		System.out.println();
		
		
		System.out.println("What do you choose? \n 0 for Rock, \n 1 for Paper  \n 2 for Scissors.");
		
		int option = sc.nextInt();
		
		switch(option) {
		
		case 0 : System.out.println("ROCK");break;
		
		case 1: System.out.println("PAPER");break;
		
		case 2 : System.out.println("SCISSORS");break;
			    
		}
		// Random no
		//int min = 0;
		//int max = 2;
		Random random = new Random();
		int computerChoice = random.nextInt(1);
		
		
		
		
		if (option >=3 || option < 0) { 
			System.out.println("You typed an invalid number, you lose!");
		
		}else if (option == 0 && option == 2){
			System.out.println("You win!");
			
		}
	else if (computerChoice == 0 && option == 2) {
			System.out.println("You lose");
			
		}
	else if( computerChoice > option) {
			System.out.println("You lose");
		
	   }else if (option > computerChoice) {
		 System.out.println("You win!");
		
	   }	else if(computerChoice == option) {
		   System.out.println("It's a draw");
	}
	}
}
