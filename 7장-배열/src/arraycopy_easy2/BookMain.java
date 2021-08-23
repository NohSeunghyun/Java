package arraycopy_easy2;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1=new Book();//기본값으로 하면 null,null,...(멤버변수수만큼) 구체적인 값을 넣고싶으면 Book클래스에 추가한 것 확인.
		
		//멤버변수의 값을 출력하는 방법2가지
		//1.메서드 추가
		//2.toString 재정의
		//Book클래스에 추가한 것 확인
		
		b1.showBookInfo();//방법1.추가후 이 명령어를 사용
		
		//제목:JSP, 저자:김건우으로 객체생성하기
		
		Book b2=new Book("JSP", "김건우");//바로 값을 입력하고싶을때. 생성자를 새로 생성한다.Book클래스에 추가한 것 확인.
		
		b2.showBookInfo();
		
		//저자 김건우->이정은 변경 후 멤버변수값들을 출력
		
		b2.setAuthor("이정은");
		
		b2.showBookInfo();
		
		//주소만으로도 멤버변수의 값이 출력되도록 하기.(방법2.toString 재정의 해야함.)Book클래스에 추가,수정한 것 확인
		
		System.out.println(b1);//재정의 전에는 주소값이나옴.(패키지명.클래스명@16진수해시태그)
		System.out.println(b2);//재정의 후에는 참조값이나옴.
		
		//책 가격 넣기
		
		Book b3=new Book("MY SQL", "홍길동", 5000);//생성자3번사용
		
		System.out.println(b3);
		
		//책 가격 바꾸기.
		
//		b3.priceBook=10;//파이널을 썼기때문에 값변경 불가하므로 주석처리
		
		//final이 붙은 책가격 바꾸기위해 생성자3번을사용.
		
		Book b4=new Book("MY SQL", "홍길동", 12000);
		
		System.out.println(b4);
		
		//이렇게 책가격이 바뀌는 것을 방지하기위해 Book클래스에 priceBook;앞에 final을붙임.Book클래스에 추가한 것 확인
	}//메인문

}//클래스문
/*******************************************************************************************************/