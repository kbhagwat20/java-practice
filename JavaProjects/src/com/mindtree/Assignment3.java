package com.mindtree;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		
	    String no = sc.nextLine();
	    
	    switch(no) {
	    case "one":
	    	System.out.println("number is 1");
	    	break;
	    	
	    case "two":
	    	System.out.println("number is 2");
	    	break;
	    	
	    case "three":
	    	System.out.println("number is 3");
	    	break;
	    	
	    default:
	    	System.out.println("We couldn't find");
	    }
		

	}

}
