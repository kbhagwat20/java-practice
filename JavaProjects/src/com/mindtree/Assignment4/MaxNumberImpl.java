package com.mindtree.Assignment4;

import java.util.Scanner;

interface MaxNumber
{
	public int findMax(int a,int b);
	
	public int findMax(int a,int b,int c);
}

public class MaxNumberImpl implements MaxNumber
{
	public int findMax(int a,int b) {
		return a>b ? a:b ;
	}
	public int findMax(int a,int b,int c) {
		return findMax(a, findMax(b,c));
	}
}

class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNumber maxx = new MaxNumberImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter variables a,b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Largest number between a and b");
		System.out.println(maxx.findMax(a, b));
		
		System.out.println("\n Largest number among a, b and c");
		System.out.println(maxx.findMax(a,b ,c));
		

	}

}
