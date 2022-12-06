import java.util.ArrayList;

public class Cmd {
	private ArrayList<String> p;
	
	public Cmd(String fullString) {
		this.p = new ArrayList<>();
		String[] sp = fullString.split(" ");
		
		for(String pa : sp) {
			this.p.add(pa);
		}
	}
	
	public String getCmdP(int index) {
		return this.p.get(index);
	}
}
