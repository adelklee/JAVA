
public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};

		int i = 0;
		try {
			for(i=0; i<stringNumber.length; i++) {
				double j = Double.parseDouble(stringNumber[i]);
				System.out.println("�Ǽ��� ��ȯ�� ���� "+j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "�� �Ǽ��� ��ȯ�� �� �����ϴ�.");
		}
		
	}

}
