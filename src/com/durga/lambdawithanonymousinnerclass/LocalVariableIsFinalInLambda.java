package com.durga.lambdawithanonymousinnerclass;

interface Interf1 {
    public void m1();
}



public class LocalVariableIsFinalInLambda {
    int x = 10;
    public void m2(){
        int y = 20;
        Interf1 i = () -> {
            x = 888;
            //y = 999; this is compilation error. local variables are final or effectively final
          System.out.println(x);
          System.out.println(y);
        };
        i.m1();
    }

    static public void main(String[] args) {
        LocalVariableIsFinalInLambda localVariableIsFinalInLambda = new LocalVariableIsFinalInLambda();
        localVariableIsFinalInLambda.m2();
    }
}
