package com.durga.predefinedfunctionalinterfaces;

/*
*interface Function <T,R>{
*
*}
*Here T - input parameter
*     R - return type
* */


import java.util.ArrayList;
import java.util.List;
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

public class FunctionalInterfaceFunctionExample {

    static public void main(String[] args) {
        Function<String,Integer> lengthOfString = s -> s.length();
        System.out.println("Length of string \"Debasish\" is: "+lengthOfString.apply("Debasish"));
        System.out.println("Length of string \"ISB\" is: "+lengthOfString.apply("ISB"));
        Function<Integer,Integer> squareIt = integer -> integer * integer;
        System.out.println("Square of 4 is: "+squareIt.apply(4));
        System.out.println("Square of 5 is: "+squareIt.apply(5));


        String sampleString = "Debasish graduated from ISB";
        Function<String,String> removeSpaces = s -> s.replaceAll(" ","");
        System.out.println("Sample string without spaces: "+removeSpaces.apply(sampleString));

        Function<String,Integer> countSpaces = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println("The number of spaces in sample string: "+countSpaces.apply(sampleString));

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Debasish",5));
        studentList.add(new Student("Deepankar",65));
        studentList.add(new Student("Sandeep",55));
        studentList.add(new Student("Subhasree",45));
        studentList.add(new Student("Roshni",100));

        Function<Student,String> getGrade = student -> {
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
        Predicate<Student> isMarkGreaterThanOrEqualto60 = student -> student.marks >= 60;
        for (Student s : studentList) {
            System.out.println("Name: "+s.name);
            System.out.println("Marks: "+s.marks);
            System.out.println("Grade: "+getGrade.apply(s));
            System.out.println("*******************");
        }
        System.out.println("Students with >=60 mark: ");
        for (Student s : studentList) {
            if(isMarkGreaterThanOrEqualto60.test(s)){
                System.out.println("Name: "+s.name);
                System.out.println("Marks: "+s.marks);
                System.out.println("Grade: "+getGrade.apply(s));
            }
            System.out.println("*******************");
        }

    }
}
