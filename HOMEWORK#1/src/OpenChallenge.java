import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num, min, max = 0;
		
		while(true) {
			min = 0;
			max = 99;
			int cnt = 1;
			int randomNum = r.nextInt(100); // 0~99���� ������ ���� ����
			
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			System.out.println(min+"-"+max);
			System.out.print(cnt+">> ");
			num = sc.nextInt();
			
			while(randomNum!=num) {
				if(randomNum<num) {
					System.out.println("���۰�");
					max = num;
				}
				else {
					System.out.println("������");
					min = num;
				}
				cnt++;
				System.out.println(min+"-"+max);
				System.out.print(cnt+">> ");
				num = sc.nextInt();
			}
			System.out.println("�¾ҽ��ϴ�.");
			System.out.print("�ٽ� �Ͻðڽ��ϴ�(y/n)>> ");
			String text = sc.next();
			
			if(text.equals("n"))
				break;
		}
		sc.close();
	}
}
