package arraycopy_easy;
//이지스퍼블리싱 자바 교재 p.207참조하여 추가.
//라이브러리용
public class Book {
	
	//1.멤버변수=필드:속성
	
	private String bookName;
	private String author;
	
	//2.생성자
	//생성자가 있으면 컴파일러가 기본생성자 삽입(생성)안함.
	public Book() {
		//super();//생성자 첫줄에 존재,부모객체 생성후
		//자식의 'static이 없는 멤버변수'에 값을 주어 초기화(=객체 생성)
		//없으면 멤버변수에 '기본값'으로 채워줌
		
		/*
		 * 멤버변수에 '기본값'으로 채우기싫고 기본값이아닌 '구체적인 다른값'으로 채우고싶으면
		 */
		
		//방법1.:2줄
		
//		bookName="구체적 제목";
//		this.author="구체적 저자";
		
		//방법2.this();이용하여 1줄로.//확인하기위해 위 방법 주석처리
		//★주의사항 : this(); 위에 코드(=실행문) 있으면 오류발생.(super();도 있으면 오류발생,this가 매개변수를불러와 객체생성할 때 실행문안에 이미 삽입되있으므로 super를 적으면 부모객체가 2개가 생성되는것이므로 요류.
		//(=맨 첫줄에 넣어야한다는 말)
		
		//this(); : 매개변수가 더 많은 다른 생성자를 호출 할 때 사용
		this("구체적 책 제목","구체적 책 저자");//Book(String bookName, String author)호출.
	}
	
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;//this.생략불가능 이유?매개변수명과 멤버변수명의 같아서 구분하기 위해. 
		this.author = author;//this.생략불가능
	}
	
	//3.메서드:기능
	
	String getBookName() { // get 메서드는 값을 돌려받음
		return bookName;//this.생략가능
	}

	void setBookName(String bookName) {// set 메서드는 값을 변경시킴.돌려주진않음.(출력안됨)
		this.bookName = bookName;//this.생략불가능
	}

	String getAuthor() {
		return author;//this.생략가능
	}

	void setAuthor(String author) {
		this.author = author;//this.생략불가능
	}
	
	void showBookInfo(){//this.생략가능
		System.out.println(this.getBookName()+","+getAuthor());
	}
	
	//toString 재정의방법-1:마우스 우클릭->소스->메서드대체구현(=Override/Implement Mathods...)(맨위)->object의 toString
//	@Override
//	public String toString() {
//		//this. 생략가능.	
//		return this.bookName+","+author;//방법-1.멤버변수에 직접접근.//이방법을 많이 사용.
//		return this.getBookName()+","+getAuthor();//방법-2.멤버변수에 간접접근하여 원래있던 값(주소)을 값(책이름과 저자)으로 덮어씌움.
//	}	
	
	//toString 재정의방법-2:마우스 우클릭->소스->Generate toString()...
	@Override
	public String toString() {
		//this. 생략가능
		return "Book [bookName=" + this.bookName + ", author=" + author + "]";
	}
	
}//클래스문
/*******************************************************************************************************/