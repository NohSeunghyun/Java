package booktest;

public class BookMain {

	public static void main(String[] args) {
		
		//Book 객체 생성("스풀링", "이수광", 123)후 참조시키고 주소만으로 값출력은 재정의한 toString으로
		
		Book b1=new Book("스풀링", "이수광", 123);
		System.out.println(b1);
		
		//값 변경 : "스풀링"->"CSS", "이수광"->"전상호" 직접접근가능하면 직접접근. 안되면 간접접근. 값출력은 show메서드로
		
		b1.bookName="CSS";//직접접근
		b1.showBookInfo();//값확인
		b1.setAuthor("전상호");//간접접근 Author은 private라 간접접근해서 값변경.
		b1.showBookInfo();//값확인
		
		//값 얻기 : 바코드와 책가격을 얻어 출력하기
		
		System.out.println("바코드="+b1.bacode);//직접접근
		System.out.println("바코드="+b1.getBacode());//간접접근
		System.out.println("책가격="+Book.getBookPrice());
		
	}//메인문

}//클래스문
/*******************************************************************************************************/