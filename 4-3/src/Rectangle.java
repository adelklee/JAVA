import java.util.Scanner;

public class Rectangle{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width, height;
		width = scanner.nextInt();
		height = scanner.nextInt();
		
		Rectangle_1 r1 = new Rectangle_1(width, height);
		System.out.println("�簢���� �ʺ�� "+r1.getWidth()+", ���̴� "+r1.getHeight()+", ���̴� "+r1.getArea()+"�Դϴ�.");
		
		scanner.close();
	}
}