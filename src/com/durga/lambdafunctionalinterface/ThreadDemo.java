package com.durga.lambdafunctionalinterface;


//This class has been written in normal way.
//To write it in lambda way take a look at ThreadDemo2.java
class MyRunnable implements Runnable {

    //The content of the below run method is called the job of the thread
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo {

    static public void main(String[] args) {

        Runnable r = new MyRunnable();
        //To run the above a driver is required.Who is that ?? Thread class
        Thread thread = new Thread(r);
        thread.start();
        //Till thread.start() we had only one thread. i.e main thread but after that there are 2.
        //Child and main thread
        for (int i=0 ; i<10 ; i++){
            System.out.println("Main Thread");
        }
    }



}
