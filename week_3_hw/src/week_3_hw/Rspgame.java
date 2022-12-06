package week_3_hw;
import java.util.Scanner;
public class Rspgame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		String str[] = {"가위", "바위", "보"};
		boolean win = false;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.next();
			int n = (int)(Math.random()*3);
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else {
				if(user.equals(str[n])) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
					continue;
				}
				else if(user.equals("가위")) {
					win = ((str[n]).equals("바위")?false:true);
				}
				else if(user.equals("바위")) {
					win = ((str[n]).equals("보")?false:true);
				}
				else if(user.equals("보")) {
					win = ((str[n]).equals("가위")?false:true);
				}
				
				else {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
			}
			if(win == true) {
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
			}
			else {
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
			}
		}
		
		scanner.close();
	}

}
