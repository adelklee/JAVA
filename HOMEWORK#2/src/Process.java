import java.util.Scanner;

public class Process {
    private Scanner scanner;
    private final int Retry = 0, Student = 1, Professor = 2, Close = 3, Applyclass = 4, Checkclass = 5;

    private Professor[] professor;
    private Student[] students;
    private Subject[] subjects;
    
    public Process() {
        this.professor = new Professor[3];
        this.students = new Student[10];
        this.subjects = new Subject[5];
    }

    public void Run(){
        this.scanner = new Scanner(System.in, "EUC-KR");

        inputStudents();
        inputProfessors();
        inputSubjects();

        int runmode = Retry;
        while (runmode != Close){
        	runmode = Retry;

            while (runmode == Retry){
                try{
                    System.out.println("접속 모드를 선택하세요.\n1. 학생 모드, 2. 교수 모드, 3. 종료");
                    switch(this.scanner.nextInt()){
                        case 1: runmode = Student; break;
                        case 2: runmode = Professor; break;
                        case 3: runmode = Close; break;
                        default: runmode = Retry; break;
                    }
                }
                catch(Exception e){
                	runmode = Retry;
                }
                if (runmode == Retry){
                    System.out.println("잘못된 숫자입니다.");
                }
            }

            modeRun(runmode);
        }

        this.scanner.close();
    }

    private void inputStudents(){
        for (int i = 0; i < 10; i++){
            while (true){
                try{
                    System.out.println((i + 1) + "번째 학생의 정보를 입력하세요(학생번호, 이름, 전공, 전화번호, 학년)");
                    this.students[i] = new Student(this.scanner.nextInt(), this.scanner.next(), this.scanner.next(), 
                        this.scanner.next(), this.scanner.nextInt());
                    break;
                }
                catch (Exception e){
                    System.out.println("잘못된 학생 정보입니다.");
                    continue;
                }
            }
        }
    }

    private void inputProfessors(){
        for (int i = 0 ; i < 3; i++){
            while (true){
                try{
                    System.out.println((i + 1) + "번째 교수의 정보를 입력하세요(교수번호, 이름, 전공, 전화번호)");
                    this.professor[i] = new Professor(this.scanner.nextInt(), this.scanner.next(), 
                        this.scanner.next(), this.scanner.next());
                    break;
                }
                catch (Exception e){
                    System.out.println("교수 정보가 잘못되었습니다.");
                    continue;
                }
            }
        }
    }
    
    private void inputSubjects(){
        for (int i = 0 ; i < 5; i++){
            while (true){
                try{
                    System.out.println((i + 1) + "번째 수업의 정보를 입력하세요(년도, 강좌번호, 강좌이름, 학점)");
                    this.subjects[i] = new Subject(this.scanner.nextInt(), this.scanner.nextInt(), this.scanner.next(), this.scanner.nextInt());
                    
                    int in = -1;
                    while (in == -1){
                        System.out.println("해당 강좌의 교수 번호를 입력하세요.");
                        in = findProfessorIndex(this.scanner.nextInt());
                        
                        if (in == -1){
                            System.out.println("잘못된 교수 정보입니다.");
                        }
                    }

                    this.professor[in].addSubject(this.subjects[i]);
                    break;
                }
                catch (Exception e){
                    System.out.println("강좌 정보가 잘못되었습니다.");
                    continue;
                }
            }
        }
    }

    private void modeRun(int runmode){
        switch(runmode) {
            case Student: studentRun(runmode);
            break;

            case Professor: professorRun(runmode);
            break;
        }
    }

    private void studentRun(int runmode) {
        while (runmode == Student) {
            try {
                System.out.println("할 일을 선택하세요.\n1. 수강 신청, 2. 수강 확인");
                switch(this.scanner.nextInt()) {
                    case 1: runmode = Applyclass; break;
                    case 2: runmode = Checkclass; break;
                    default: runmode = Student; break;
                }
            }
            catch (Exception e) {
            	runmode = Student;
            }
            if (runmode == Student) {
                System.out.println("잘못된 숫자입니다.");
            }
        } 

        if (runmode == Applyclass){
            int in = -1;
            while (in == -1) {
                try {
                    System.out.println("학생의 학번을 입력하세요.");
                    in = findStudentIndex(this.scanner.nextInt());
                }
                catch (Exception e) {
                    in = -1;
                }
                if (in == -1) {
                    System.out.println("잘못된 학생 정보입니다.");
                }
            }

            Student student = this.students[in];
            
            for (int i = 0 ; i < 3; i++) {
                in = -1;
                while (in == -1) {
                    try {
                        System.out.println("강좌 번호를 입력하세요.");
                        in = findSubjectIndex(this.scanner.nextInt());
                    }
                    catch (Exception e) {
                        in = -1;
                    }
                    if (in == -1) {
                        System.out.println("강좌 정보가 잘못되었습니다.");
                    }
                }

                student.addSubject(this.subjects[in]);
            }

        }
        else if (runmode == Checkclass) {
            int in = -1;
            while (in == -1) {
                try {
                    System.out.println("학생의 학번을 입력하세요.");
                    in = findStudentIndex(this.scanner.nextInt());
                }
                catch (Exception e)  {
                    in = -1;
                }
                if (in == -1)  {
                    System.out.println("잘못된 학생 정보 입니다.");
                }
            }

            Student student = this.students[in];

            System.out.println("학생 정보\n" + student.toString() + "\n수강 과목 목록");
            for (int i = 0; i < this.subjects.length; i++) {
                if (this.subjects[i].findStudent(student))   {
                    System.out.println(this.subjects[i].toString() + ", 담당 교수: "  + this.subjects[i].getProfessor().getName()); 
                }
            }
            System.out.println("총 신청된 학점: " + student.getGrade_Sum());
        }
    } 

    private void professorRun(int runmode) {
        int in = -1;
        while (in == -1) {
            System.out.println("해당 강좌의 강좌 번호를 입력하세요.");
            in = findSubjectIndex(this.scanner.nextInt());
            
            if (in == -1) {
                System.out.println("잘못된 강좌 번호입니다.");
            }
        }

        Subject subject = this.subjects[in];
        String listStu = "수강자 목록\n";
        int stuNum = 0;

        System.out.println("담당 교수: " + subject.getProfessor());

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].findSubject(subject)) {
                listStu += this.students[i].toString(++stuNum) + "\n";
            }
        }
        System.out.println("수강 인원: " + stuNum + "\n" + listStu);
    }

    private int findProfessorIndex(int school_number) {
        for (int i = 0; i < this.professor.length; i++) {
            if (this.professor[i].getSchool_Number() == school_number) {
                return i;
            }
        }
        
        return -1;
    }

    private int findStudentIndex(int school_number) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getSchool_Number() == school_number) {
                return i;
            }
        }
        
        return -1;
    }

    private int findSubjectIndex(int subject_number) {
        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i].getSubject_Number() == subject_number) {
                return i;
            }
        }
        
        return -1;
    }
}
