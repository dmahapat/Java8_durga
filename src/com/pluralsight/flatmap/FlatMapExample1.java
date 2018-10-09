package com.pluralsight.flatmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
* How to merge large amount of text and cut it into words using flatmap()
*
* */
public class FlatMapExample1 {
    public static void main(String[] args) throws IOException {
        Stream<String> stringStream1 = Files.lines(Paths.get("D:\\File\\TomSawer_01.txt"));
        Stream<String> stringStream2 = Files.lines(Paths.get("D:\\File\\TomSawer_02.txt"));
        Stream<String> stringStream3 = Files.lines(Paths.get("D:\\File\\TomSawer_03.txt"));
        Stream<String> stringStream4 = Files.lines(Paths.get("D:\\File\\TomSawer_04.txt"));

        /*System.out.println("stringStream1 count: "+stringStream1.count());
        System.out.println("stringStream2 count: "+stringStream2.count());
        System.out.println("stringStream3 count: "+stringStream3.count());
        System.out.println("stringStream4 count: "+stringStream4.count());*/
        //Stream.of takes varargs
        Stream<Stream<String>> streamOfStreams = Stream.of(stringStream1, stringStream2, stringStream3, stringStream4);
        //System.out.println("# of streams: "+streamOfStreams.count());
        //Below code takes every stream and puts it in a big stream
        //Stream<String> streamOfLines = streamOfStreams.flatMap(stream -> stream);
        //Alternative of above .. Function.Identity means it takes the same element and returns the same
        Stream<String> streamOfLINES = streamOfStreams.flatMap(Function.identity());
        //System.out.println("# of lines: "+streamOfLines.count());
        //System.out.println("# of lines: "+streamOfLINES.count());


        Function<String,Stream<String>> lineSplitter = line -> Pattern.compile(" ").splitAsStream(line);
        Stream<String> streamOfWords = streamOfLINES.flatMap(lineSplitter)
                                                    .map(String::toLowerCase)
                                                    .filter(word -> word.length() == 4)
                                                    .distinct();
        System.out.println("# of words in novel: "+streamOfWords.count());

    }
}
