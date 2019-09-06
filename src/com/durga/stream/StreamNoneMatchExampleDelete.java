package com.durga.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNoneMatchExampleDelete {
	
	//To check that there is no element less than 0.
	public static void main(String[] args) {
		List<Integer> primeNumberList = IntStream.rangeClosed(1, 100)
				                                 .filter(StreamNoneMatchExampleDelete::primeCheck)
				                                 .boxed()
				                                 .collect(Collectors.toList());
		System.out.println(primeNumberList);
	}
	
	public static boolean primeCheck(int value) {
		return IntStream.range(2, value).noneMatch(valueCheck -> value % valueCheck == 0 );
	}
	
	/*public static IntStream streamOfValue() { 
		return IntStream.rangeClosed(1, 100).filter(StreamNoneMatchExampleDelete::primeCheck);
	}*/
}
