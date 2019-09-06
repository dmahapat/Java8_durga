package com.learning.binaryoperatorfunctionalinterface;

import java.util.function.BinaryOperator;

/**
 * "BinaryOperator" functional interface: 
 * 1. it represents a binary operator, 
 * 2. which takes 2 operands and operates on them to produce a result 
 * 3. However,what distinguishes it from a normal BiFunciton is that both of 
 *    its arguments and its return type are same. 
 * 4. This functional interface which takes in one generic namely :- 
 *    T: denotes the type of the input arguments and the return
 *    value of the operation 
 * 5. The BinaryOperator<T> extends the BiFunction<T, T,T> type. 
 *    So it inherits the following methods from the BiFunction Interface:
 * 
 *    apply(T t, T u) 
 *    andThen(Function<? super R, ? extends V> after) 
 * 6. The lambda expression assigned to an object of BiaryOperator type is used 
 *    to define its apply() which eventually applies the given operation on its 
 *    arguments. 
 * 7. Functions in BinaryOperator interface 
 *    maxBy(): 
 *    method signature: static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) 
 *    parameters: it takes in only one parameter namely,comparator Which is an object
 *    of Comparator class Returns: this method returns a BinaryOperator,which returns
 *    the max of 2 objects passed while calling it based on given Comparator
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */

public class BinaryOperatorExample1 {
	public static void main(String[] args) {
		BinaryOperator<Integer> operationMax = 
				BinaryOperator.maxBy((a,b)-> (a>b) ? 1 : ((a==b) ? 0 : -1));
		System.out.println(operationMax.apply(98, 1));
		
		BinaryOperator<Integer> operationMin = 
				BinaryOperator.minBy((a,b)-> (a>b) ? 1 : ((a==b) ? 0 : -1));
		System.out.println(operationMin.apply(98, 1));
		
		BinaryOperator<Integer> operation = (value1,value2) -> value1 * value2;
		System.out.println("Multiplication of 49 and 2 is: "+operation.apply(49, 2));
		
		
		
	}
}
