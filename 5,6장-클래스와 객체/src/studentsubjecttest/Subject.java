package studentsubjecttest;

public class Subject {
	
	//과목명 정보보안
	private String Name;
	//성적 정보보안
	private int Score;
	
	public Subject(String name, int score) {
		super();
		Name = name;
		Score = score;
	}

	public String getName() {
		return Name;
	}

	public int getScore() {
		return Score;
	}
	
}//클래스문
/*******************************************************************************************************/