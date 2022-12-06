package week_6_hw;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Concert {
	Scanner scanner = new Scanner(System.in, "EUC-KR");
	final int MAX_SIZE = 10;
	CustomerDTO[] S = new CustomerDTO[MAX_SIZE];
	CustomerDTO[] A = new CustomerDTO[MAX_SIZE];
	CustomerDTO[] B = new CustomerDTO[MAX_SIZE];
	
	public Concert() {
		for(int i=0; i<MAX_SIZE; i++) {
			CustomerDTO R = new CustomerDTO();
			S[i] = R;
		}
		for(int i=0; i<MAX_SIZE; i++) {
			CustomerDTO R = new CustomerDTO();
			A[i] = R;
		}
		for(int i=0; i<MAX_SIZE; i++) {
			CustomerDTO R = new CustomerDTO();
			B[i] = R;
		}
	}
	
	public int verifyInt() {
		int pick;
		while(true) {
			try {
				pick = scanner.nextInt();
				return pick;
			} catch(InputMismatchException e){
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.next();
			}
		}
	}
	
	public String showSeat() {
		while(true) {
			System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
			int pick = verifyInt();
			switch(pick) {
			case 1: show(S); return "S";
			case 2: show(A); return "A";
			case 3: show(B); return "B";
			default: System.out.println("잘못입력하셨습니다.");
			}
			 
		}
	}
	
	public void show(CustomerDTO[] dto) {
		for(int i=0; i<dto.length; i++) {
			System.out.print(dto[i].getName()+" ");
		}
		System.out.println();
	}
	
	public void showAll() {
		for(int i=0; i<S.length; i++) {
			System.out.print(S[i].getName()+" ");
		}
		System.out.println();
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i].getName()+" ");
		}
		System.out.println();
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i].getName()+" ");
		}
		System.out.println();
		System.out.println("조회를 완료하였습니다.");
	}
	
	public void input() {
		String seat = showSeat();
		
		CustomerDTO tmp = new CustomerDTO();
		System.out.print("이름>> ");
		tmp.setName(scanner.next());
		System.out.print("번호>> ");
		int seatNumber = verifyInt();
		
		if(seat.equals("S")) {
			S[seatNumber-1] = tmp;
		}
		else if(seat.equals("A")) {
			A[seatNumber-1] = tmp;
		}
		else if(seat.equals("B")) {
			B[seatNumber-1] = tmp;
		}
	}
	
	public void cancle() {
		String seat = showSeat();
		System.out.print("이름>> ");
		String cancleName = scanner.next();
		
		if(seat.equals("S")) {
			for(int i=0; i<S.length; i++) {
				if(cancleName.equals(S[i].getName())) {
					S[i] = new CustomerDTO();
					break;
				}
			}
		}
		else if(seat.equals("A")) {
			for(int i=0; i<A.length; i++) {
				if(cancleName.equals(A[i].getName())) {
					A[i] = new CustomerDTO();
					break;
				}
			}
		}
		else if(seat.equals("B")) {
			for(int i=0; i<B.length; i++) {
				if(cancleName.equals(B[i].getName())) {
					B[i] = new CustomerDTO();
					break;
				}
			}
		}
	}
}