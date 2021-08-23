package studentsubject;

public class StudentSubjectMain {

	public static void main(String[] args) {
		
		//학생 생성
		
		Student s=new Student(1001, "홍길동");
		
		s.addSubject("자바", 95);
		s.addSubject("JSP", 87);
		
		Student s2=new Student(1002, "이순신");
		
		s2.addSubject("자바", 90);
		s2.addSubject("JSP", 97);
		s2.addSubject("스플링", 100);
		
		System.out.println("----------학생 성적 정보 출력----------");
		
		s.showStudentInfo();//홍길동의 성적정보
		System.out.println("========================================");
		s2.showStudentInfo();//이순신의 성적정보
		
	}//메인문

}//클래스문
/*******************************************************************************************************/