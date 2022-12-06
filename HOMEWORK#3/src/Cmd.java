
public class Cmd {
	private String operator;
	private String parameter;
	private String data;
	
	public Cmd(String fCmd) {
		String[] s = fCmd.split(" ");
		
		try {
			this.operator = s[0];
			this.parameter = s[1];
			this.data = s[2];
		}
		catch(Exception e) {
			System.out.println("Command input error.");
		}
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public String getParameter() {
		return this.parameter;
	}
	
	public String getData() {
		return this.data;
	}
}
