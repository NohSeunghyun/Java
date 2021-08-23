package sacnnerstring;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 키보드로부터 값을 입력하려면 Scanner 객체생성해야함.

		System.out.println("--문장 입력:");

		String s = sc.nextLine();

		System.out.println("입력한 문장=" + s);// 버퍼에 엔터가없는, 스캐너 시작지점이기때문에 실행이됨.

		System.out.print("--두 정수 입력:");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();// 정수를읽어들임//구분자는 무시(엔터,스페이스바,탭)

		System.out.println("두 정수의 합=" + (i1 + i2));// 괄호필수

		System.out.println("--문장 입력:");
		// sc.nextLine();//사용시 주석해제
		String s4 = sc.nextLine();// 정수입력 후 엔터로 출력하고난다음, 엔터가 문장으로 들어가있기 때문에 아무문자없이 그냥 출력된후 실수로 바로넘어감.버퍼에 남은 엔터를
									// 처리하면 사용가능.

		System.out.println("입력한 문장=" + s4);

		System.out.print("--두 실수 입력:");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();// 실수를읽어들임//구분자는 무시(엔터,스페이스바,탭)

		System.out.println("두 실수의 합=" + (d1 + d2));// 괄호필수

		System.out.print("--두 단어 입력:");
		String s1 = sc.next();
		String s2 = sc.next();// 단어를 읽어들여 "String"객체 생성

		System.out.println("두 단어의 합=" + (s1 + s2));

		System.out.println("--문장 입력:");
		sc.nextLine();// ★★버퍼에 남은 엔터를 처리하는 방법.//참조하지 않으면 쓰레기객체기 때문에 GC가 삭제해버림.
		String s3 = sc.nextLine();// 엔터까지 읽어들인 후 엔터를 버리고 나머지로 "String"객체 생성//nextLine 사용시 버퍼에남은 엔터를 꼭 처리해야함.

		System.out.println("입력한 문장=" + s3);

	}// 메인문

}// 클래스문
/*******************************************************************************************************/