package com.pluralsight.streamofnumbers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/*
* 1.Suppose we have a stream of people<Person object> and we want to average the ages of all the people whose age > 29
* 2.But it(average) is available in IntStream
* */
public class StreamOfNumbersExample1 {
    public static void main(String[] args) throws IOException {
        Set<String> shakespeareWords =
                Files.lines(Paths.get("D:\\File\\words.shakespeare.txt"))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        Set<String> scrabbleWords =
                Files.lines(Paths.get("D:\\File\\ospd.txt"))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println("# of words of shakespere: "+shakespeareWords.size());
        System.out.println("# of words of scrabble: "+scrabbleWords.size());

        final int[] scrabbleEnScore = {
//              a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p,  q, r, s, t, u, v, w, x, y,  z
                1, 3, 3, 2, 1, 5, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10
        };

        Function<String,Integer> score =
                word -> word.chars().map(letter -> scrabbleEnScore[letter - 'a']).sum();

        ToIntFunction<String> intScore =
                word -> word.chars().map(letter -> scrabbleEnScore[letter - 'a']).sum();

        System.out.println("Score of \"hello\": "+intScore.applyAsInt("hello"));

        String word =
                shakespeareWords
                .stream()
                .filter(word1 -> scrabbleWords.contains(word1))
                .max(Comparator.comparing(score))
                .get();

        System.out.println("The best word is: "+word);

        IntSummaryStatistics intSummaryStatistics = shakespeareWords.stream()
                .filter(scrabbleWords::contains)
                .mapToInt(intScore)
                .summaryStatistics();

        System.out.println("Status: "+intSummaryStatistics);



    }
}
