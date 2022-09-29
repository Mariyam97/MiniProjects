package Samples;

import java.util.*;
public class OTPGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otpSet="1234567890";
		char[]	otp = new char[4];
		for(int i=0;i<4;i++) {  // loop is used to generate password of length 8
			int rand=(int) (Math.random()*otpSet.length());
			otp[i]=otpSet.charAt(rand);
		}
		System.out.println(otp);

	}

}
