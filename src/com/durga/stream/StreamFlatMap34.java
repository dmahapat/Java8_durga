package com.durga.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 1. Stream.flatMap() helps convert Collection<Collection<T>> to Collection<T>.
 * 2. flatMap() = map() + flattening
 * 3. What is flattening?
 *    
 *    Flattening is referred by converting several lists of lists, and merge all those lists to create single 
 *    list containing all the elements from all the lists.
 *    
 *    Before flattening   : [[1, 2, 3], [4, 5], [6, 7, 8]]
	  After flattening    : [1, 2, 3, 4, 5, 6, 7, 8]
 * 
 *    Syntax:
 *    <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
 *    
 *    Stream interface has three more similar methods which produce IntStream, LongStream and DoubleStream respectively 
 *    after the flatMap operation. If the streams created after flatMap() operations have given return types then consider using these functions directly.
 *    
 *    IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
	  LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
      DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamFlatMap34 {
	
	public static void main(String[] args) {
		List<Integer> listOne = Arrays.asList(1,2,3);
		List<Integer> listTwo = Arrays.asList(4,5,6);
		List<Integer> listThree = Arrays.asList(7,8,9);
		
		List<List<Integer>> listOfLists = Arrays.asList(listOne,listTwo,listThree);
		
		//Collecting the listOfLists in a single list
		List<Integer> allIntegers = listOfLists.stream()
				                               .flatMap(list->list.stream())
				                               .collect(Collectors.toList());
		System.out.println("ALL INTEGERS: "+allIntegers);
		
	}

}
