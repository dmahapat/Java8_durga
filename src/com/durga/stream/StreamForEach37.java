package com.durga.stream;

import java.util.Arrays;
import java.util.List;

public class StreamForEach37 {
	public static void main(String[] args) {
		List<String> continents = Arrays.asList("Asia","Africa","North America","South America","Antartica","Europe","Australia");
		
		continents.stream().forEach(System.out::println);
	}

}
