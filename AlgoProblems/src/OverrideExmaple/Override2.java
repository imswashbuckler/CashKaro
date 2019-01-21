package OverrideExmaple;

public class Override2 {

	public static void main(String[] args) {
		Shape1 s = new Circle();
		s.draw();
	}
}

class Shape1 {
	public static void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape1 {
	public static void draw() {
		System.out.println("Circle");
	}
}