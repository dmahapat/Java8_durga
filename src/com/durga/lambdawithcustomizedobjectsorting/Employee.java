package com.durga.lambdawithcustomizedobjectsorting;

public class Employee {

    int employeeId;
    String employeeName;


    Employee(int employeeId,String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
