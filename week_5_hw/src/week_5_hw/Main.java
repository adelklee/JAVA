package week_5_hw;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < 4; a++)
        {
            System.out.println("������ �Է��ϼ���.");
            String str = scanner.nextLine();
            String[] s = new String[3];
            int opPoint = 0;
            int a1, a2;
    
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == '+' || str.charAt(i) == '-' ||
                    str.charAt(i) == '*' || str.charAt(i) == '/')
                {
                    opPoint = i;
                }
            }
    
            s[0] = str.substring(0, opPoint);
            s[1] = str.substring(opPoint, opPoint + 1);
            s[2] = str.substring(opPoint + 1, str.length());
    
            a1 = Integer.parseInt(s[0]);
            a2 = Integer.parseInt(s[2]);
    
            switch(s[1])
            {
                case "+": Add add = new Add(); add.setValue(a1, a2); 
                System.out.println("���: " + add.calculate()); break;
                case "-": Sub sub = new Sub(); sub.setValue(a1, a2); 
                System.out.println("���: " + sub.calculate()); break;
                case "*": Mul mul = new Mul(); mul.setValue(a1, a2); 
                System.out.println("���: " + mul.calculate()); break;
                case "/": Div div = new Div(); div.setValue(a1, a2); 
                System.out.println("���: " + div.calculate()); break;
            }
        }

        scanner.close();
    }
}
