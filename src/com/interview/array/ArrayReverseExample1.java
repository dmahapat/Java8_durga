package com.interview.array;

public class ArrayReverseExample1 {
	//Complexity : linear running time complexity
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] reversedArray = reverseArray(arr);
		for (int i : reversedArray) {
			System.out.print(i+" ");
		}
	}
	public static int[] reverseArray(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		while (endIndex>startIndex) {
			swap(arr,startIndex,endIndex);
			startIndex++;
			endIndex--;
		}
		return arr;
	}
	
	public static void swap(int[] arr,int startIndex,int endIndex) {
		int temp = arr[endIndex];
		arr[endIndex] = arr[startIndex];
		arr[startIndex] = temp;
	}
}
