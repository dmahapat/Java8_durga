package com.durga.predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

class Employee {
    String name;
    String designation;
    double salary;
    String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation) &&
                Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, salary, city);
    }

    Employee(String name, String designation, double salary, String city){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}

public class EmployeeManagementSystem {

    static public void display(Predicate<Employee> predicate, List<Employee> employeeList) {

        for (Employee employee : employeeList) {
            if(predicate.test(employee)){
                System.out.println(employee);
            }
        }
        System.out.println("*********************************************");

    }

    static public void main(String[] args){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Debasish","ceo",30000,"Hyderabad"));
        employeeList.add(new Employee("Sunny","Manager",20000,"Bangalore"));
        employeeList.add(new Employee("Aman","SE",1800,"Bangalore"));
        employeeList.add(new Employee("Biplab","SSE",30000,"Hyderabad"));
        employeeList.add(new Employee("Cierra","ASCON",30000,"Hyderabad"));

        Predicate<Employee> isManager = employee -> employee.designation.equalsIgnoreCase("manager");
        Predicate<Employee> isBangalorean = employee -> employee.city.equalsIgnoreCase("Bangalore");
        Predicate<Employee> isSalLessThan20K = employee -> employee.salary < 20000;
        System.out.println("List of Managers:");
        display(isManager,employeeList);
        System.out.println("List of Bangaloreans:");
        display(isBangalorean,employeeList);
        System.out.println("List of Employees deserving hike:");
        display(isSalLessThan20K,employeeList);
        System.out.println("List of managers who deserve pinkslip(managers from bangalore):");
        display(isManager.and(isBangalorean),employeeList);
        System.out.println("List of managers or sal<20K :");
        display(isManager.or(isSalLessThan20K),employeeList);
        System.out.println("List of employees who are not managers :");
        display(isManager.negate(),employeeList);
    }

}
