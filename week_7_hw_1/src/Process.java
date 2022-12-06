import java.util.Scanner;

public class Process {
	public void Run() {
		 Scanner scanner = new Scanner(System.in);
	     for (int t = 0; t < 4; t++){
	    	 System.out.println("연산을 입력하세요.");
	         String string = scanner.nextLine();
	         String[] c = new String[3];
	         int n = 0;
	         int a, b;
	    
	         for (int i = 0; i < string.length(); i++) {
	        	 if (string.charAt(i) == '+' || string.charAt(i) == '-' || string.charAt(i) == '*' || string.charAt(i) == '/') {
	                    n = i;
	                }
	         }
	    
	         c[0] = string.substring(0, n);
	         c[1] = string.substring(n, n + 1);
	         c[2] = string.substring(n + 1, string.length());
	    
	         a = Integer.parseInt(c[0]);
	         b = Integer.parseInt(c[2]);
	            
	         Calculate cal = null;

	         switch(c[1]) {
	         case "+": cal = new Add(a, b); break;
	         case "-": cal = new Sub(a, b); break;
	         case "*": cal = new Mul(a, b); break;
	         case "/": cal = new Div(a, b); break;
	         }

	         System.out.println("연산 결과: " + cal.calculate());
	     }

	     scanner.close();
	}
}
