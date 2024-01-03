package com.dinesh.java.app.MathsPracticeProblems;

import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The given factorial is");
		int num = sc.nextInt();
		int factnum = 1;
		for (int i = 1; i <= num; i++) { //for loop 
			System.out.println("\t" + i);
			factnum = factnum * i;
		}
			System.out.println("Factorial of " + num + "is" + factnum);
		//Hello	
	}
}