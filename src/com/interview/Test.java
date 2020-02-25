package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		/*List<Integer> myList = new ArrayList<Integer>();
		myList.add(null);
		myList.add(null);
		myList.add(null);
		myList.add(null);
		myList.add(null);
		System.out.println(myList.size());
		Set<Integer> mS = new HashSet<>();
		mS.add(null);
		mS.add(null);
		System.out.println(mS.size());*/
		
		Set<String> myHsSet = new HashSet<>();
		myHsSet.add("abc");
		System.out.println(myHsSet.contains("abc"));
		
		myHsSet.add(" ");
		System.out.println("SIZE: " +myHsSet.size());
	}

}
