package booktest;

public class Book {
	
	//1.멤버변수
	
	//책가격:10000원 공시->값변경불가(어디서든지 접근가능)
	public static final int BOOK_PRICE=10000;
	//책제목 어디서든지 접근가능
	public String bookName;
	//책저자 : 정보보안
	private String author;
	//바코드:서로다른값으로 바코드에 값을줌->값변경불가(어디서든지접근가능)
	public final int bacode;
	
	//2.생성자
	
	public Book(String bookName, String author, int bacode) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bacode = bacode;
	}

	//3.메서드:어디서든지 접근가능
	
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

	public static int getBookPrice() {
		return BOOK_PRICE;
	}

	public int getBacode() {
		return bacode;
	} 
	
	public void showBookInfo() {
		System.out.println("bookName="+bookName+", author="+author+", bacode="+bacode+", BOOK_PRICE="+BOOK_PRICE);
	}

	public String showBookInfo2() {
		return "bookName="+bookName+", author="+author+", bacode="+bacode+", BOOK_PRICE="+BOOK_PRICE;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", bacode=" + bacode + ", BOOK_PRICE="+BOOK_PRICE+"]";
	}
	
}//클래스문
/*******************************************************************************************************/