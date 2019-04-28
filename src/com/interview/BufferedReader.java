package com.interview;

public class BufferedReader {
    public static void main(String[] args) {
        System.out.println(getStringFromExceptionBlock());

    }

   static String getStringFromExceptionBlock(){
        String val = "";
        int a[] = {1,2,3,4,5};
        try{
            //System.out.println(a[8]);
            try {
                System.out.println(a[8]);
            }catch (Exception e){
                //System.out.println("INNER EXCEPTION");
                val = "INNER EXCEPTION hui hui hui";
            }
        }catch (Exception e) {
            //System.err.println("OUTER EXCEPTION");
            val = "OUTER tusuk tusuk";
        }
        return val;
    }
}
