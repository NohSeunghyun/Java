package bookarray;

import java.util.ArrayList;

import booktest.Book;

public class BookArrayList {

	public static void main(String[] args) {
		
		ArrayList<Book> library=new ArrayList<Book>();//new ArrayList<Book>의 Book은 생략가능.//참조되는 곳의 타입에 Book을 적어놨기때문
		
		library.add(new Book("태백산맥", "조정래", 1));
		library.add(new Book("토지", "박경리", 2));
		library.add(new Book("어린왕자", "생텍쥐페리", 3));
		
		for(Book b:library) {
			b.showBookInfo();
		}//확인
		System.out.println();
		
		System.out.println("==========================책추가==========================");
		
		library.add(1, new Book("JAVA", "홍길동", 4));//(1인덱스자리, 값을 넣기위한 Book생성자호출)
		
		for(Book b:library) {
			b.showBookInfo();
		}//확인
		System.out.println();
		System.out.println("==========================책삭제==========================");
		
		System.out.println("삭제한 책 정보="+library.remove(1));//1인덱스위치의 값을 삭제.
		
		for(Book b:library) {
			b.showBookInfo();
		}//확인
		System.out.println();
		
		if (library.remove("문자열")) System.out.println("찾아서 삭제함");
		else System.out.println("찾았는데 없어서 삭제못함");
		System.out.println();
		
		/* 
		 * 뒤에서 자세히배움.
		 * if (library.remove(new Book("토지", "박경리", 2))) System.out.println("찾아서 삭제함");
		 * else System.out.println("찾았는데 없어서 삭제못함");
		 */
		System.out.println("==========================전체삭제==========================");
		library.clear();
		
		for(Book b:library) {
			b.showBookInfo();
		}//확인
		System.out.println();
		
	}//메인문

}//클래스문
/*******************************************************************************************************/