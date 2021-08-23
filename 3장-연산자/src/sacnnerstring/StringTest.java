package sacnnerstring;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * 라이브러리용 클래스:{ 1)멤버변수 2)생성자 3)메서드 }
		 * 
		 * 객체 생성하는 방법 1.해당 클래스가 import Ex)import java.util.Scanner; =>이때, static이 있는
		 * 멤버변수와 메서드가 메모리에 올라옴 2.New 생성자(); Ex)Scanner sc=new Scanner(System.in); =>이때,
		 * static이 없는 멤버변수와 메서드가 메모리에 올라옴//ex)String 주소=new String(객체생성명(객체값)) (단,
		 * String은 객체생성하는 방법이 1개더 있다."문자열 상수")
		 * 
		 */

		String s1 = "문자열 상수";// "문자열 상수"로 객체생성하면'공유 상수 풀'에 등록
		String s2 = "문자열 상수";

		String s3 = new String("문자열 상수");

		if (s1 == s2)
			System.out.println("'같은 주소'이므로 같은 문자열 객체를 참조");
		else
			System.out.println("'다른 주소'이므로 다른 문자열 객체를 참조");

		if (s1 == s3)
			System.out.println("\"같은 주소\"이므로 같은 문자열 객체를 참조");
		else
			System.out.println("\"다른 주소\"이므로 다른 문자열 객체를 참조");

		/*
		 * 주소를 비교하는 것은 중요하지 않다. 주소가 참조하는 객체의 값을 비교하는것이 중요하다. equals(Object 변수)
		 */

		if (s1.equals(s2))
			System.out.println("객체안의 값이 같은 문자열로 같다");
		else
			System.out.println("객체안의 값이 다른 문자열로 다르다");

		if (s1.equals(s3))
			System.out.println("객체안의 값이 같은 문자열로 같다");
		else
			System.out.println("객체안의 값이 다른 문자열로 다르다");

	}// 메인문

}// 클래스문
/*******************************************************************************************************/