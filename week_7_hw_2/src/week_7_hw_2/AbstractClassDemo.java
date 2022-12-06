package week_7_hw_2;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(10);
		s.draw();
		System.out.println("반지름이 10인 원입니다.");
		System.out.print("면적은 " + s.findArea(10));
	}

}
