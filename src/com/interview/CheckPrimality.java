package com.interview;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPrimality {
    public static void main(String[] args) {

        IntPredicate isPrime = num -> (num > 1) && (IntStream.range(2,num/2 +1) .filter(n -> num%n == 0) .count() == 0);

        List<Integer> primeList = IntStream.range(1,100)
                                           .filter(isPrime)
                                           .boxed()
                                           .collect(Collectors.toList());
        System.out.println(primeList);
        System.out.println(primeList.size());
    }
}
