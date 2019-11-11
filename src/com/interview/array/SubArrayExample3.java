package com.interview.array;

public class SubArrayExample3 {
	
	public static void main(String[] args) {
		int[] arr = {1,3,0,0,0,5,7};
		int givenSum = 8;
		findGivenSumOfSubArray(arr,givenSum);
	}
	
	public static int findGivenSumOfSubArray(int[] arr,int givenSum) {
		int arrayLength = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int currentSum = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if(currentSum == givenSum) {
					System.out.println("Sub array found between "+i+" index and "+(j-1)+" index inclusive");
					return 1;
				}
				if (currentSum > givenSum || j==arrayLength) {
					break;
				}
				currentSum+=arr[j];
				
			}
		}
		System.out.println("No Subarrays found");
		return 0;
	}

}
