import java.util.Scanner;

public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		
		System.out.print("원화>> ");
		double won = scanner.nextDouble();
		CurrencyConverter.setWon(won);
		
		System.out.println(won+"원은 $"+CurrencyConverter.toDollar(won)+"입니다.");
		
		scanner.close();
	}

}
