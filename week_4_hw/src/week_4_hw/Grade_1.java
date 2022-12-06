package week_4_hw;

class Grade_1 {
	private int math;
	private int science;
	private int english;
	
	public Grade_1(int math, int science, int english)
	{
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int sum()
	{
		return this.math + this.science + this.english;
	}
	
	public int average()
	{
		return sum() / 3;
	}
}
