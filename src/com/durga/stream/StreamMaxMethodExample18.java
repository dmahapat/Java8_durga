package com.durga.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Implementation of Stream.max() 
//to get the maximum element 
//of the Stream according to the 
//provided Comparator.
public class StreamMaxMethodExample18 {
	public static void main(String[] args) {
		// Creating a list of Strings 
        List<String> list = Arrays.asList("G", "E", "E", "K", 
                                          "g", "e", "e", "k"); 
  
        // using Stream.max() method with Comparator 
        // Here, the character with maximum ASCII value 
        // is stored in variable max 
        String max = list.stream().max(Comparator. 
                       comparing(String::valueOf)).get(); 
        System.out.println(max);
        
	}
}
