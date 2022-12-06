package week_9_hw_1;

public class Member implements Comparable<Member>{
	String name;
	int point;
	
	public Member(String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	public void addPoint(int point2) {
		this.point += point;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPoint(){
	    return this.point;
	}

	@Override
	public int compareTo(Member m) {
	    return this.name.compareTo(m.name);
	}

}
