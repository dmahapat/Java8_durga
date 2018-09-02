package com.durga.functionalinterface;

@FunctionalInterface
interface P {
    public void m1();
}

@FunctionalInterface
interface C extends P {
    //the child interface can have 0 or the same abstract method as the parent
    //adding one extra abstract method would result in compile time error
    public void m1();
    //public void m2();
    //Uncommenting the above line would result in compile time error
}
