package week_2_hw;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int ten;
		int one;
		Scanner s = new Scanner(System.in, "EUC-KR");
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� : ");
		a = s.nextInt();
		
		ten = a/10;
		one = a%10;
		
		if((ten%3)==0){
			if((one%3)==0) {
				System.out.println("�ڼ�¦¦");
			}
			else
				System.out.println("�ڼ�¦");
		}
		else if((one%3)==0)
			System.out.println("�ڼ�¦");
		s.close();
	}

}
