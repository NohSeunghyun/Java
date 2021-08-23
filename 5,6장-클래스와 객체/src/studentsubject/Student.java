package studentsubject;

import java.util.ArrayList;

public class Student {
	
	//1.멤버변수
	
	//학생번호
	int studentID;
	
	//학생이름
	String studentName;

	//수강하는 과목들
	ArrayList<Subject> subjectList;//선언//Subject타입 or Subject의 자식만 담을수있음.
	
	//2.생성자
	
	public Student(int studentID, String studentName) {//ArrayList<Subject> subjectList를 매개변수안에 넣으면안됨.이유?수강하는 과목이 있을수도 있고 없을수도 있기때문.(=포함관계)
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		subjectList=new ArrayList<Subject>();//매개변수안에 넣지말고 생성자안에 주소를받아 참조할수 있도록 만듬.//메서드를 통해 값을 넣음
	}
	
	//3.메서드 : 수강한 과목과 그 점수를 추가한다.
	
	public void addSubject(String name, int score) {
		Subject subject=new Subject(name, score);//기본생성자 : 기본(null,0)값으로 채워짐.
//		subject.setName(name);//매개값으로 받은 값으로 기본값을 변경
//		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		double total=0;
		for(Subject s:subjectList) {
			total+=s.getScore();
			System.out.println("학생"+studentName+"의 "+s.getName()+" 과목성적은 "+s.getScore()+"입니다.");
		}//for문 종료
		System.out.println("학생"+studentName+"의 총점은 "+total+"과 평균은 "+(total/subjectList.size())+"입니다.");//subjectList.size() : subjectList안에 저장되어있는 객체수
	}
	
}//클래스문
/*******************************************************************************************************/