package array2;

public class BookMain {
	//기본생성자
	public static void main(String[] args) {
		
		System.out.println("모든 책 값="+Book.PRICE_BOOK);//10000(변경불가)
		
		Book b3=new Book("HTML", "노승현", 33);
//		System.out.println("[책3]책 가격="+b3.PRICE_BOOK+", [책3]책 제목="+b3.getBookName()+", [책3]책 저자="+b3.getAuthor()+", [책3]책 바코드="+b3.getBacode());
		b3.showBookInfo();
		
		Book b4=new Book("JSP", "김명강", 44);
//		System.out.println("[책4]책 가격="+b4.PRICE_BOOK+", [책4]책 제목="+b4.getBookName()+", [책4]책 저자="+b4.getAuthor()+", [책4]책 바코드="+b4.getBacode());
		b4.showBookInfo();
		
		b4.author="엄민정";//직접접근으로 값변경
		System.out.println("[책4]바뀐 저자 확인="+b4.getAuthor());//간접접근으로 값출력
		
		b4.setAuthor("조지영");//간접접근으로 값변경
//		System.out.println("[책4]바뀐 저자 확인="+b4.getAuthor());
		System.out.println("[책4]바뀐 저자 확인="+b4.author);//직접접근으로 값출력
		
		//private 멤버변수는 다른 클래스에서 직접 접근 불가하므로 '접근 가능한 메서드'를 통해서 접근해야함
		System.out.println("[책4]바뀐 바코드 확인="+b4.getBacode());//변경 불가인 바코드값을 출력하기 위해선 간접접근만 가능.
//		System.out.println("[책4]책 가격="+b4.PRICE_BOOK+", [책4]책 제목="+b4.getBookName()+", [책4]책 저자="+b4.getAuthor()+", [책4]책 바코드="+b4.getBacode());
		b4.showBookInfo();//제일 마지막 수정한 값이 나옴.
		
		String s1="문자열";
		System.out.println(s1);//s1 : "문자열"의주소
		System.out.println(s1.toString());
		
		System.out.println(b4);//재정의 하기전 -> b4 : Book객체의 주소 array2.Book@7852e922
		System.out.println(b4.toString());//재정의 후 사용하면 객체의 주소가 아닌 값이 나온다
		
	}//메인문

}//클래스문
/*******************************************************************************************************/