package com.mindtree;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four values: ");
		
		System.out.println("Enter boolean value 1: ");
		boolean var1 = sc.nextBoolean();
		System.out.println("Enter boolean value 2: ");
		boolean var2 = sc.nextBoolean();
		System.out.println("Enter integer value 1: ");
		int var3 = sc.nextInt();
		System.out.println("Enter integer value 2: ");
		int var4 = sc.nextInt();
		
		// && Operator
		System.out.println("And Operation: "+ (var1 && var2));
		
		// || Operator
		System.out.println("Or Operation: "+ (var1 || var2));
		
		// ! Operator
		System.out.println("Not Operatio: "+ (!var1));
		
		// Addition Operator
		System.out.println("Addition is: "+ (var3+var4));
		
		//Subtraction Operator
		System.out.println("Subtraction is: "+ (var3-var4));
		
		//Multiplication Operator
		System.out.println("Multication is: "+ (var3*var4));
		
		//Division Operator
		System.out.println("Division is: "+ (var3/var4));
				
	}

}
