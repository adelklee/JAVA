package week_4_hw;
import java.util.Scanner;

public class Grade {
	public static void main(String[ ] argc) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		
		int math = scanner.nextInt( );
		int science = scanner.nextInt( );
		int english = scanner.nextInt( );
		
		Grade_1 me = new Grade_1(math, science, english);
		System.out.println("합은 " + me.sum( ));
		System.out.println("평균은 " + me.average( ));
		scanner.close( );
	}
}
