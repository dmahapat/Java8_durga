package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestStringSequenceExample {
	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		List<String> myMap = getUniqueCharacterSubstringBruteForce(input);
		System.out.println(myMap);
	}

	static List<String> getUniqueCharacterSubstringBruteForce(String input) {
		List<String> myList = new ArrayList<String>();
		Set<Character> visited = new HashSet<>();

		for (int start = 0; start < input.length(); start++) {
			StringBuilder sb = new StringBuilder("");
			for (int end = start; end < input.length(); end++) {
				char currChar = input.charAt(end);
					if (input.charAt(start) == input.charAt(end)) {
						sb.append(currChar);
					} else {
						myList.add(sb.toString());
						break;
					}

			}
		}
		return myList;
	}

}
