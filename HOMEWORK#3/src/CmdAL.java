import java.util.LinkedList;
import java.util.ArrayList;

public class CmdAL {
	public final String MOV = "mov";
	public final String ADD = "add";
	public final String SUB = "sub";
	public final String JN0 = "jn0";
	public final String PRT = "prt";
	
	private ArrayList<Cmd> c;
	private LinkedList<Instruction> value;
	
	public CmdAL() {
		this.c = new ArrayList<>();
		this.value = new LinkedList<>();
	}
	
	public void addCmd(String fCmd) {
		Cmd cmd = new Cmd(fCmd);
		this.c.add(cmd);
	}
	
	public int cmdLength() {
		return this.c.size();
	}
	
	public int rundCmd(int present) {
		int future = present+1;
		
		switch(this.c.get(present).getOperator()) {
		case MOV :{
			int index = fVName(this.c.get(present).getParameter());
			int data;
			
			if(isInteger(this.c.get(present).getData())) {
				data = Integer.parseInt(this.c.get(present).getData());
			}
			else {
				int subIndex = fVName(this.c.get(present).getData());
				data = this.value.get(subIndex).getValue();
			}
			
			if(index == -1) {
				this.value.add(new Instruction(this.c.get(present).getParameter(), data));
			}
			else {
				this.value.remove(index);
				this.value.add(new Instruction(this.c.get(present).getParameter(), data));
			}
		}
		break;
		
		case ADD :{
			int index = fVName(this.c.get(present).getParameter());
			int data;
			
			if(isInteger(this.c.get(present).getData())) {
				data = Integer.parseInt(this.c.get(present).getData());
			}
			else {
				int subIndex = fVName(this.c.get(present).getData());
				data = this.value.get(subIndex).getValue();
			}
			
			if(index == -1) {
				System.out.println("Not found: " + this.c.get(present).getData());
				break;
			}
			else {
				this.value.get(index).addValue(data);
			}
		}
		break;
		
		case SUB :{
			int index = fVName(this.c.get(present).getParameter());
			int data;
			
			if(isInteger(this.c.get(present).getData())) {
				data = Integer.parseInt(this.c.get(present).getData());
			}
			else {
				int subIndex = fVName(this.c.get(present).getData());
				data = this.value.get(subIndex).getValue();
			}
			
			if(index == -1) {
				System.out.println("Not found: " + this.c.get(present).getData());
				break;
			}
			else {
				this.value.get(index).addValue(-data);
			}
		}
		break;
		
		case JN0 :{
			int index = fVName(this.c.get(present).getParameter());
			int data;
			
			if(isInteger(this.c.get(present).getData())) {
				data = Integer.parseInt(this.c.get(present).getData());
			}
			else {
				int subIndex = fVName(this.c.get(present).getData());
				data = this.value.get(subIndex).getValue();
			}
			
			if(index == -1) {
				System.out.println("Not found: " + this.c.get(present).getData());
				break;
			}
			
			if(this.value.get(index).getValue()!=0) {
				future = data;
			}
		}
		break;
		
		case PRT :{
			int index = fVName(this.c.get(present).getParameter());
			
			System.out.println("["+this.c.get(present).getOperator()+" "+this.c.get(present).getParameter()+" "+this.c.get(present).getData()+"]");
			
			for(Instruction value : this.value) {
				System.out.print(value.getName()+": "+value.getValue()+" ");
			}
			System.out.println();
			
			System.out.println("Print value: "+this.value.get(index).getValue()+". 프로그램 실행 끝");
		}
		break;
		
		default:{
			System.out.println("Command run error");
		}
		}
		
		return future;
	}
	
	public int fVName(String name) {
		for(int i=0; i<this.value.size(); i++) {
			if(this.value.get(i).getName().equals(name)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			return false;
		}
		catch(NullPointerException e) {
			return false;
		}
		
		return true;
	}
}
