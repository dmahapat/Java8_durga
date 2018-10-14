package com.pluralsight.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Patterns to build Optional
* 1. default constructor of Optional class is private
* 2. So we cannot build an Optional using new
* 3. We have static methods
*    e.g a. Optional<String> empty = Optional.empty();
*        b. Optional<String> nonEmpty = Optional.of(s); -- throws NullPointerException if s is empty
*        c. Optional<String> couldBeEmpty = Optional.ofNullable(s); -- if null value is passed,returns an empty optional
* 4. Family of methods on Optional class
*        a. Optional<U> map(Function<T,U> mapper); -- if T is empty, U also will be empty
*        b. Optional<T> filter(Predicate<T> filter); -- if predicate returns false - then this method returns empty optional
*        c. public void ifPresent(Consumer<T> consumer)
*
* ADVANCED USE OF "OPTIONAL"
*
*  1.
 *
*
* */
public class OptionalExample2 {
    public static void main(String[] args) {
        List<Double> doubles = Stream
                                     .iterate(0.0,aDouble -> aDouble + 1.00)
                                     .limit(6)
                                     .collect(Collectors.toList());
        System.out.println("List of doubles: "+doubles);
        List<Double> result = new ArrayList<>();
        // Writing a data processing pipeline using new Math class
        // in the below approach we cannot go parallel
        doubles.stream()
                .forEach(aDouble -> NewMath
                        .sqrt(aDouble)
                        .flatMap(NewMath::inv)
                        .ifPresent(result::add));

        Function<Double,Stream<Double>> invSqrt =
                d -> NewMath.inv(d)
                .flatMap(NewMath::sqrt)
                .map(Stream::of)
                .orElseGet(Stream::empty);

        List<Double> invSquareRootOfDoubles =
                doubles.stream()
                .parallel()
                .flatMap(invSqrt)
                .collect(Collectors.toList());
        System.out.println(invSquareRootOfDoubles);
    }
}
