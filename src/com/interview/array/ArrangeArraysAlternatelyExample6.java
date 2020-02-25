package com.interview.array;

public class ArrangeArraysAlternatelyExample6 {
	public static void main(String[] args) {
		int[] givenArray = {1,2,3,4,5};
		int[] result = arrangeArrayAlternately(givenArray);
		for (int i : result) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] arrangeArrayAlternately(int[] a) {
		int[] result = new int[a.length];
		int s=0,e=a.length-1,k=0;
		int len = a.length;
		while (s<e) {
			result[k] = a[e];
			result[k] = a[s];
			k++;
			e--;
			s++;
		}
		/*for (int i = 0; i < len; i++) {
			result[k++]=a[len-1-i];
			result[k++]=a[i];
		}*/
		return result;
	}
}
