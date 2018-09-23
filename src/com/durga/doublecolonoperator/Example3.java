package com.durga.doublecolonoperator;

interface MyInterface1{
    public Sample get();
}

class Sample {

    Sample(){
        System.out.println("Sample: constructor execution");
    }
}

public class Example3 {

    static public void main(String[] args) {
        MyInterface1 myInterface1 = () -> {
          Sample sample = new Sample();
          return sample;
        };
        myInterface1.get();

        /*
        * Now in constructor reference way
        * */

        MyInterface1 interface1 = Sample::new;
        Sample sample = interface1.get();
    }

}
