
public class People {
	private int school_number;
	private String name;
	private String major;
	private String phone_number;
	private Subject[] subjects;
	
	public People(int school_number, String name, String major, String phone_number)
	{
		this.school_number = school_number;
		this.name = name;
		this.major = major;
		this.phone_number = phone_number;
		this.subjects = new Subject[0];
	}
	
	public int getSchool_Number() {
		return this.school_number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getPhone_Number() {
		return this.phone_number;
	}
	
	public void addSubject(Subject subject) {}
	
	public boolean findSubject(Subject subject) {
		for(int i = 0; i<this.subjects.length; i++) {
			if(this.subjects[i]==subject) {
				return true;
			}
		}
		return false;
	}
	
	protected Subject[] getSubjects() {
		return this.subjects;
	}
	
	protected void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
}
