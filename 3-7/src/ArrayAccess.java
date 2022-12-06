import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; // 배열 생성
		int min = 0; // 현재 가장 작은 수
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			min = intArray[0];
			intArray[i] = scanner.nextInt(); //입력받은 정수를 배열에 저장
			if(intArray[i]<min) {  // intArray[i]가 현재 가장 작은 수 보다 작으면
				min = intArray[i]; // intArray[i]를 min으로 변경
			}
		}
		System.out.print("가장 작은 수는 "+min+"입니다.");
		scanner.close();
	}

}
