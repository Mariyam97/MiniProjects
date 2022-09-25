import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to JAVA  Pizza Deliveries !! ");
		
		System.out.print(" What size pizza do you want? S , M, or L  : ");
		char size = sc.next().charAt(0);;
		
		System.out.print(" Do you want  pepperoni ? Y or N : ");
		
		char add_pepperoni = sc.next().charAt(0);
		
		
		System.out.print(" Do you want extra_cheese ? Y or N : ");
		
		//char size = sc.next().charAt(0);;
		//char add_pepperoni = sc.next().charAt(0);
		char extra_cheese = sc.next().charAt(0);
		
		

	      int bill=0;
		
	     
	      
	      if(size =='S'){
	    	  bill +=15;
	      
	      }else if(size =='M'){
	    	  bill +=20;
	    	  
	      }else {
	    	  bill +=25;
	    	  
	    }
	      
		if(add_pepperoni == 'Y') {
			
			if(size == 'S') {
				bill +=2;
			
			}else {
				bill +=3;
			}
		}
		
		if(extra_cheese == 'Y') {
			bill +=1;
		}
		
		System.out.println(" Your Final bills is : $ " + bill);
	}

}
