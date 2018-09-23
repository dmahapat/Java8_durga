package com.durga.doublecolonoperator;

public class Example2 {

    public void m1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("m1 - child thread");
        }
    }

    static public void main(String[] args) {
        Runnable runnable = () -> System.out.println("Child thread.");

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Thread.");

        /*
        * Above example in method reference way
        * */

        Example2 example2 = new Example2();

        Runnable runnable1 = example2 :: m1;
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
