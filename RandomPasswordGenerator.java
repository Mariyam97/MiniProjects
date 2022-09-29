package Samples;

import java.util.*;
public class RandomPasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //String Password;
 int PasswordLength=10;
 
 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@$!%";
char[]	password = new char[10];
for(int i=0;i<10;i++) {  // loop is used to generate password of length 8
	int rand=(int) (Math.random()*passwordSet.length());
	password[i]=passwordSet.charAt(rand);
}
System.out.println(password);

}
}
