import java.util.Scanner;

public class Process {
	private CmdAL al;
	
	public void run() {
		this.al = new CmdAL();
		Scanner sc = new Scanner(System.in,"EUC-KR");
		
		System.out.println("�������� �۵��մϴ�. ���α׷��� �Է����ּ���. GO�� �Է��ϸ� �۵��մϴ�.");
		
		while(true) {
			System.out.print(">> ");
			String string = sc.nextLine();
			if(string.equals("go")) break;
			this.al.addCmd(string);
		}
		
		for(int i=0; i<this.al.cmdLength();) {
			i = this.al.rundCmd(i);
		}
		
		sc.close();
	}
}
