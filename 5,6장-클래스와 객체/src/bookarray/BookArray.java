package bookarray;

import booktest.Book;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library=new Book[3];//[null, null null]
		
		library[0]=new Book("태백산맥", "조정래", 1);
		library[1]=new Book("토지", "박경리", 2);
		library[2]=new Book("어린왕자", "생텍쥐페리", 3);
		
		//배열객체 메서드이용 값 출력 방법1.
		//향상된 for : 값을 참조만 할 때 사용.값 변경 불가.(이유?index로 접근할수 없기때문)//값변경->library[0]="a","b",2;로 변경해야하기때문.
		for(Book b:library) {
			System.out.println(b);
		}
		
		System.out.println("-------------------------------");
		
		//배열객체 메서드이용 값 출력 방법2.
		for(Book b:library) {
			b.showBookInfo();
		}
		
		/*
		 * 배열로 처리했을 때 문제
		 * 1.배열크기가 고정 : 남으면 메모리를 비효율적으로 사용.ex) length==100, 그런데 값은 1개만 사용.
		 * 											length==100, 그런데 값을 101개 쓰고싶을 때 1개 추가가 안됨.
		 * 2.추가와 삭제에 대한 코드를 프로그래머가 작성
		 * 해결법 : 컬렉션 프레임워크(대표:ArrayList)
		 */
		
		
		
	}//메인문

}//클래스문
/*******************************************************************************************************/