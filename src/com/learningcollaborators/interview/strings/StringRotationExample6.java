package com.learningcollaborators.interview.strings;

import java.util.Scanner;

public class StringRotationExample6 {
	public static void main(String[] args) {
		System.out.println("Enter string 1: ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		System.out.println("Enter string 2: ");
		String input2 = sc.next();
		boolean isRotation = ((input1.length() == input2.length()) && ((input1+input1).contains(input2)));
		System.out.println("2 strings are rotations of each other: "+isRotation);
		sc.close();
	}

}
