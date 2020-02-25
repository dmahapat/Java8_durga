package com.all.aboutconcurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample1 extends Thread {
	static List<String> myList = new ArrayList<>();
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		myList.add("Murray");
	}
	
	public static void main(String[] args) throws InterruptedException {
		myList.add("Darling");
		myList.add("Murum bidgee");
		myList.add("Snowy");
		ConcurrentModificationExample1 coExample1 = new ConcurrentModificationExample1();
		coExample1.start();
		Iterator<String> itr = myList.iterator();
		while (itr.hasNext()) {
			String val = itr.next();
			System.out.println("Main thread is iterating over values: "+val);
			Thread.sleep(3000);
		}
		System.out.println(myList);
	}
}
