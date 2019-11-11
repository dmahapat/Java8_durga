package com.learningcollaborators.interview.stringsandarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancedParenthesisExample13 {
	
	public static void main(String[] args) {
		System.out.println("Enter a parenthesis pattern: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean isBalancedParenthesis = isBalancedParen(input);
		if(isBalancedParenthesis) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not balanced");
		}
		sc.close();
	}
	
	public static boolean isBalancedParen(String inString) {
		List<Character> chList = new ArrayList<Character>();
		boolean result = false;
		for (int i = 0; i < inString.length(); i++) {
			if((inString.charAt(i) == '(') ||
					(inString.charAt(i) == '[') || 
					(inString.charAt(i) == '{')) {
				chList.add(inString.charAt(i));
			}else if ((inString.charAt(i) == ')') ||
					(inString.charAt(i) == ']') || 
					(inString.charAt(i) == '}')) {
				if(chList.isEmpty()  || !isValidPair(inString.charAt(i), chList)) {
					return false;
				}else {
					chList.remove(chList.size()-1);
				}
			}
		}
		result = chList.isEmpty();
		return result;
	}
	
	public static boolean isValidPair(Character ch,List<Character> list) {
		Character tol = list.get(list.size()-1);
		boolean result = false;
		if(!list.isEmpty()) {
			if((ch==')' && tol == '(') || (ch=='}' && tol == '{') || (ch==']' && tol == '[')) {
				result = true;
			}else {
				result = false;
			}	
		}
		return result;
	}

}
