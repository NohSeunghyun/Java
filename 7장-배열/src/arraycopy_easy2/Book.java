package arraycopy_easy2;
//문제를 보고 직접 만들어보기.
public class Book {
	
	//1.멤버변수(=필드)만들기
	//-1)책 제목
	//-2)책 저자
	//-3)책 가격
	
	//책 가격 최초의 1번 초기화 방법1.명시적 초기화:선언한곳에 바로 값을넣어줌.
	
	private String bookName;//책 제목
	private String author;//책 저자
	final int priceBook;//책 가격//final : 최초의1번만 초기화(기본값 제외)=>값변경 불가.//final이 붙은것은 명시적으로 초기화안해줘도 기본값으로 안채워줌.
	//여기서 바로 초기화해도되고 생성자에서 초기화해도됨.priceBook=10000;
	//priceBook의 기본값 적는것:priceBook;
	//priceBook=0;과 다름.
	
	//2.생성자 만들기
	//필드에 값을 채워주는 생성자 만들기.
	
	public Book() {
//		super();//부모객체 생성
		//멤버번수에 기본값으로 채움.(null값)
		
		//만약 구체적인 값으로 채우고 싶으면?
		
		//방법1.
//		bookName="HTML5+CSS3";
//		author="고경희";
		
		//방법2.//방법2를 사용하려면 맨위에있는 super();를 지워야함.고로 주석처리함.
		this("HTML5+css3","고경희");//밑의 생성자를 참고하고있다. 고로 BookMain클래스에서 이 생성자를 사용해도 책가격이 나온다.
	}//마우스 우클릭->소스->필드 생성자->체크 안함 만들기
	
	//바로 값을 입력하고싶을때. 
	public Book(String bookName, String author) {
		super();
		priceBook=7000;//이 생성자를 사용하면 책값은 무조건 7000원(BookMain에서 입력불가.)//위에 멤버변수 만들고 명시적으로 초기화안하고 static이 안붙어있어서 생성자에서 초기화해도되서 여기서 초기화함.
		this.bookName = bookName;
		this.author = author;
	}//마우스 우클릭->소스->필드 생성자 만들기

	public Book(String bookName, String author, int priceBook) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.priceBook = priceBook;//방법2.명시적으로 초기화안할 경우 이 방법을 사용한다.
		//생성자에서 초기화한 경우. 생성자2에서는 값이 7000원으로 고정이나, 여기서는 BookMain에 값을 넣을 수 있음.(단, 입력 후 참조된 값을 변경 불가능. 새로 참조시켜 새 변수명에 다른값을 넣을수있음.)
		//맨위 명시적으로 최초의1번 초기화 하였기때문에 주석처리함.맨위 명시적초기화 지움.
		//값을 바꾸고싶을 때 이 생성자를 사용함.
	}//마우스 우클릭->소스->필드 생성자 만들기
	
	//3.메서드:기능//부모로부터 상속받은 메서드 + 자식 클래스에서 추가(정의)한 메서드
	//메서드 만들어보기
	
	String getBookName() {
		return bookName;
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}//마우스 우클릭->소스->게터엔세터 생성
	
	//멤버변수의 값을 출력하는 방법1.
	void showBookInfo(){
		System.out.println(bookName+","+author);
	}

	//jsp에서는 대부분 멤버변수앞에 private만 붙이고 사용한다.
	
	//멤버변수의 값을 출력하는 방법2.
//	@Override//마우스 우클릭->소스->오버라이드 머시기 메서드 사용
//	public String toString() {
		//return 머시기 적힌거 삭제 후
//		return bookName+","+author;//출력하고자 하는 값을 넣는다.
//	}
	
	@Override//마우스 우클릭->소스->Generate toString 사용
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", priceBook=" + priceBook + "]";
	}
	
}//클래스문
/*******************************************************************************************************/