package com.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamConvertListToSet21 {
	
	public static void main(String[] args) {
		 List<Product> productsList = new ArrayList<Product>();  
		  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));
	        
	        Set<Float> priceSet = productsList.stream()
	        								  .filter(prod->prod.price<30000f)
	        								  .map(prod->prod.price)
	        								  .collect(Collectors.toSet());
	        System.out.println("Set of all prices: "+priceSet);
	}

}
