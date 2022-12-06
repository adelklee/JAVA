
public class Subject {
	private int year;
	private int class_number;
	private String name;
	private int grade;
	private Professor professor;
	private Student[] students;
	
	public Subject(int year, int subject_number, String name, int grade) {
		this.year = year;
		this.class_number = subject_number;
		this.name = name;
		this.grade = grade;
		this.students = new Student[0];
	}
	
	public int getSubject_Number() {
		return this.class_number;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
        return this.professor;
    }
	
	public String toString() {
		return this.year + "학년도, 강좌 번호: " + this.class_number + ", " + this.name + "강의, " + this.grade +"학점";
	}
	
	public void addStudent(Student student) {
		if(findStudent(student)) {
			return;
		}
		
		Student[] result = new Student[this.students.length + 1];
		
		for(int i=0; i<this.students.length; i++) {
			result[i] = this.students[i];
		}
		
		result[result.length - 1] = student;
		
		this.students = result;
		
		student.addSubject(this);
	}
	
	public boolean findStudent(Student student) {
		for(int i=0; i<this.students.length; i++) {
			if(this.students[i] == student) {
				return true;
			}
		}
		
		return false;
	}
}
