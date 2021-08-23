package studentsubjecttest;

import java.util.ArrayList;

public class Student {
	
	//학생번호
	int StudentID;
	//학생이름
	String StudentName;
	//수강과목
	ArrayList<Subject> SubjectList;
	//        ↑무조건 대문자로 시작해야함;
	public Student(int StudentID, String StudentName) {
		super();
		this.StudentID = StudentID;
		this.StudentName = StudentName;
		SubjectList=new ArrayList<Subject>();
	}
	
	void Subject(String Name, int Score) {
		Subject subject=new Subject(Name, Score);
		SubjectList.add(subject);
	}
	
	void showStudentInfo() {
		double total = 0;//총점구하기위한 변수
		for(Subject S:SubjectList) {
			total+=S.getScore();
			System.out.println(StudentName+"학생의 "+S.getName()+"과목 성적은 "+S.getScore()+"점 입니다.");
		}//for문종료
		System.out.println(StudentName+"학생의 총점은 "+total+"이고, 평균점수는 "+total/SubjectList.size()+"점 입니다.");
	}
}//클래스문
/*******************************************************************************************************/