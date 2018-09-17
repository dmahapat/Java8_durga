package com.durga.consumerfunctionalinterface;

import java.util.function.Consumer;
/*
*
* Consumer contains only 2 methods "accept(abstract)" and "andThen(default)"
*
*
* */
class MovieObj{
    String name;
    String result;

    MovieObj(String name,String result) {
        this.name = name;
        this.result = result;
    }
}

public class ConsumerInterfaceExample4 {

    static public void main(String[] args) {
        Consumer<MovieObj> movieObjRelease = movieObj -> System.out.println(movieObj.name+" is ready to release");
        Consumer<MovieObj> resultOfMovie = movieObj -> System.out.println(movieObj.name+" is "+movieObj.result);
        Consumer<MovieObj> storeMovie = movieObj -> System.out.println(movieObj.name+" movie is stored to DB");

        Consumer<MovieObj> chainedConsumer = movieObjRelease.andThen(resultOfMovie).andThen(storeMovie);
        MovieObj obj = new MovieObj("Bahubali","hit");
        MovieObj obj1 = new MovieObj("Spyder","Flop");
        chainedConsumer.accept(obj);
        chainedConsumer.accept(obj1);
    }
}
