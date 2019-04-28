package com.interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileWordCounter {

    public static void main(String[] args) {

        try(Stream<String> fileLines = Files.lines(Paths.get("D:\\Ingenico\\word.txt"))){
            Map<String,Long> map = fileLines.flatMap(line -> Arrays.stream(line.trim().split(" ")))
                     .map(String::toLowerCase)
                     .filter(word -> !word.isEmpty())
                     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(map);
        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
