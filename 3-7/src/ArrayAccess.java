import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; // �迭 ����
		int min = 0; // ���� ���� ���� ��
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++) {
			min = intArray[0];
			intArray[i] = scanner.nextInt(); //�Է¹��� ������ �迭�� ����
			if(intArray[i]<min) {  // intArray[i]�� ���� ���� ���� �� ���� ������
				min = intArray[i]; // intArray[i]�� min���� ����
			}
		}
		System.out.print("���� ���� ���� "+min+"�Դϴ�.");
		scanner.close();
	}

}
