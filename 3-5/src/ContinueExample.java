import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ 7�� �Է��ϼ���.");
		int sum = 1;
		for(int i=0; i<7; i++) {
			int n = scanner.nextInt();
			if(n<=0)
				continue;
			else
				sum = sum * n;
		}
		System.out.println("����� ���� "+sum);
		
		scanner.close();
	}

}
