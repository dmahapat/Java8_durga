package com.durga.predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullFromListUsingPredicate {
    static public void main(String[] args){
        String[] names = {"Debasish","",null,"Preeta","Prerana","",null};
        Predicate<String> doesArrayContainNull = s -> (s != null) && (s.length() != 0);
        List<String> nameGroup = new ArrayList<String>();
        for (String name : names) {
            if(doesArrayContainNull.test(name)){
                nameGroup.add(name);
            }
        }
        System.out.println("List without null and empty string values: "+nameGroup);
    }
}
