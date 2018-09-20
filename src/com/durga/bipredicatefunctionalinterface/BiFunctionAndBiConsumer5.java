package com.durga.bipredicatefunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class EmployeeObj {
    String name;
    double salary;

    EmployeeObj(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class BiFunctionAndBiConsumer5 {

    static public void main (String[] args) {
        List<EmployeeObj> employeeList = new ArrayList<>();
        BiFunction<String,Double,EmployeeObj> getEmployeeObject = (name,salary) -> new EmployeeObj(name,salary);

        employeeList.add(getEmployeeObject.apply("Roshni",45000.0));
        employeeList.add(getEmployeeObject.apply("Debasish",44000.0));
        employeeList.add(getEmployeeObject.apply("Deepankar",43000.0));
        employeeList.add(getEmployeeObject.apply("Sandeep",42000.0));
        employeeList.add(getEmployeeObject.apply("Subhasree",41000.0));

        BiConsumer<EmployeeObj,Double> incrementSalary = (employeeObj, aDouble) -> employeeObj.salary += aDouble;

        for (EmployeeObj e : employeeList) {
            incrementSalary.accept(e,500.0);
            System.out.println("Name: "+e.name);
            System.out.println("Salary: "+e.salary);
            System.out.println("********************");
        }






    }
}
