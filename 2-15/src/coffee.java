import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in, "EUC-KR");
		System.out.println("커피메뉴를 선택하시오 ");
		String order = s.next();
		int price = 0;
		
		switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3800; break;
			case "아메리카노":
				price = 1900; break;
			default:
				System.out.println("메뉴에 없습니다");
		}
		if(price!=0)
			System.out.print(order+"는 "+price+"원입니다");
		s.close();
	}

}
