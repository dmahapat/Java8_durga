package com.pluralsight.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

class PersonSpliterator implements Spliterator {
    private final Spliterator<String> lineSpliterator;
    private String name;
    private int age;
    private String city;

    public PersonSpliterator(Spliterator<String> lineSpliterator) {
        this.lineSpliterator = lineSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer action) {
        if (this.lineSpliterator.tryAdvance(line -> this.name = line) &&
                this.lineSpliterator.tryAdvance(line -> this.age = Integer.parseInt(line)) &&
                this.lineSpliterator.tryAdvance(line -> this.city = line)) {

            Person person = new Person(name, age, city);
            action.accept(person);
            return true;
        }
        return false;

    }

    @Override
    public Spliterator trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}

public class SpliteratorExample1 {

    static public void main(String... args) {
        Path path = Paths.get("D:\\File\\people.txt");
        try {
            Stream<String> lines = Files.lines(path);
            Spliterator<String> lineSpliterator = lines.spliterator();
            Spliterator<Person> peopleSpliterator = new PersonSpliterator(lineSpliterator);

            Stream<Person> personStream = StreamSupport.stream(peopleSpliterator, false);
            personStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
