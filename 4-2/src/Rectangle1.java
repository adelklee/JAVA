import java.util.Scanner;

public class Rectangle1 {
	private int width;
	private int height;
	
	public int getArea() {
		return width*height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rect = new Rectangle1();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("�簢���� ������ "+rect.getArea()+"�̰� "+"�ʺ�� "+rect.getWidth()+", "+"���̴� "+rect.getHeight()+"�̴�.");
		
		scanner.close();
	}

}
