package com.learningcollaborators.interview.stringsandarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * 
 * This code is case sensitive - to make it case insensitive use toLowerCase() - before processing the string
 * 
 * @author DebasishM2
 *
 */
public class MaximumOccuranceOfCharacterInAStringExample3 {
	
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		Map<String, Long> countMap = Arrays.stream(sentence.toLowerCase().split(""))
				                           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 		
		System.out.println(countMap);
		System.out.println("\n******************************************************");
		Optional<Entry<String, Long>> max = countMap.entrySet()
		        .stream()
		        .max(Comparator.comparing(Map.Entry::getValue));
		System.out.println("Maximum found using stream() - method reference");
		System.out.println("Maximum occuring character: "+ max.get().getKey() + " - "+ max.get().getValue());
		System.out.println("\n******************************************************");
		
		
		Optional<Entry<String, Long>> max2 = countMap.entrySet()
		        .stream()
		        .max((e1,e2)->e1.getValue().compareTo(e2.getValue()));
		System.out.println("Maximum found using stream() - lambda expression");
		System.out.println("Maximum occuring character: "+ max2.get().getKey() + " - "+ max2.get().getValue());
		System.out.println("\n******************************************************");
		
		
		Entry<String, Long> max3 = Collections.max(countMap.entrySet(),(e1,e2)->e1.getValue().compareTo(e2.getValue()));
		System.out.println("Maximum found using Collections.max() - method");
		System.out.println("Maximum occuring character: "+ max3.getKey() + " - "+ max3.getValue());
		System.out.println("\n******************************************************");
		
		System.out.println("Storing all the count in java 7 way: ");
		char[] charArr = sentence.toCharArray();
		Map<String, Long> traditionalCountMap = new HashMap<String, Long>();
		for (char c : charArr) {
			String currChar = Character.toString(c);
			if(traditionalCountMap.containsKey(currChar)) {
				long incrementedCnt = traditionalCountMap.get(currChar) + 1;
				traditionalCountMap.put(currChar, incrementedCnt);
			}else {
				traditionalCountMap.put(currChar, 1L);
			}
		}
		System.out.println("Occurances of each character: \n"+traditionalCountMap);
		System.out.println("******************************************************");
		Entry<String, Long> maxEntry = null;
		long maxCnt = 0;
		for (Entry<String, Long> entry : traditionalCountMap.entrySet()) {
			if(maxEntry == null || entry.getValue()>maxCnt) {
				maxCnt = entry.getValue();
				maxEntry = entry;
			}
		}
		System.out.println("Maximum occuring character: "+ maxEntry.getKey() + " - "+ maxEntry.getValue());
		sc.close();
	}

}
