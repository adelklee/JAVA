package week_7_hw_2;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(10);
		s.draw();
		System.out.println("�������� 10�� ���Դϴ�.");
		System.out.print("������ " + s.findArea(10));
	}

}
