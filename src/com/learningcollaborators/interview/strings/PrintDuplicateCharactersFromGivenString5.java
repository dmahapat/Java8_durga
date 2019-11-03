package com.learningcollaborators.interview.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// None works. look into it
// use map approach

public class PrintDuplicateCharactersFromGivenString5 {
	public static void main(String[] args) {
		// 2 for loop approach
		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder sBuilder = new StringBuilder();
		if(!input.isEmpty()) {
			char[] charArray = input.toCharArray();
			boolean isRepeated;
			for (int i = 0; i < charArray.length; i++) {
				isRepeated = false;
				for (int j = i+1; j < charArray.length; j++) {
					if(charArray[i] == charArray[j]) {
						isRepeated = true;
						sBuilder.append(charArray[i]);
					}
				}
			}
		}
		System.out.println("Repeated characters are: "+sBuilder.toString());
		
		// indexOf() method approach
		StringBuilder sb = new StringBuilder();
		int idx;
		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			idx = input.indexOf(charAt,i+1);
			if(idx != -1) {
				sb.append(charAt);
			}
		}
		System.out.println("Repeated characters are - (indexOf() approach): "+sb.toString());
		
		// Set approach
		StringBuilder stringBuilder = new StringBuilder();
		Set<Character> visited = new HashSet<>();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if(!visited.add(c)) {
				stringBuilder.append(c);
			}
		}
		System.out.println("Repeated characters are - (set approach): "+stringBuilder.toString());
	}
}
