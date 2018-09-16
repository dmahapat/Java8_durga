package com.durga.predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeObj {

    String name;
    double salary;

    @Override
    public String toString() {
        return "EmployeeObj{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    EmployeeObj(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}

public class FunctionFunctionalInterfaceExample2 {
    static public void main(String[] args) {
        List<EmployeeObj> employeeObjList = new ArrayList<EmployeeObj>();
        employeeObjList.add(new EmployeeObj("Debasish", 10));
        employeeObjList.add(new EmployeeObj("Roshni", 20));
        employeeObjList.add(new EmployeeObj("Deepankar", 30));
        employeeObjList.add(new EmployeeObj("Sandeep", 40));
        employeeObjList.add(new EmployeeObj("Subhasree", 50));


        Function<List<EmployeeObj>, Double> getTotalSalary = employeeObjs -> {
            double total = 0;
            for (EmployeeObj employeeObj : employeeObjs) {
                total += employeeObj.salary;
            }
            return total;
        };
        Predicate<EmployeeObj> isSalLessThan30 = employeeObj -> employeeObj.salary < 30;
        Function<List<EmployeeObj>, List<EmployeeObj>> getSpecifiedEmployees = employeeObjs -> {
            List<EmployeeObj> resultantList = new ArrayList<EmployeeObj>();
            for (EmployeeObj e : employeeObjs) {
                if (isSalLessThan30.test(e)) {
                    e.salary += 477;
                    resultantList.add(e);
                }
            }
            return resultantList;
        };


        System.out.println("The total salary of all employees: " + getTotalSalary.apply(employeeObjList));
        System.out.println("Employees with less than 30 sal got an increment of 477: "+getSpecifiedEmployees.apply(employeeObjList));
    }
}
