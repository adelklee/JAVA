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
			int randomNum = r.nextInt(100); // 0~99까지 임의의 정수 생성
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println(min+"-"+max);
			System.out.print(cnt+">> ");
			num = sc.nextInt();
			
			while(randomNum!=num) {
				if(randomNum<num) {
					System.out.println("더작게");
					max = num;
				}
				else {
					System.out.println("더높게");
					min = num;
				}
				cnt++;
				System.out.println(min+"-"+max);
				System.out.print(cnt+">> ");
				num = sc.nextInt();
			}
			System.out.println("맞았습니다.");
			System.out.print("다시 하시겠습니다(y/n)>> ");
			String text = sc.next();
			
			if(text.equals("n"))
				break;
		}
		sc.close();
	}
}
