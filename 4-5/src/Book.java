import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		String title, author;
		System.out.print("����>> ");
		title = scanner.nextLine();
		System.out.print("����>> ");
		author = scanner.nextLine();
		
		Book_1 b1 = new Book_1(title, author);
		b1.show();
		
		scanner.close();
	}
}