package com.durga.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatch39 {
	
	public static void main(String[] args) {
		
		List<String> countries = Arrays.asList("USA","UK","Russia","China","UK");
		boolean answer = countries.stream()
				                  .allMatch(strVal->strVal.length()==2);
		System.out.println("IS EACH STRING OF LENGTH 2: "+answer);
		
	}

}
