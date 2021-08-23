package ifswitch;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// for(;true;) { for반복문에 Scanner객체생성명령어가 들어가 있으면 비효율적으로 스캐너객체가 계속생성됨
		Scanner sc = new Scanner(System.in);

		for (; true;) {
			// int i=sc.nextInt();//엔터가 남아있음.
			// sc.nextLine();//버퍼에 남은 엔터 처리.
			System.out.println("주민등록번호입력(예:123456-3******)(단,stop입력시 멈춤)>");
			String s = sc.nextLine();// '1' '2' '3' '4' '5' '6' - '3' 하나하나가 다 문자임
										// 0 1 2 3 4 5 6 7 Index번호

			if (s.equalsIgnoreCase("stop")) {
				break;
			}
			char gender = s.charAt(7);// '3'

			// 입력받은 주민등록번호 중 Index 7의 문자를 추출하여 switch문으로 처리

			switch (gender) {
			case '1':// System.out.println("남성입니다."); break;//아래 케이스와 결과값이 같으므로 생략가능.
			case '3':
				switch (gender) {
				case '1':
					System.out.println("2000이전에 출생한");
					break;
				case '3':
					System.out.println("2000이후에 출생한");
					break;
				}
				System.out.println("남성입니다.");
				break;
			case '2':
			case '4':
				switch (gender) {
				case '2':
					System.out.println("2000이전에 출생한");
					break;
				case '4':
					System.out.println("2000이후에 출생한");
					break;
				}
				System.out.println("여성입니다.");
				break;
			default:
				System.out.println("잘못된 주민등록번호 입니다.");
			}

		}

	}// 메인문

}// 클래스문
/*******************************************************************************************************/