package com.durga.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample8 {
	
	public static void main(String[] args) {
		List<Product> prodList = Arrays.asList(new Product(1,"HP Laptop",25000f),
				new Product(2,"Dell Laptop",30000f),
				new Product(3,"Lenevo Laptop",28000f),
				new Product(4,"Sony Laptop",28000f),
				new Product(5,"Apple Laptop",90000f));
		
		List<Float> priceList = prodList.stream()
				                        .filter(product -> product.price > 30000f)
				                        .map(prod -> prod.price)
				                        .collect(Collectors.toList());
		System.out.println(priceList);
		
	}

}
