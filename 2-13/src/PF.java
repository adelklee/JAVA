import java.util.Scanner;
public class PF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		System.out.print("학년을 입력하세요:");
		int year = scanner.nextInt();
		
		if(score>=60 && score<=100) {
			System.out.println(year+"학년");
			System.out.println("합격");
		}
		else if(score<60 && score>=0) {
			System.out.println(year+"학년");
			System.out.println("불합격");
		}
		else {
			System.out.println(year+"학년");
			System.out.println("입력오류!");
		}	
		scanner.close();
	}
}
