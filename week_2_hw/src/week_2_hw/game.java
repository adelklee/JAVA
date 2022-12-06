package week_2_hw;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int ten;
		int one;
		Scanner s = new Scanner(System.in, "EUC-KR");
		System.out.print("1~99 사이의 정수를 입력하시오 : ");
		a = s.nextInt();
		
		ten = a/10;
		one = a%10;
		
		if((ten%3)==0){
			if((one%3)==0) {
				System.out.println("박수짝짝");
			}
			else
				System.out.println("박수짝");
		}
		else if((one%3)==0)
			System.out.println("박수짝");
		s.close();
	}

}
