package com.durga.primitivepredefinedfunctionalinterface;

/*
* Normal supplier always going to take Object type
*
* */

import java.util.function.*;

public class SupplierPrimitiveExample5 {

    static public void main(String[] args) {
        Supplier<Integer> supplyRandomValue = () -> (int) (Math.random() * 10);
        System.out.println("Random supplied value: "+supplyRandomValue.get());

        //For primitives we have below approach
        IntSupplier intSupplier = () -> (int)(Math.random() * 10);
        String otp = "";
        for (int i = 0; i < 6; i++) {
            otp += intSupplier.getAsInt();
        }
        System.out.println("The generated otp is: "+otp);

        // 4 primitive versions of
        //IntSupplier - method available is getAsInt()
        //LongSupplier - method available is getAsLong()
        //DoubleSupplier - method available is getAsDouble()
        //BooleanSupplier - method available is getAsBoolean()
    }
}
