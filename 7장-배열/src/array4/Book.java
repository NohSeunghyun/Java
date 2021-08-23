package array4;

public class Book {
	
	//1.멤버변수=필드:속성
	
	//책가격(int)- 만원 공시. 값변경불가(어디서든지 접근허용) public static final int
	public static final int PRICE_BOOK=10000;
	//책 제목(string)- 어디서든 접근가능 public
	public String bookName;
	//책 저자(string)- 정보 보안 private
	private String author;
	//바코드(int)- "서로 다른값"으로 바코드에 값을 줌.->값 변경불가.생성자를 통해 변경 public final int 명;
	final int bacode;
	
	//2.생성자-마우스우클릭->소스->필드를사용하여 생성자 생성
	
	public Book(String bookName, String author, int bacode) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bacode = bacode;
	}
	
	//3.메서드:어디서든지 접근가능 -마우스우클릭->소스->게터및세터->퍼블릭체크(모든곳에서 사용하려면) 생성
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static int getPriceBook() {
		return PRICE_BOOK;
	}

	public int getBacode() {
		return bacode;
	}
	
	public void showBookInfo() {
		System.out.println(bookName+","+author+","+bacode+","+PRICE_BOOK);
	}
	
	public String showBookInfo2() {
		return bookName+","+author+","+bacode+","+PRICE_BOOK;
	}
	
	//toString() 메서드 재정의
	@Override//마우스우클릭->소스->toString재정의->메서드체크 확인
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", bacode=" + bacode + ", BookPrice=" + PRICE_BOOK + "]";
	}
	
}//클래스문
/*******************************************************************************************************/