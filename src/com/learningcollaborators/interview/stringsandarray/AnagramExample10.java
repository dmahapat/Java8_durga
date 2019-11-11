package com.learningcollaborators.interview.stringsandarray;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample10 {
	
	public static void main(String[] args) {
		System.out.println("Enter string 1");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		System.out.println("Enter string 2");
		String input2 = sc.next();
		System.out.println("Are anagram??: "+isAnagram(input1, input2));
		
	}
	
	public static boolean isAnagram(String string1,String string2) {
		boolean res = false;
		if(string1.length() == string2.length()) {
			char[] charArray = string1.toLowerCase().toCharArray();
			char[] charArray2 = string2.toLowerCase().toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			res = String.copyValueOf(charArray).equalsIgnoreCase(String.copyValueOf(charArray2));
		}
		return res;
	}

}
