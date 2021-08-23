package array2;

public class Book {
	
	//1.멤버변수=필드 : 속성
	
	static final int PRICE_BOOK=10000;//final int price_book;만쓰면 오류가뜸. final은 최초1회 초기화 해야하기때문.//해결하기 위해선 명시적으로final int price_book=값;이나 슈퍼생성자로 필드매개변수에 엑세스 수정자 변경에 퍼블릭을 넣음
										//static을 앞에 붙일시 무조건 명시적으로 초기화를 시켜주고. 밑에 생성자를 통해 생성된 price_book을 지워야함.
										////final : 최초의 1번 초기화(static 멤버변수는 생성자를 통해서 초기화불가)->값 변경 불가
	String bookName;//멤버변수
	String author;
	
	private final int bacode;//final : 최초의 1번 초기화(생성자를 통해서)->값 변경 불가//private:외부에서 보이지않게 함

	//2.생성자 : static없는 멤버변수만 초기화 -> 객체 생성
	
	public Book(String bookName, String author, int bacode) {//위에 static을 붙였기때문에 int price_book, 삭제.//매개변수//마우스우클릭->소스->유즈필드
		super();
//		this.price_book = price_book;
		this.bookName = bookName;//this. 생략 불가
		this.author = author;//this.를 사용하는 이유는 멤버변수와 매개변수를 구분하기위해
		this.bacode = bacode;//멤버변수=매개변수
	}
	
	//3.메서드 : 기능//마우스우클릭->소스->게더앤세터
	
	String getBookName() {
		return this.bookName;//this.생략가능
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	int getBacode() {
		return bacode;
	}

	//bacode가 final이므로 값 변경할 수 없도록 set메서드 안만듦
//	void setBacode(int bacode) {
//		this.bacode = bacode;
//	}

	int getPrice_book() {
		return PRICE_BOOK;
	}
	
	void showBookInfo(){
		System.out.println("책 가격="+Book.PRICE_BOOK+", 책 제목="+this.bookName+", 책 저자="+this.author+", 책 바코드="+this.bacode);
		//같은 클래스 안에 있기때문에 클래스명과 객체주소명 생략가능 =>System.out.println("책 가격="+PRICE_BOOK+", 책 제목="+bookName+", 책 저자="+author+", 책 바코드="+bacode);
	}

	@Override
	public String toString() {
		return "Book [책 제목=" + bookName + ", 저자=" + author + ", 바코드=" + bacode + "책 가격="
				+ getPrice_book() + "]";
	}//마우스우클릭->소스->to string
	
	//super() : 부모 생성자 호출
	//super.  : 부모 객체의 주소로 접근
	
	//재정의 할 때 접근제한자는 부모와 같거나 더 넓은 범위로 한다.
	//public이 제일 큰 범위표현 : 누구나 어디서든 접근가능 -> protected : 같은패키지는 접근가능, 다른패키지는 자식만 접근가능 -> x(없을때) : 같은 패키지에서만 접근가능-> private : 같은 클래스에서만 접근가능
	
	//리턴타입(=반환타입)과 메서드이름(매개변수)이 부모와 같아야 한다.
	//아래의 예)String toString() 수정하면안됨
	
	/*
	 * @Override//재정의//어노테이션
	 * public String toString() {//절대 첫줄의 public 뒷 문구는 수정하면안됨.
	 * // return super.toString(); 
	 * return "책 가격="+PRICE_BOOK+", 책 제목="+bookName+", 책 저자="+author+", 책 바코드="+bacode; }
	 * 마우스우클릭->소스->오버라이드 메서드
	 */
	
}//클래스문
/*******************************************************************************************************/