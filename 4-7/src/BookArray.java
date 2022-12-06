import java.util.Scanner;

public class BookArray {
	
	public static void main(String[] args) {
		Book_1 [] book = new Book_1[2];
		
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book_1(title, author);
		}
		
		for(int i = 0; i<book.length; i++) {
			book[i].show();
		}
		scanner.close();
	}
}