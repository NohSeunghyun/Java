//실행용클래스 : main() 있음
package book;
//같은 패키지에 있는 클래스는 자동 import됨 (Book클래스가 import됨)
public class BookMain {
   //기본생성자
	public static void main(String[] args) {
		//static 있는 멤버변수와 메서드
		System.out.println("책가격="+Book.PRICE_BOOK);//멤버변수에 직접 접근
		System.out.println("책가격="+Book.getPricebook());//메서드를 통한 멤버변수에 간접 접근
		
		//static 없는 멤버변수와 메서드
		Book b1=new Book("뽀로로", "유신재", 11);
		
		//private 멤버변수는 접근 불가하므로 '접근가능한 메서드'를 통해서 간접 접근 허용함
		//System.out.println("책1-저자="+b1.author);//멤버변수=필드의 값에 직접 접근
		//b1.author="김경탄";//오류//직접 접근 불가
		String author=b1.getAuthor();
		System.out.println("책1-저자"+author);//방법1
		
		System.out.println("책1-저자"+b1.getAuthor());//방법2
		
		b1.setAuthor("김경탄");//간접 접근
		System.out.println("책1-저자="+b1.getAuthor());//get~()통해서 필드의 값에 간접 접근
		System.out.println("책1-책가격="+b1.PRICE_BOOK);//주소접근해서 경고가 뜸.
		System.out.println("책1-책바코드="+b1.bacode);
		
		b1.showBookInfo();
		
		System.out.println();//구분위한 빈줄
		
		Book b2=new Book("아기상어", "전용준", 22);
		System.out.println("책2-책제목="+b2.bookName);//직접 접근
		System.out.println("책2-책제목="+b2.getBookName());//메서드를 통한 간접 접근
		System.out.println("책2-저자="+b2.getAuthor());
		System.out.println("책2-책가격="+Book.PRICE_BOOK);//클래스명으로 접근(권장)해서 경고가 사라짐.
		System.out.println("책2-책바코드="+b2.bacode);
		
		b2.showBookInfo();
		
	}//메인문

}//클래스문
/*******************************************************************************************************/