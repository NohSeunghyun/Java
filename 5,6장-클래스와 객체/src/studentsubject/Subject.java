package studentsubject;

public class Subject {
	
	//1.멤버변수
	
	//과목명.정보보안
	private String name;
	
	//성적.정보보안
	private int score;

	//2.기본생성자
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	//3.메서드.정보보안 시켰기때문에 간접접근허용을 위한 메서드생성
	
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getScore() {
		return score;
	}
//	public void setScore(int score) {
//		this.score = score;
//	}
	
}//클래스문
/*******************************************************************************************************/