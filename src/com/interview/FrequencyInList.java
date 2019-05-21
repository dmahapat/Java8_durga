package com.interview;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyInList {
    public static void main(String[] args) {
        Integer arr[] = {10,20,20,30,20,50,10};
        System.out.println("Frequency of number 20 in array:"
                + Collections.frequency(Arrays.asList(arr),20));

        System.out.println("value returned is: "+checkException(arr));
    }


    static int checkException(Integer arr[]){
        try{
            System.out.println(arr[100]);
        }finally {
            return 1;
        }
    }
}
