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
                    System.out.println("���� ��带 �����ϼ���.\n1. �л� ���, 2. ���� ���, 3. ����");
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
                    System.out.println("�߸��� �����Դϴ�.");
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
                    System.out.println((i + 1) + "��° �л��� ������ �Է��ϼ���(�л���ȣ, �̸�, ����, ��ȭ��ȣ, �г�)");
                    this.students[i] = new Student(this.scanner.nextInt(), this.scanner.next(), this.scanner.next(), 
                        this.scanner.next(), this.scanner.nextInt());
                    break;
                }
                catch (Exception e){
                    System.out.println("�߸��� �л� �����Դϴ�.");
                    continue;
                }
            }
        }
    }

    private void inputProfessors(){
        for (int i = 0 ; i < 3; i++){
            while (true){
                try{
                    System.out.println((i + 1) + "��° ������ ������ �Է��ϼ���(������ȣ, �̸�, ����, ��ȭ��ȣ)");
                    this.professor[i] = new Professor(this.scanner.nextInt(), this.scanner.next(), 
                        this.scanner.next(), this.scanner.next());
                    break;
                }
                catch (Exception e){
                    System.out.println("���� ������ �߸��Ǿ����ϴ�.");
                    continue;
                }
            }
        }
    }
    
    private void inputSubjects(){
        for (int i = 0 ; i < 5; i++){
            while (true){
                try{
                    System.out.println((i + 1) + "��° ������ ������ �Է��ϼ���(�⵵, ���¹�ȣ, �����̸�, ����)");
                    this.subjects[i] = new Subject(this.scanner.nextInt(), this.scanner.nextInt(), this.scanner.next(), this.scanner.nextInt());
                    
                    int in = -1;
                    while (in == -1){
                        System.out.println("�ش� ������ ���� ��ȣ�� �Է��ϼ���.");
                        in = findProfessorIndex(this.scanner.nextInt());
                        
                        if (in == -1){
                            System.out.println("�߸��� ���� �����Դϴ�.");
                        }
                    }

                    this.professor[in].addSubject(this.subjects[i]);
                    break;
                }
                catch (Exception e){
                    System.out.println("���� ������ �߸��Ǿ����ϴ�.");
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
                System.out.println("�� ���� �����ϼ���.\n1. ���� ��û, 2. ���� Ȯ��");
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
                System.out.println("�߸��� �����Դϴ�.");
            }
        } 

        if (runmode == Applyclass){
            int in = -1;
            while (in == -1) {
                try {
                    System.out.println("�л��� �й��� �Է��ϼ���.");
                    in = findStudentIndex(this.scanner.nextInt());
                }
                catch (Exception e) {
                    in = -1;
                }
                if (in == -1) {
                    System.out.println("�߸��� �л� �����Դϴ�.");
                }
            }

            Student student = this.students[in];
            
            for (int i = 0 ; i < 3; i++) {
                in = -1;
                while (in == -1) {
                    try {
                        System.out.println("���� ��ȣ�� �Է��ϼ���.");
                        in = findSubjectIndex(this.scanner.nextInt());
                    }
                    catch (Exception e) {
                        in = -1;
                    }
                    if (in == -1) {
                        System.out.println("���� ������ �߸��Ǿ����ϴ�.");
                    }
                }

                student.addSubject(this.subjects[in]);
            }

        }
        else if (runmode == Checkclass) {
            int in = -1;
            while (in == -1) {
                try {
                    System.out.println("�л��� �й��� �Է��ϼ���.");
                    in = findStudentIndex(this.scanner.nextInt());
                }
                catch (Exception e)  {
                    in = -1;
                }
                if (in == -1)  {
                    System.out.println("�߸��� �л� ���� �Դϴ�.");
                }
            }

            Student student = this.students[in];

            System.out.println("�л� ����\n" + student.toString() + "\n���� ���� ���");
            for (int i = 0; i < this.subjects.length; i++) {
                if (this.subjects[i].findStudent(student))   {
                    System.out.println(this.subjects[i].toString() + ", ��� ����: "  + this.subjects[i].getProfessor().getName()); 
                }
            }
            System.out.println("�� ��û�� ����: " + student.getGrade_Sum());
        }
    } 

    private void professorRun(int runmode) {
        int in = -1;
        while (in == -1) {
            System.out.println("�ش� ������ ���� ��ȣ�� �Է��ϼ���.");
            in = findSubjectIndex(this.scanner.nextInt());
            
            if (in == -1) {
                System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
            }
        }

        Subject subject = this.subjects[in];
        String listStu = "������ ���\n";
        int stuNum = 0;

        System.out.println("��� ����: " + subject.getProfessor());

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].findSubject(subject)) {
                listStu += this.students[i].toString(++stuNum) + "\n";
            }
        }
        System.out.println("���� �ο�: " + stuNum + "\n" + listStu);
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
