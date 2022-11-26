package handler;

import java.util.Scanner;

public class FuzzBUzz {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");	
		int num= sc.nextInt();
		System.out.println("Entered number is "+ num);
		
		//checkIfEvenOrOdd(num);
		//checkIfNumberIsPositiveOrNegative(num);
		//getName(num);
			
		printNumber(num);
	}
	
	public static void printNumber(int num) {
		/*
		 * if(num==3) { System.out.println("Three"); } else {
		 * System.out.println("Any Other Number"); }
		 *
		 */
		
		String str=(num==3)?"Three":"AnyOther Number";
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	public static void checkIfNumberIsPositiveOrNegative(int num) {
			
		if(num>0) {
			System.out.println("number is positive");
		}
		else if(num <0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("zero");
		}
	}
	public static void checkIfEvenOrOdd(int num) {
		if(num %2==0) {
			System.out.println("fuzz");
		}
		else {
			System.out.println("Buzz");
		}
	}
	
	public static void getName(int num) {
		
		int x=num;
		switch (x) {
		case 1:
			System.out.println("Monday");
			
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Everyday");
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
