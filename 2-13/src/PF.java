import java.util.Scanner;
public class PF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		System.out.print("������ �Է��ϼ���:");
		int score = scanner.nextInt();
		System.out.print("�г��� �Է��ϼ���:");
		int year = scanner.nextInt();
		
		if(score>=60 && score<=100) {
			System.out.println(year+"�г�");
			System.out.println("�հ�");
		}
		else if(score<60 && score>=0) {
			System.out.println(year+"�г�");
			System.out.println("���հ�");
		}
		else {
			System.out.println(year+"�г�");
			System.out.println("�Է¿���!");
		}	
		scanner.close();
	}
}
