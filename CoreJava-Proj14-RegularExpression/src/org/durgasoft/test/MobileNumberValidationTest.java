package org.durgasoft.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidationTest {
	public static void main(String[] args){
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(args[0]);
		if(m.find() && m.group().equals(args[0])){
			System.out.println("Valid Mobile Number");
		}
		else{
			System.out.println("Nt a Valid Mobile Number");
		}
	}

}
