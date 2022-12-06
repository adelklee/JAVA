
public class Student extends People {
	private int academic_year;
	
	public Student(int school_number, String name, String major, String phone_number, int academic_year) {
		super(school_number, name, major, phone_number);
		this.academic_year = academic_year;
	}
	
	public int getAcademic_Year() {
		return this.academic_year;
	}
	
	public String toString() {
		return "학번: " + getSchool_Number() + ", 이름: " + getName() + ", 학과: " + getMajor() + ", 학년: " + academic_year + ", 전화번호: " + getPhone_Number();
	}
	
	public String toString(int number) {
		return number + "번, 이름: " + getName() + ", 학번: " + getSchool_Number() + ", 전공: " + getMajor() + ", 학년: " + academic_year;
	}
	
	public int getGrade_Sum() {
		int result = 0;
		
		for(int i=0; i<getSubjects().length; i++) {
			result += getSubjects()[i].getGrade();
		}
		
		return result;
	}
	
	@Override
	public void addSubject(Subject subject) {
		if(findSubject(subject)) {
			return;
		}
		
		Subject[] result = new Subject[this.getSubjects().length + 1];
		
		for(int i=0; i<this.getSubjects().length; i++) {
			result[i] = this.getSubjects()[i];
		}
		
		result[result.length - 1] = subject;
		
		this.setSubjects(result);
		
		subject.addStudent(this);
	}
}
