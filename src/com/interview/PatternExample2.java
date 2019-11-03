package com.interview;

import java.util.Scanner;

public class PatternExample2 {
	public static void main(String[] args) {
		System.out.println("Please enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("The pattern is: ");
		for (int i = 1; i <= rows; i++) {
			for(int j=1;j<=rows-i+1;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
		sc.close();
	}

}
