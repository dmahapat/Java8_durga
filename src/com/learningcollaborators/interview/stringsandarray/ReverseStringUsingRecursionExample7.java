package com.learningcollaborators.interview.stringsandarray;

import java.util.Scanner;
import java.util.function.Consumer;

public class ReverseStringUsingRecursionExample7 {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		reverseString(input);
		sc.close();
	}
	
	public static void reverseString(String input) {
		if(input.length() != 0) {
			System.out.print(input.charAt(input.length()-1));
			reverseString(input.substring(0,input.length()-1));
		}
	}
}
