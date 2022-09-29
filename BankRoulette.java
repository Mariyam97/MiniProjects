package Samples;
import java.util.*;
public class BankRoulette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Give me everybody's names, seperated by a comma. ");
		
		
		String[] names= {"Ali", "Aman", "Munawar", "Mariyam"};
		Random rand=new Random();
	    System.out.print(names[rand.nextInt(4)] + " is going to buy the meal today!");
		//String names[]=new String[4];
		/** for(int i=0; i<4; i++ ) {
			names[i]=sc.nextLine();
		}
		for(int i=0; i<4; i++ ) {
		System.out.print(names[i] + " ");
		}
		Random rand=new Random();
		
		System.out.print(names[rand.nextInt(4)] + " is going to buy the meal today!");
*/
}
}