package com.mindtree.Assignment2;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ten values:");
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for(int i=0;i<10;i++)
		{
			arr1[i] = sc.nextInt(); 
		}
		
		System.out.print("Array is: ");
		
		for(int element: arr1) 
		{
			System.out.print(element+" ");
		}
		
		System.out.println();
		
		System.out.print("Reverse of Array is: ");
		
		for(int i = 0; i<10; i++) 
		{
			arr2[i] = arr1[10-i-1];
		}
		
		for(int element: arr2)
		{
			System.out.print(element+" ");
		}
		

	}

}
