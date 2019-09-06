package com.durga.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 1. Stream.max() returns the maximum element of the stream based on the 
 *    provided Comparator.
 * 2. A Comparator is a comparison function, which imposes a total ordering on 
 *    some collection of objects.    
 * 3. max() is a terminal operation which combines stream elements and returns a 
 *    summary result.
 * 4. max() is a special case of reduction.
 * 5. The method returns Optional instance.
 * 6. Syntax:
 *    Optional<T> max(Comparator<? super T> comparator)

		Where, Optional is a container object which
		may or may not contain a non-null value 
		and T is the type of objects
		that may be compared by this comparator
    7.	Exception : This method throws NullPointerException if the maximum 
        element is null.	      
 * @author DebasishM2
 *
 */



public class StreamMaxMethodExample16 {
	public static void main(String[] args) {
		// Creating a list of integers 
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        // Using stream.max() to get maximum 
        // element according to provided Comparator 
        // and storing in variable var
        Integer maxElem = list.stream()
        		              .max(Integer::compare)
        		              .get();
        System.out.println("The maximum element is: "+maxElem);
	}
}
