package week_3_hw;
import java.util.Scanner;
public class Rspgame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		String str[] = {"����", "����", "��"};
		boolean win = false;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			String user = scanner.next();
			int n = (int)(Math.random()*3);
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else {
				if(user.equals(str[n])) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
					continue;
				}
				else if(user.equals("����")) {
					win = ((str[n]).equals("����")?false:true);
				}
				else if(user.equals("����")) {
					win = ((str[n]).equals("��")?false:true);
				}
				else if(user.equals("��")) {
					win = ((str[n]).equals("����")?false:true);
				}
				
				else {
					System.out.println("�߸� �Է��߽��ϴ�.");
					continue;
				}
			}
			if(win == true) {
				System.out.println("����� = "+user+" , ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
			}
			else {
				System.out.println("����� = "+user+" , ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
			}
		}
		
		scanner.close();
	}

}
