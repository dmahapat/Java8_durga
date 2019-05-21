package com.interview;

/*
*   1. Is it possible to declare enum inside class(EnumExample)?
* Ans: Yes. This concept is innerclass
*   2. Can we declare enum inside method?
* Ans: No....we get compile time error
*
*  ENUM VS SWITCH
*
*  1. allowed argument types in switch
*     [byte,short,char,int until 1.4v]
*     [Byte,Short,Character,Integer from 1.5v + enum types]
*     [String 1.7V onwards]
*
*
* */


enum Beer {
    //semicolon below is optional
    KF,KO,RC,FO;
}

public class EnumExample {

    public static void main(String[] args) {
        Beer beer = Beer.KF;
        System.out.println(beer);

        switch (beer){
            case KF:
                System.out.println("=KF");
                break;

            case RC:
                System.out.println("=RC");
                break;

            case KO:
                System.out.println("=KO");
                break;

            case FO:
                System.out.println("=FO");
                break;

                default:
                    System.out.println("DEFAULT RE BHAI");
        }


    }
}
