package Day1;

import java.util.Scanner;
public class BandNameGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Band Name Generator.");
		
		System.out.println("What's name of the city you grew up in?");
		String city=sc.nextLine();
		
		System.out.println("What's your pet's name?");
		String pet=sc.nextLine();
		
		System.out.println("Your band name could be " + city + " "+pet);
		
	}

}
