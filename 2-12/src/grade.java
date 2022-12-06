import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		
		System.out.print("점수를 입력하세요(0~100):");
		int score = scanner.nextInt();
		
		if(score >= 90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else if(score >= 50)
			System.out.println("E");
		else
			System.out.println("F");
		
		scanner.close();
	}

}
