package week_8_hw_1;

import java.util.Scanner;
import java.util.Arrays;

public class Process {

	public void Run() {
		System.out.print("������ �Է��ϼ��� >> ");
        Scanner scanner = new Scanner(System.in, "EUC-KR");
        String text = scanner.nextLine().toLowerCase();

        String[] arr = text.split(" ");

        Arrays.sort(arr);

        System.out.println("������ ������ " + arr.length + "�� �Դϴ�.");
        System.out.println("���� ���� �����Դϴ�.");
        for (String str : arr)
        {
            System.out.println(str);
        }

        scanner.close();
	}
}
