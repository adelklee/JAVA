import java.util.Scanner;

public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		
		System.out.print("��ȭ>> ");
		double won = scanner.nextDouble();
		CurrencyConverter.setWon(won);
		
		System.out.println(won+"���� $"+CurrencyConverter.toDollar(won)+"�Դϴ�.");
		
		scanner.close();
	}

}
