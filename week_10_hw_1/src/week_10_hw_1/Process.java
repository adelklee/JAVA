package week_10_hw_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Process {
	private CmdAL al;
	
	public void run() throws IOException {
		Scanner sc = new Scanner(System.in,"EUC-KR");
		
		System.out.println("�������� �۵��մϴ�. ���α׷��� �Է����ּ���. GO�� �Է��ϸ� �۵��մϴ�.");
		
		while(true) {
			if(sc.next().equals("go")) {
				this.al = new CmdAL();
				
				BufferedReader reader = new BufferedReader(new FileReader("input.dat"));
				
				String line = reader.readLine();
				while(line!=null) {
					this.al.addCmd(line);
					line = reader.readLine();
				}
				reader.close();
				
				for(int i=0; i<this.al.cmdLength();) {
					i = this.al.rundCmd(i);
				}
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(new File("result.dat")));
				writer.write(this.al.getOutputs());
				writer.close();
			}
			else {
				break;
			}
		}
		
		sc.close();
	}
}
