package com.interview;
enum Color{
	RED,GREEN,BLUE
}

public class EnumMethodAnalysis {
	public static void main(String[] args) {
		// calling values()
		Color[] clrArr = Color.values();
		
		//enum with loop
		for (Color color : clrArr) {
			System.out.println(color+" at index "+color.ordinal());
		}
		
		// Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
	}

}
