package week_6_hw;
import java.util.Scanner;

public class Viewer {
	Scanner scanner = new Scanner(System.in, "EUC-KR");
	Concert concert = new Concert();
	int pick = 0;
	
	public Viewer() {
		run();
	}
	
	public void run() {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(true) {
			System.out.print("����: 1, ��ȸ: 2, ���: 3, ������: 4 >> ");
			pick = concert.verifyInt();
			switch(pick) {
			case 1: concert.input(); break;
			case 2: concert.showAll(); break;
			case 3: concert.cancle(); break;
			case 4: finish();
			}
		}
	}
	
	public void finish() {
		System.out.println("<<< ���α׷� ���� >>>");
		System.exit(0);
	}
}
