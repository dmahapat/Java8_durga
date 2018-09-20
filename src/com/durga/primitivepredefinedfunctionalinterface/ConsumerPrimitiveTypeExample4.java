package com.durga.primitivepredefinedfunctionalinterface;

import com.durga.lambdawithcustomizedobjectsorting.Employee;

import java.util.function.*;

class EmployeeObject {
    String name;
    double sal;

    EmployeeObject(String name,double sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "EmployeeObject{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}


public class ConsumerPrimitiveTypeExample4 {

    static public void main(String[] args) {

        Consumer<Integer> displaySquare = integer -> System.out.println("Square of the passed number is:" +integer*integer);
        displaySquare.accept(5);

        //Better way of doing this above
        IntConsumer displayPrimitiveSquare = value -> System.out.println("Square of the passed number is(Primitive function):" +value*value);
        displayPrimitiveSquare.accept(6);

        /*
        * Similarly we have LongConsumer and DoubleConsumer
        *
        *
        * */

        //ObjIntConsumer<Employee>---- only give the object no need to pass return type
        //ObjLongConsumer
        //ObjDoubleConsumer public void accept(T t,double d)

        BiConsumer<EmployeeObject,Double> incrementSalary = (employee, aDouble) -> employee.sal += aDouble;
        EmployeeObject employeeObject = new EmployeeObject("Debasish",2500);
        incrementSalary.accept(employeeObject,10.0);
        System.out.println(employeeObject);
        //Better approach below
        ObjDoubleConsumer<EmployeeObject> incrementSalPrimitive = (employeeObject1, value) -> employeeObject1.sal += value;
        incrementSalPrimitive.accept(employeeObject,10.0);
        System.out.println(employeeObject);
    }
}
