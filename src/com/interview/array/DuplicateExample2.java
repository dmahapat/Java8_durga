package com.interview.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateExample2 {
	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		findDuplicateUsingForLoop(arr);
		findDuplicatesUsingSet(arr);
	}
	// O(n*n)
	public static void findDuplicateUsingForLoop(int[] arr) {
		System.out.println("Duplicates using 2 for loop");
		System.out.println("*******************************");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate entry: "+arr[i]);
				}
			}
		}
	}
	//O(n)
	public static void findDuplicatesUsingSet(int[] arr) {
		System.out.println("******************************");
		System.out.println("Duplicate using set");
		System.out.println("******************************");
		Set<Integer> visited = new HashSet<>();
		for (int  i : arr) {
			if(!visited.add(Integer.valueOf(i))) {
				System.out.println("Duplicate entry: "+i);
			}
		}
	}
}
