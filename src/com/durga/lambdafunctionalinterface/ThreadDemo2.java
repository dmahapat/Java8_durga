package com.durga.lambdafunctionalinterface;

public class ThreadDemo2 {

    static public void main(String args[]) {

        Runnable r = () -> {
            for (int i=0 ; i<10 ; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i=0 ; i<10 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
