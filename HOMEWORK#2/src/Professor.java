
public class Professor extends People {
	public Professor(int school_number, String name, String major, String phone_number) {
		super(school_number, name, major, phone_number);
	}
	
	public String toString() {
		return "이름: " + getName() + ", 학과: " + getMajor() + ", 전화번호: " + getPhone_Number();
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
		
		subject.setProfessor(this);
	}
}
