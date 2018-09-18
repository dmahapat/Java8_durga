package com.durga.supplierfunctionalinterface;

/*
* interface Supplier<R> {
*     R  get();
* }
* R - Return type
* Supplier always supplies something - nothing it takes as argument
* Consumer always consumes something - it only takes argument,does not return anything
* */


import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfaceExample1 {

    static public void main(String[] args){
        //Get current system date using Supplier functional interface
        Supplier<Date> getDate = () -> new Date();
        System.out.println("Current system date: " +getDate.get());
        // Get a random name from string array
        Supplier<String> getRandomName = () -> {
            String[] names = {"Debasish","Roshni","Deepankar","Subhasree","Sandeep"};
            int x =(int) (Math.random() * 4);//Math.random always gives a value between 0 and 1
            return names[x];
        };

        System.out.println("Some random name from the name list: "+getRandomName.get());

        //Get a random 6 digit OTP : Using Supplier
        Supplier<String> getRandom6DigitNumber = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println("A random 6 digit OTP: " + getRandom6DigitNumber.get());

        //Generate a random password using supplier
        /*
        * Password Rules:
        *
        * 1.Length should be 8 characters
          2.2,4,6,8,places only digits
          3.1,3,5,7 only uppercase letters or @,#,$
        * */
        Supplier<Integer> randomNumber = () -> (int)(Math.random()*10);
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        Supplier<Character> randomCharacter = () -> {
          int index =  (int)(Math.random()*29);
          return symbols.charAt(index);
        };
        Supplier<String> randomPassword = () -> {
            String password = "";
            for (int i = 0; i < 8 ; i++) {
                if (i % 2 == 0) {
                    password += randomNumber.get();
                }else {
                    password += randomCharacter.get();
                }
            }
            return password;
        };
        System.out.println("Voila !!! We generated a password for you: " +randomPassword.get());


    }
}
