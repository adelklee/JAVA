
public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};

		int i = 0;
		try {
			for(i=0; i<stringNumber.length; i++) {
				double j = Double.parseDouble(stringNumber[i]);
				System.out.println("실수로 변환된 값은 "+j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 실수로 변환할 수 없습니다.");
		}
		
	}

}
