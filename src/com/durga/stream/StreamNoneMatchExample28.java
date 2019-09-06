package com.durga.stream;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatchExample28 {
	
	//To check that there is no element less than 0.
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(-1,2,0,1246,876);
		boolean answer = integers.stream().noneMatch(intValue->intValue<0);
		System.out.println("NO VALUE LESS THAN 0????"+answer);
	}

}
