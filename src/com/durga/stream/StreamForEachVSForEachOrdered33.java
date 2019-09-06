package com.durga.stream;

import java.util.stream.Stream;

/**
 * Question:
 * 
 *  System.out.println("forEach Demo");
	Stream.of("AAA","BBB","CCC").forEach(s->System.out.println("Output:"+s));
	System.out.println("forEachOrdered Demo");
	Stream.of("AAA","BBB","CCC").forEachOrdered(s->System.out.println("Output:"+s));
 * 
 * Output:
 * 
 *  forEach Demo
	Output:AAA
	Output:BBB
	Output:CCC
	forEachOrdered Demo
	Output:AAA
	Output:BBB
	Output:CCC
 * 
 * Please provide examples when 2 methods will produce different outputs.
 * 
 * @author DebasishM2
 *
 */
public class StreamForEachVSForEachOrdered33 {
	public static void main(String[] args) {
		Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
		System.out.println("\n**********");
		Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));	
	}
}
