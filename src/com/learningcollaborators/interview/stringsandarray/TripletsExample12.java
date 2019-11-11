package com.learningcollaborators.interview.stringsandarray;

import java.util.Arrays;

public class TripletsExample12 {
	
	public static void main(String[] args) {
		int[] intArr = {2,1,4,3,7,10,5};
		Arrays.sort(intArr);
		for (int i = 0; i < intArr.length; i++) {
			printTriplets(intArr, intArr[i]);
		}
		
	}
	public static void printTriplets(int[] arr, int givenSum){
		int l = 0;
		int r = arr.length-1;
		while(l<r) {
			if(arr[l] + arr[r] > givenSum) {
				r--;
			}else if (arr[l] + arr[r] < givenSum) {
				l++;
			}else {
				System.out.println("Triplet: "+arr[l]+" "+arr[r]+" "+givenSum);
				r--;
			}
		}
	}
}
