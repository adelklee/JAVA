package week_8_hw_1;

import java.util.Scanner;
import java.util.Arrays;

public class Process {

	public void Run() {
		System.out.print("문장을 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in, "EUC-KR");
        String text = scanner.nextLine().toLowerCase();

        String[] arr = text.split(" ");

        Arrays.sort(arr);

        System.out.println("어절의 갯수는 " + arr.length + "개 입니다.");
        System.out.println("사전 순서 정렬입니다.");
        for (String str : arr)
        {
            System.out.println(str);
        }

        scanner.close();
	}
}
