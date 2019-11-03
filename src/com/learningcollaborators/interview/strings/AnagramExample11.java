package com.learningcollaborators.interview.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramExample11 {
	
	
	public static void main(String[] args) {
		List<String> myAnagramList = Arrays.asList("aabb", "abab", "baab", "akas", "skaa", "mary", "army", "ab");
		Map<String, List<String>> myAnaMap = new HashMap<String, List<String>>();
		for (String string : myAnagramList) {
			char[] charArray = string.toCharArray();
			Arrays.sort(charArray);
			String key = String.valueOf(charArray);
			if(!myAnaMap.containsKey(key)) {
				myAnaMap.put(key, new ArrayList<>());
			}
				myAnaMap.get(key).add(string);
		}
		System.out.println("Anagram Map: " + myAnaMap);
	}
}
