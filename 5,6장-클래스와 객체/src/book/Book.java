//라이브러용 : main()없는 클래스

/*
 * [접근제한자] 범위 : public > protected > X > private
 * 1.public : 어디서든 접근가능.
 * 2.protected : 같은 패키지에서 접근가능.단, 다른 패키지의 자식은 접근가능.
 * 3.X (아무것도없는것) : 같은 패키지에서만 잡근가능.
 * 4.private : 같은 클래스에서만 접근가능.
 *
 * class앞에  public 있으면 어디서든지 import할 수 있다.
 *                 없으면 같은 패키지에서만 import할 수 있다.
 *                 
 * [멤버변수에 값을 저장하는 방법] 
 * 1.기본값으로 초기화
 * 2.명시적으로 초기화 
 * 3.생성자를 통해 초기화
 * 
 * static 영역=정적 영역=데이터 영역=메서드 영역
 * heap 영역=동적 영역
 * 
 * [멤버변수, 메서드]
 * 1.static 있는 것 :   Book 클래스가 메모리에 로딩될 때  올라감
 * (공유)           (이때, 멤버변수는 초기화되어 올라감)
 * (=클래스변수/메서드) 만약 static멤버변수는 명시적으로 초기화를 안하면 기본값이 저장됨
 *                 그러나, final 있으면 반드시 최초의 1번은 "명시적으로 초기화"시켜줘야 함
 *               
 *               [static 멤버변수에 값을 저장하는 방법]
 *               1)기본값으로 초기화 
 *               2)명시적으로 초기화
 *               ----위 둘 중 한가지 방법 사용.----
 *               3)생성자를 통해 초기화(X)
 *               이유?static 멤버변수는 이미 메모리에 올라와 있으므로.
 *               	생성자를 통해 객체 생성하면 그 안에 존재하지 않음.
 *               
 *               클래스이름으로 접근가능(권장)
 *               객체주소로도 접근가능(경고)
 *               
 * 2.static 없는 것  : 생성자를 통해 static이 없는 멤버변수에 값을 주어 객체 생성되면 메모리에 올라감 
 * (각 객체안에 존재)	 static이 없는 멤버변수/메서드는 객체 안에 존재   
 * (=instance 멤버변수/메서드)
 *				 [static없는 멤버변수에 값을 저장하는 방법]
 *               1)기본값으로 초기화 
 *               2)명시적으로 초기화
 *               3)생성자를 통해 초기화
 *               
 * 				  반드시 객체의 주소로만 접근가능
 * 				(this:자신의 주소. 객체 안에 존재하는 키워드.static에서는 사용불가.)
 * 
 * 3.final 멤버변수 : 반드시 최초의 1번은 "초기화"시켜주고->값 변경 불가
 * 				 [초기화 방법]
 * 		         1)기본값으로 초기화(X)
 * 				 ----아래 둘 중 한가지 방법 사용.----
 * 				 2)명시적으로 초기화 : 각 객체안의 final 멤버변수의 값이 동일 
 * 				 3)생성자를 통해 초기화 : 생성자의 매개값에 각 객체안의 final 멤버변수의 값이 달라짐
 * 
 * 4.static final 멤버변수 : 반드시 명시적으로 초기화만됨. 변수이름은 "대문자"를 사용(권장)
 * 
 * 5.private 멤버변수 : 다른 클래스에서는 접근 불가->정보 보안(캡슐화)
 * 					  접근 방법: 같은 클래스안의 메서드를 통해 간접접근하여 값을 얻거나(=get~()) 다른값으로 변경(=set~())할 수 있다.
 * 
 * (final)
 * 1) public final class 클래스명 : 상속불가.
 * 2) final 멤버변수 : 값 변경 불가
 * 3) final 메서드 : 재정의 불가
 */
package book;

public class Book {
	//1. 멤버변수=필드 : 속성 (명시적으로 값을 대입하지 않으면 기본값이 대입됨)
	//[멤버변수에 값을 저장하는 방법]
	//1.기본값, 
	//2.명시적으로 초기화, 
	//3.생성자를 통해 초기화
	//final:반드시 최초의 1번은 "초기화"시켜 주고 -> 값 변경 불가
	public static final int PRICE_BOOK;//static멤버변수:Book 클래스가 메모리에 로딩할 때 초기화되어 올라감//static final + 변수 = 상수. 이 경우 변수명을 대문자로 적어야함.(반드시는 아님.)
								//초기화블럭 설명을 위한 초기화값 제거.
	
	//public static int serialNumber;//final이 안붙어있어 명시적으로 초기화 안해도됨.
	
	public String bookName;
	private String author;	//private통해 '정보보안=캡슐화'
	//final int bacode=1234;//모든 책에서 같은 값으로
	public final int bacode;//모든 책의 바코드값을 다른 값으로 하고 싶을 때
	public int page;
	/*
	 * static 초기화 블럭 : static 멤버변수에만 사용 - static 멤버변수에 초기값을 적용. Book클래스가 메모리에 로딩될때 최초의 1번만 호출됨.
	 * 복잡한 계산을 해야하거나 메서드 호출한 결과를 초기값으로 세팅할 때 사용
	 */
	static {
		int hap=0;
		for(int i=1;i<=10;i++) hap+=i;
		System.out.println("static초기화 블럭");
		PRICE_BOOK=hap;
	}
	
	/*
	 * instence 초기화 블럭(=초기화 블럭) : 생성자가 호출되기 직전에 초기화블럭이 호출됨
	 */
	{
		//bacode=Math.abs(-123);//절대치. | -123 | = 123
		//bacode+=10;//오류. final이므로 값변경 불가
		System.out.println("초기화 블럭");
		page=Math.abs(-123);
		page+=10;
	}
	
	/*
	 * 2. 생성자 반드시 존재
	 * 생성자 역할 : static이 없는 멤버변수에 값을 주어 객체 생성
	 * 생성자는 반환타입이 없다. void 자체도 안적음. ★객체안에 존재하지 않음.
	 * 
	 * 생성자 없으면 컴파일러가 자동으로 기본생성자 삽입
	 * ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	 * 기본생성자  public Book(){}
	 * 생성자의 {}안에 super();가 없으면 컴파일러가 자동으로  삽입(반드시 첫줄에 삽입함)
	 * 
	 * super();부모생성자 호출->부모객체 생성
	 * ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	 * 기본생성자  public Book(){super();}
	 * 
	 * 기본생성자는 부모생성->'기본값'으로 채워 자식객체 생성
	 * 기본값-기본타입  int(0), double(0.0), char('\0'널문자), boolean(false)
	 *      클래스타입 String(null)
	 *      
	 * super. : '부모의 주소'로 접근
	 * super(); : '부모의 생성자'호출
	 * 
	 * this. : '자신의 주소'로 접근(같은 클래스 내에서만 사용가능)
	 * this(); : '자신의 다른 생성자'를 호출.
	 * 			  반드시 생성자 안에서만 사용가능.
	 *           매개변수가 적은 생성자 안에서 매개변수가 많은 다른 생성자를 호출할 때 사용
	 */
	
	public Book() {
		super();
		bacode=111;//이 생성자로 객체를 생성하면 각 객체안의 바코드는 같다.
		//초기화블럭에 bacode값을 넣으면 오류가뜬다.이유? 초기화블럭을 통해 먼저 초기화 후에 생성자 호출하였기때문. final이기때문에 값변경안되기때문.
		
	}
	
	public Book(String bookName, String author){
		//4줄
//		super();
//		this.bookName = bookName;
//		this.author = author;
//		bacode=222;
		
		//4줄을 1줄로 간결히
		this(bookName, author, 222);
		//this();위에는 어떠한 실해문도 존재해선 안된다.
		//이유?this가 다른생성자를 호출하여 생성하는데 다른 생성자안의 첫줄에 super();가 존재하기때문.
		//super();도 안됨. 이유? 2개의 부모는 존재할 수 없으므로. 자바는 단일부모로 단일상속.
	}
	
	public Book(String bookName, String author, int bacode) {
		super();//반드시 생성자의 맨첫줄에.1.부모(Object) 생성자 호출->부모객체 생성
		//this:자기 자신의 객체 주소(객체 안에만 존재)
		//this.priceBook = 10000;//0->10000->20000->-10000
		this.bookName = bookName;//2.자식의 멤버변수에 값을 주어 자식객체 생성
		this.author = author;
		//this 사용이유?멤버변수와 매개변수를 구분하기 위해
		
		this.bacode = bacode;//100
	}

	//3.메서드
	
	/*
	 * get~() : 멤버변수의 값을 얻어올 때
	 * set~() : 전달받은 매개값으로 멤버변수의 값을 변경할 때
	 */
	
	public static int getPricebook() {
		return PRICE_BOOK;//클래스명.static이붙은 변수명, 클래스명 생략 : 같은 클래스안에 있으므로//static이 붙어있으므로 this.사용못함.
	}
	
//	static double getAbs(double a) {
//		return Math.abs(a);//abs (-1.3) = |-1.3| = 1.3 // 클래스명 생략불가. 같은 클래스가 아닌 다른 클래스(Math)안에 있으므로
//	}
	
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
	
	public int getBacode() {
		return bacode;
	}

	public void showBookInfo(){
		System.out.println(this.PRICE_BOOK+","+bookName+","+author+","+bacode);//여기서 price_book은 this.으로 접근가능.(주소로 접근하므로 경고) static이 안붙어있어서
																			   //Book.price_book으로도 접근가능(클래스명으로 접근하므로 권장.)
		                                                                       //같은 클래스안에 있는 멤버이므로 둘 다 생략가능.
	}
	
	public String showBookInfo2(){
		return this.PRICE_BOOK+","+bookName+","+author+","+bacode;
	}
	
	//this.    : 자기 자신의 주소(자기 자신의 주소로 접근) // . : 접근한다.
	//this();  : 자기 자신의 생성자 호출. '생성자 안'에서만 사용 가능.(반드시 첫줄에 위치)
	
	//super(); : 부모 생성자 호출. '생성자 안'에서만 사용 가능.(반드시 첫줄에 위치)
	//super.   : 부모 객체의 주소(부모 객체의 주소로 접근)
	
	//<메서드 재정의>
	//1.재정의 할 때 접근제한자는 부모와 같거나 더 넓은 범위로 한다.
	//★★★(그래야 부모의 toString() 메서드를 덮어씌워 컴파일러한테 안보이고 자식의 toString() 메서드만 보여 호출이 가능)
	//public : 누구나 어디서든 접근가능  > protected : 같은패키지는 접근가능.단,다른패키지는 자식만 접근가능  > x(없을때) : 같은 패키지에서만 접근가능  > private : 같은 클래스에서만 접근가능
		
	//2.리턴타입(=반환타입)과 메서드이름(매개변수)이 부모와 반드시 같아야 한다.
	//예)String toString() 수정하면안됨
	
	//재정의하는 방법-1: 마우스우클릭->소스->메서드대체/구현->재정의할 메서드 선택->확인
//	@Override//재정의//어노테이션
//	public String toString() {
//		//return super.toString();//필요없는 것.object의 toString을 그대로 리턴해준다는 뜻. 재정의를 위해선 지워야함.
//		return PRICE_BOOK+","+bookName+","+author+","+bacode;
//		or 	return "Book [bookName=" + bookName + ", author=" + author + ", bacode=" + bacode + ", price=" + PRICE_BOOK + "]";
//	}
	
	//재정의하는 방법-2:마우스우클릭->소스->Generate toString()...//재정의한것을 다시 재정의할수 없기때문에 위에 재정의를 주석처리
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", bacode=" + bacode + ", price=" + PRICE_BOOK + "]";
	}
	
}//클래스문
/*******************************************************************************************************/