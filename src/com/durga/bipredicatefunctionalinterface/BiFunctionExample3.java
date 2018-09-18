package com.durga.bipredicatefunctionalinterface;

import java.util.function.BiFunction;

class Employee {
    int eNo;
    String name;
    double dailyWage;

    Employee(int eNo,String name,double dailyWage) {
        this.eNo = eNo;
        this.dailyWage = dailyWage;
        this.name = name;
    }
}

class TimeSheet {
    int eNo;
    int days;

    TimeSheet(int eNo,int days) {
        this.days = days;
        this.eNo = eNo;
    }
}

public class BiFunctionExample3 {

    //To calculate monthly salary with Employee and TimeSheet object

    static public void main(String[] args) {
        Employee employee1 = new Employee(1,"Roshni",1500.0);
        TimeSheet timeSheet1 = new TimeSheet(1,30);
        BiFunction<Employee,TimeSheet,Double> getSalary = (employee, timeSheet) -> employee.dailyWage * timeSheet.days;
        System.out.println(getSalary.apply(employee1,timeSheet1));
    }
}
