package com.durga.consumerfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int marks;

    Student(String name,int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ConsumerInterfaceExample3 {

    static public void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Debasish",5));
        studentList.add(new Student("Deepankar",65));
        studentList.add(new Student("Sandeep",55));
        studentList.add(new Student("Subhasree",45));
        studentList.add(new Student("Roshni",100));

        Predicate<Student> isMarkGreaterThanOrEqualTo60 = student -> student.marks >= 60;
        Function<Student,String> getGrades = student -> {
                int marks = student.marks;
                if(marks >= 80){
                    return "A[Distinction]";
                }else if(marks >= 60){
                    return "B[FirstClass]";
                }else if(marks >= 50){
                    return "C[SecondClass]";
                }else if(marks >=35){
                    return "D[thirdClass]";
                }else {
                    return "E[Fail]";
                }
        };
        Consumer<Student> studentConsumer = student -> {
          System.out.println("Student Name:" +student.name);
          System.out.println("Student Marks:" +student.marks);
          System.out.println("Student Grade:"+getGrades.apply(student));
          System.out.println("*************************************");
        };

        for (Student st : studentList) {
            if(isMarkGreaterThanOrEqualTo60.test(st)){
                studentConsumer.accept(st);
            }
        }

    }
}
