package com.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMaxMethodExample19 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
        
        Optional<Product> prd = productsList.stream()
        		                  .max((p1,p2)->p1.price > p2.price ? 1 : ((p1.price == p2.price) ? 0 : -1));
        Product prd1 = productsList.stream()
                .max((p1,p2)->p1.price > p2.price ? 1 : ((p1.price == p2.price) ? 0 : -1)).get();
        prd.ifPresent(System.out::println);
        System.out.println(prd1);
	}
}
