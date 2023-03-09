package org.test;

import java.io.IOException;
import java.util.Scanner;

public class Amazon   {
	
	    // throws-->>> Create a new Exception 
	    //  To supress(convert) the Compile time Exception into runtime Exception
	    //  Whenever we using "earBuds" we declare the exception near method or main method using "throws"keyword .
	
	private void earBuds() throws ProductNotFound, IOException {
		
		System.out.println("what you looking for");
		
		Scanner s = new Scanner(System.in);
		String a = s.next();
		
		if(a.equals("earBuds")) {
			System.out.println("earbuds is available");
		}
		else {
			System.out.println("earbuds is not available"); // throw -->> 
			throw new ProductNotFound();
		}
	}
	public static void main(String[]args) throws ProductNotFound, IOException {
		
		Amazon a = new Amazon();
		
		a.earBuds();
	}


}
