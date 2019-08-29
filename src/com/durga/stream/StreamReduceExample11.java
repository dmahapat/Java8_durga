package com.durga.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample11 {
	
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        Float totalPrice = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,(sum, price)->sum+price);
        System.out.println("Total Price: "+totalPrice);
        /*Note about reduce operation
         1. it is present in Stream interface
         2. Many times, we need to perform operations where a stream reduces 
            to single resultant value, for example, maximum, minimum, sum, product,
            etc. Reducing is the repeated process of combining all elements.
         3. reduce operation applies a binary operator to each element in the 
            stream where the first argument to the operator is the return value of
            the previous application and second argument is the current stream element.
         4. Syntax:
            T reduce(T identity, BinaryOperator<T> accumulator);

			Where, identity is initial value 
			of type T and accumulator is a 
			function for combining two values.
		 5. sum(), min(), max(), count() etc. are some examples of reduce operations. 
		    reduce() explicitly asks you to specify how to reduce the data that made 
		    it through the stream.	      */
        // Another Example
        List<String> words = Arrays.asList("Alice", "Alyce", "Allis", 
                "Allice", "Alles");
        Optional<String> longestString = words.stream() 
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2); 
     // Displaying the longest String 
        longestString.ifPresent(System.out::println); 
        
	}

}
