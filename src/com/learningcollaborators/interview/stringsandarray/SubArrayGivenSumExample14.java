package com.learningcollaborators.interview.stringsandarray;

public class SubArrayGivenSumExample14 {

	public static void main(String[] args) {
		int[] arr = {3,2,7,1,6};
		int sum = 10;
		printSubArray(arr, sum);
	}
	public static void printSubArray(int[] arr,int sum) {
		/*int l = 0;
		int r = arr.length - 1;
		while (l<r) {
			if(arr[l]+arr[r] > sum) {
				
			}
		}*/
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j] == sum) {
					
				}
			}
		}
	}
}
