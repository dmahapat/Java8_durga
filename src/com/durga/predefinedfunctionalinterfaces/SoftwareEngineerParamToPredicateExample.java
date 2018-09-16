package com.durga.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

class SoftwareEngineer {
    String name;
    int age;
    boolean hasGf;

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasGf=" + hasGf +
                '}';
    }

    SoftwareEngineer(String name, int age, boolean hasGf) {
        this.age = age;
        this.hasGf = hasGf;
        this.name = name;
    }

}


public class SoftwareEngineerParamToPredicateExample {

    static public void main(String[] args) {
        SoftwareEngineer[] softwareEngineers = {new SoftwareEngineer("Debasish",19,true),
        new SoftwareEngineer("Deepankar",10,true),
        new SoftwareEngineer("sandeep",25,false),
        new SoftwareEngineer("Ashik",189,true)};

        Predicate<SoftwareEngineer> isAllowedToPub = softwareEngineer -> softwareEngineer.age > 18 && softwareEngineer.hasGf;
        System.out.println("The allowed members to pub are: ");
        for (SoftwareEngineer softwareEngineer : softwareEngineers) {
            if(isAllowedToPub.test(softwareEngineer)){
                System.out.println(softwareEngineer);
            }
        }


    }


}
