package Day1;

import java.util.*;
public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
System.out.println("Welcome to the tip calculator!!!!.");
System.out.println("                             ");

System.out.print("What was the total bill? $ ");
float bill = sc.nextFloat();


System.out.print("How much tip would you like to give? 10, 12, or 15?  ");
int tip = sc.nextInt();
		
System.out.print("How many people to split the bill? ");
int people = sc.nextInt();

int tip_as_percent = tip / 100;
float total_tip_amount = bill * tip_as_percent;
float total_bill = bill + total_tip_amount;
float bill_per_person = total_bill / people;
double final_amount = Math.round(bill_per_person);

System.out.println("Each person should pay: " + final_amount);
	}

}
