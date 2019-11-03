package com.learningcollaborators.interview.strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingDuplicatesFromAString4 {

	public static void main(String[] args) {
		System.out.println("Please enter a string: ");

		// Using Set approach
		/*
		 * Time Complexity: O(n) – runtime of the loop is directly proportional to the
		 * size of the input string
		 * 
		 * Auxiliary Space: O(n) – space required for the Set depends on the size of the
		 * input string; also, we're using the StringBuilder to store the result
		 * 
		 * Maintains Order: LinkedHashSet – Yes, HashSet – No
		 */
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] charArr = input.toCharArray();
		Set<Character> visited = new LinkedHashSet<>();
		for (char c : charArr) {
			visited.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : visited) {
			sb.append(character);
		}
		System.out.println("String without duplicates - (Java 7 way): " + sb.toString());
		System.out.println("**********************************************************");
		// **************************************************************

		// JAVA 8 approach - distinct()
		/*
		 * Time Complexity: O(n) – runtime of the loop is directly proportional to the
		 * size of the input string
		 * 
		 * Auxiliary Space: O(n) – since distinct uses a LinkedHashSet internally and
		 * we're also storing the resulting string in a StringBuilder object
		 * 
		 * Maintains Order: Yes – since the LinkedHashSet maintains the order of its
		 * elements
		 */
		StringBuilder sbJ8 = new StringBuilder();
		input.chars().distinct().forEach(c -> sbJ8.append((char) c));
		System.out.println("String without duplicates - (Java 8 way): " + sbJ8.toString());
		System.out.println("**********************************************************");

		// Using indexOf() - Java 7
		/*
		 * Time Complexity: O(n * n) – for each character, the indexOf method runs
		 * through the remaining string
		 * 
		 * Auxiliary Space: O(n) – linear space is required since we're using the
		 * StringBuilder to store the result
		 * 
		 * Maintains Order: Yes
		 */
		StringBuilder sBuilder = new StringBuilder();
		int idx;
		for (int i = 0; i < input.length(); i++) {
			char currChar = input.charAt(i);
			idx = input.indexOf(currChar, i + 1);
			if (idx == -1) {
				sBuilder.append(currChar);
			}
		}
		System.out.println("String without duplicates - (using indexOf()): " + sBuilder.toString());
		System.out.println("**********************************************************");
		// Using sorting
		/*
		 * Time Complexity: O(n log n) – the sort uses a dual-pivot Quicksort which
		 * offers O(n log n) performance on many data sets Auxiliary Space: O(n) – since
		 * the toCharArray method makes a copy of the input String Maintains Order: No
		 */
		StringBuilder stringBuilder = new StringBuilder();
		if (!input.isEmpty()) {
			char[] charArray = input.toCharArray();
			Arrays.sort(charArray);
			stringBuilder.append(charArray[0]);
			for (int i = 1; i < charArray.length; i++) {
				if (charArray[i] != charArray[i - 1]) {
					stringBuilder.append(charArray[i]);
				}
			}
		}
		System.out.println("String without duplicates - (using sorting): " + stringBuilder.toString());
		System.out.println("**********************************************************");

		// using 2 for loops
		/*
		 * Time Complexity: O(n * n) – we have an inner and an outer loop both
		 * traversing the input string
		 * 
		 * Auxiliary Space: O(n) – linear space is required since the chars variable
		 * stores a new copy of the string input and we're also using the StringBuilder
		 * to save the result
		 * 
		 * Maintains Order: Yes
		 */
		StringBuilder sBuilder2 = new StringBuilder();
		if (!input.isEmpty()) {
			char[] charArray = input.toCharArray();
			boolean isRepeated;
			for (int i = 0; i < charArray.length; i++) {
				isRepeated = false;
				for (int j = i + 1; j < charArray.length; j++) {
					if (charArray[i] == charArray[j]) {
						isRepeated = true;
						break;
					}
				}
				if (!isRepeated) {
					sBuilder2.append(charArray[i]);
				}
			}
		}
		System.out.println("String without duplicates - (using 2 for loops): " + sBuilder2.toString());
		System.out.println("**********************************************************");
		sc.close();
	}

}
