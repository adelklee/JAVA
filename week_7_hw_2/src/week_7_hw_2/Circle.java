package week_7_hw_2;

public class Circle implements Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
	}
	
	public double findArea(int i) {
		return PI*radius*radius;
	}
}
