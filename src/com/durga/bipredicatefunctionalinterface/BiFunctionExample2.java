package com.durga.bipredicatefunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Student {
    String name;
    int roll;

    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}

public class BiFunctionExample2 {

    static public void main(String[] args) {
        BiFunction<Integer,Integer,Integer> getProduct = (a,b) -> (a*b);
        System.out.println(getProduct.apply(10,20));

        //Create student object by providing name and roll number as input arguments
        List<Student> studentList = new ArrayList<Student>();
        BiFunction<String,Integer,Student> getStudentObj = (name,roll) -> new Student(name,roll);

        studentList.add(getStudentObj.apply("Roshni",1));
        studentList.add(getStudentObj.apply("Debasish",2));
        studentList.add(getStudentObj.apply("Deepankar",3));
        studentList.add(getStudentObj.apply("Sandeep",4));
        studentList.add(getStudentObj.apply("Subhasree",5));

        System.out.println(studentList);




    }
}
