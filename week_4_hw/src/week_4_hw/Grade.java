package week_4_hw;
import java.util.Scanner;

public class Grade {
	public static void main(String[ ] argc) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		
		int math = scanner.nextInt( );
		int science = scanner.nextInt( );
		int english = scanner.nextInt( );
		
		Grade_1 me = new Grade_1(math, science, english);
		System.out.println("���� " + me.sum( ));
		System.out.println("����� " + me.average( ));
		scanner.close( );
	}
}
