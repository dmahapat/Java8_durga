package com.pluralsight.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LiveCoding3 {
    public static void main(String[] args) {
        List<Double> result = new ArrayList<>();
/*        ThreadLocalRandom.current()
                .doubles(10_000).boxed()
                .parallel()
                .forEach(aDouble -> NewMath.inv(aDouble).ifPresent(inv ->NewMath.sqrt(inv).ifPresent(sqrt -> result.add(sqrt))));

        System.out.println(result.size());*/
        //above will give exception now - List is not threadSafe
        //Above is certainly not the way to use stream API

        Function<Double, Stream<Double>> flatMapper =
                aDouble -> NewMath.inv(aDouble)
                .flatMap(NewMath::sqrt) // instead of chaining using ifPresentMethod we are using flatMap method of Optional class for chaining
                .map(Stream::of) // if flat map method is not called - this map method will not be called
                .orElseGet(Stream::empty);

        List<Double> collect = ThreadLocalRandom.current()
                .doubles(10_000)
                .parallel()
                .map(operand -> operand*20 - 10)
                .boxed()
                .flatMap(flatMapper)
                .collect(Collectors.toList());
        System.out.println("collect size: "+collect.size());

    }
}
