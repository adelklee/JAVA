import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in, "EUC-KR");
		System.out.println("Ŀ�Ǹ޴��� �����Ͻÿ� ");
		String order = s.next();
		int price = 0;
		
		switch(order) {
			case "����������":
			case "īǪġ��":
			case "ī���":
				price = 3800; break;
			case "�Ƹ޸�ī��":
				price = 1900; break;
			default:
				System.out.println("�޴��� �����ϴ�");
		}
		if(price!=0)
			System.out.print(order+"�� "+price+"���Դϴ�");
		s.close();
	}

}
