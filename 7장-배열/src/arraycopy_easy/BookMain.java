package arraycopy_easy;

public class BookMain {
	//기본생성자 public BookMain(){super();}
	public static void main(String[] args) {
		
		Book b1=new Book("뽀로로", "정성훈");
//		System.out.println(b1.bookName+","+b1.author);//멤버 변수에 직접 접근//Book클래스에 변수앞에 프라이빗을붙여 사용못함.
//		System.out.println(b1.getBookName()+","+b1.getAuthor());//멤버 변수에 메서드를 통해 간접 접근
		b1.showBookInfo();
		System.out.println(b1);//b1의 객체주소가나옴//주소->패키지명.클래스명@객체의 주소로 만든16진수 해시코드
		//object의toString() 결과 : 패키지명.클래스명@객체의 주소로 만든16진수 해시코드
		System.out.println(b1.toString());
		
		System.out.println("=======================================");
		
		Book b2=new Book("아기상어", "주종환");
//		System.out.println(b2.getBookName()+","+b2.getAuthor());//멤버 변수에 메서드를 통해 간접 접근
		b2.showBookInfo();
		System.out.println(b2);
		System.out.println(b2.toString());
		
		//b2의 참조 끊는방법(값을 사용할 필요가 없어서 다른객체를 참조시키거나 null값을 준다.)
		
		//b2=null;
		//or
		//b2=new Book("JAVA입문", "김무준");
		
		System.out.println("=======================================");
		
		Book b3=new Book("JAVA입문", "김무준");
		
		b3.showBookInfo();//확인
		
		//b3의 저자(author)를 다른사람으로 바꾸기.//author private이므로 직접접근 제한되있음.
		
		b3.setAuthor("신명희");
		
		System.out.println(b3);//toString를 재정의했기때문에 toString으로 출력됨.//자동으로 toString()은 호출됨.
		System.out.println(b3.toString());//값이 위와같다.
		
		//b3의 책 제목만 출력하기 방법-1
		
		//지역변수 이용하면 계속 사용가능.
		String bookName=b3.getBookName();//변수에 담아 출력
		System.out.println("책 제목="+bookName);
		
		//b3의 책 저자만 출력하기 방법-2
		
		System.out.println("책 저자="+b3.getAuthor());//변수에 안담고 바로 출력해도됨.
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		System.out.println("책 제목="+bookName+", 책 저자="+b3.getAuthor());//지역변수 계속 사용가능.
		
		System.out.println("=======================================");
		
		Book b4=new Book();//기본생성자 호출
		System.out.println(b4);//기본값 확인
		
		//set을 이용해 기본값에 값넣기.
		
		b4.setBookName("오라클");//BookName,Author 둘다 private이므로 간접접근 해야함.
		System.out.println(b4);//값확인
		b4.setAuthor("이진주");
		System.out.println(b4);
		
	}//메인문

}//클래스문
/*******************************************************************************************************/