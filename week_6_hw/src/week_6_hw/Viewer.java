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
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >> ");
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
		System.out.println("<<< 프로그램 종료 >>>");
		System.exit(0);
	}
}
