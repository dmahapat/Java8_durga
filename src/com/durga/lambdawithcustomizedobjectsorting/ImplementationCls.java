package com.durga.lambdawithcustomizedobjectsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImplementationCls {

    static public void main(String[] args){

        Employee employee = new Employee(1,"Debasish");
        System.out.println(employee);

        //Sort list of Employee objects

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        employees.add(new Employee(3,"Prashant"));
        employees.add(new Employee(21,"Tumtum"));
        employees.add(new Employee(4,"Sagar"));
        employees.add(new Employee(23,"Das"));
        employees.add(new Employee(12,"Panda"));

        System.out.println("Natural Sorting Order:" +employees);
        Collections.sort(employees,(employee1,employee2) -> (employee1.employeeId>employee2.employeeId) ? -1 :
                (employee1.employeeId<employee2.employeeId)? +1 : 0);
        System.out.println("Customized descending Sorting Order:" +employees);

    }
}
