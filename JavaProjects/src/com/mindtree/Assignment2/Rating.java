package com.mindtree.Assignment2;
import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rating from 1 to 5: ");
		int a = sc.nextInt();
		
		if(a<3) {
			System.out.print("Bad rating");
		}
		else if(a==3) {
			System.out.print("Average rating");
		}
		else if(3<a && a<=5)
		{
			System.out.print("Good rating");
		}
		else {
			System.out.print("Enter rating between 1 to 5");
		}

	}

}
