package book2;

import book.Book;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1=new Book("HTML", "양영석", 1);
		System.out.println(b1);
		
		Book b2=new Book();
		System.out.println(b2);//주소를 통한 출력
		
		//문제 b2의 null값에 값넣기 책제목 jsp, 저자 윤호섭 책제목 직접접근. 저자 직접접근.안될시 간접접근.
		
		b2.bookName="jsp";//직접접근.
		b2.setAuthor("윤호섭");//직접접근안됨. author이 private멤버변수 이므로 직접접근 안됨.=>간접접근.
		
		b2.showBookInfo();//메서드를 통한 출력
		System.out.println(b2.showBookInfo2());//재정의
		
		//b2의 bookName만 값을 얻고싶을떄
		
		//1.직접접근
		System.out.println(b2.bookName);
		//2.간접접근
		System.out.println(b2.getBookName());
		
		//b2의 author만 값을 얻고싶을떄
		
		//1.직접접근 안됨. private멤버변수 이므로 간접접근만 가능.
		//2.간접접근
		System.out.println(b2.getAuthor());
		
	}//메인문

}//클래스문
/*******************************************************************************************************/