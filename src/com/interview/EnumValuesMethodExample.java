package com.interview;

/**
 * 1. Enum provides this values() method implicitly
 * 2. We cannot get reference of values() anywhere in java API
 * 3. apply javap java.lang.Enum to see java profile
 */

public class EnumValuesMethodExample {
    public static void main(String[] args) {
        Beer[] beers = Beer.values();
        for (Beer beer : beers) {
            System.out.println(beer);
        }
    }
}
