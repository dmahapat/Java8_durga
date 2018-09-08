package com.durga.lambdawithanonymousinnerclass;

/**
 * nameless inner class are anonymous innerclass
 * We cannot write like below
 * Runnable r = new Runnable()- compilation error - not possible to create object for interface
 *
 * All anonymous innerclass cannot be replaced by lambda expression
 *
 * Anonymous inner class is more powerful than lambda expression
 *
 * the anonymous class which has only one abstract method that can be replaced by lambda
 *
 * Anonymous innerclass != lambda expression
 *
 * Behaviour of "this(Current object)" is different in lambda expression and anonymous inner class
 *
 * local variables referenced from lambda expression are final(or effectively final)
 *
 */
public class AnonymousVsLambdaExample {

    static public void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }
        };
        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };
        Thread thread = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println("Child thread--- 3rdway");
            }
        });
        thread.start();
        Thread t = new Thread(runnable);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
