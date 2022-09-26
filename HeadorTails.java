package Day2;

import java.util.*;
public class HeadorTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("WELCOME TO VIRTUAL COIN TOSS GAME !!!!.");
		System.out.println();
		
		Random random = new Random();
		int randomSide = random.nextInt(2);
		
		if (randomSide == 1) {
			System.out.println("Heads");
		}else {
			System.out.println("Tails");
	}

}
}
