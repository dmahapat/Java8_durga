package com.oops.objectsandclass;

class Rectangle {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void calculateArea() {
		System.out.println("Area is: " + length * width);
	}
}

public class RectangleExample4 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.insert(3, 4);
		rectangle.calculateArea();
	}

}
