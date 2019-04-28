package com.durga.lambdawithanonymousinnerclass;


interface Interf {
    public void m1();
}


public class AnonymousVsLambda2 {
    int x = 888;

    public void m2() {
        /*Interf i = new Interf() {
            int x = 999;

            @Override
            public void m1() {
                System.out.println(this.x);//always inner object gets considered
                System.out.println(AnonymousVsLambda2.this.x); // in order to refer outer object we have to write like this
            }
        };*/
        Interf i = () -> {
          int x = 999;//inside lambda it is not possible to declare instance variable. this is a local variable
          System.out.println(this.x);// inside lambda "this" always refers outer member only
         };
        i.m1();
    }

    static public void main(String[] args) {
        AnonymousVsLambda2 anonymousVsLambda2 = new AnonymousVsLambda2();
        anonymousVsLambda2.m2();
    }

}
