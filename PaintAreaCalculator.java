package Samples;

import java.util.*;
 
	 
	 
 

public class PaintAreaCalculator {
	Scanner sc = new Scanner(System.in);
	 float height=sc.nextInt();
	 float weight=sc.nextInt();
	 
		
	 public void PaintCalculate() {
	int coverage=5;
	
	float can =(float) Math.ceil((height * weight)/5);
	System.out.println("You will " +can);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

PaintAreaCalculator obj = new PaintAreaCalculator();
    obj.PaintCalculate();


		
	}

}
