package week_10_hw_1;

public class Instruction {
	private String name;
	private int value;
	
	public Instruction(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public void addValue(int value) {
		this.value += value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
}
