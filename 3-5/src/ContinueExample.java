import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 7개 입력하세요.");
		int sum = 1;
		for(int i=0; i<7; i++) {
			int n = scanner.nextInt();
			if(n<=0)
				continue;
			else
				sum = sum * n;
		}
		System.out.println("양수의 곱은 "+sum);
		
		scanner.close();
	}

}
