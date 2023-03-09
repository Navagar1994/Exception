package org.test;

import java.util.Scanner;

public class Flipkart {
	
	  // IF THE PRODUCT IS NOT AVAILABLE BASED ON USER INPUT WE CAN ABLE TO THROW AN EXCEPTION BY  OURSELF WHEN THE CONDITION GETTING FAILED
	
	private void airPod() {
		System.out.println("what you looking for");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		
		if(a.equals("airpod ")) {
		System.out.println("airpod is available");
		}
		else {
			System.out.println("airpod is not available");  // throw
			throw new NullPointerException();
		}
	
		}
	public static void main(String[]args) {
		
		Flipkart f = new Flipkart();
		
		f.airPod();
	}
		

	}


