package com.interview;

/**
 * Purpose of ordinal()
 *
 * 1. gets the index value of element in enum
 */
public class OrdinalMethodExample {
    public static void main(String[] args) {
        Beer[] beers = Beer.values();
        for (Beer beer : beers) {
            System.out.println(beer.ordinal()+"========="+beer);
        }
    }

}
