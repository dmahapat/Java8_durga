package com.durga.bipredicatefunctionalinterface;

/*
* Consumer takes only one input,does not return anything
* BiConsumer takes 2 inputs*
* */


import java.util.function.BiConsumer;

public class BiConsumer4 {

    static public void main (String[] args) {

        Employee employee = new Employee(1,"Roshni",1500);
        TimeSheet timeSheet = new TimeSheet(1,15);

        BiConsumer<String,String> biConsumer = (s, s2) -> System.out.println(s+s2);
        biConsumer.accept("Debasish"," Mahapatra");

    }

}
