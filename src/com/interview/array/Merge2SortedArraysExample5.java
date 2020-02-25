package com.interview.array;

public class Merge2SortedArraysExample5 {
	
	public static void main(String[] args) {
		int[] b = {1,3,4,5};
		int[] a = {2,3,4,6,7,8,9};
		int aLength = a.length;
		int bLength = b.length;
		
		int[] resultantArr = mergeSortedArrays(a,b,aLength,bLength);
		for (int i : resultantArr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] mergeSortedArrays(int[] a,int[] b,int aLength,int bLength) {
		int[] result = new int[aLength+bLength];
		int i=0,j=0,k=0;
		while (i<aLength && j<bLength) {
			if(a[i] < b[j]) {
				result[k++] = a[i++];
			}else {
				result[k++] = b[j++];
			}
		}
		while (i<aLength) {
			result[k++] = a[i++];
		}
		while (j<bLength) {
			result[k++] = b[j++];
		}
		
		return result;
	}

}
