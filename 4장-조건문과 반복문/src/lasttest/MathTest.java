package lasttest;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = null;// tmp에 참조된것이 문자열이기때문에 tmp=0;은안됨. null로해야함.

		totalstop: while (true) {// 1)while문//true : 무한루프
			System.out.println("(1) 제곱");
			System.out.println("(2) 루트");
			System.out.println("(3) 로그");

			System.out.println("원하는 메뉴(1~3)를 선택하세요(전체종료:stop)>");
			tmp = sc.next();// "문자열"을 만들어주는 객체 : "문자", " '1' ", " '2' ", " '3' ", "stop"
							// "4"를 입력시.-> 정수4가 됨.
			if (tmp.equalsIgnoreCase("stop")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} // if문//전체종료

			int menu = Integer.parseInt(tmp);// 문자열을 정수로 변환//"1"이라는 문자열->정수1로 변환
//			double d = Double.parseDouble("1.237");//문자"1.237"->실수 1.237로 변환
			if (!(1 <= menu && menu <= 3)) {// if (1>menu||menu>3)//위 수식과 같음.
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;// 아래 실행문을 실행하지 않고 맨 위(반복문 맨 처음)로 올라감.
			} // if문 // 다시 시작

			while (true) {// 2)while문

				System.out.println("계산할 값을 입력하세요.(계산종료:0, 전체종료:stop)>");
				tmp = sc.next();// sc.nextInt();는 수만 받을수있음. sc.nextLine();은 버퍼엔터 처리하는것때문에 비효율적.

				if (tmp.equalsIgnoreCase("stop")) {
					System.out.println("프로그램을 종료합니다.");
					break totalstop;
				} // if문 // 전체종료
				int num = Integer.parseInt(tmp);// "5"라는 문자열을 ->5라는 정수로 바꿔야함.
				if (num == 0) {
					System.out.println("계산종료.");
					break;// 가장 가까운 반복문을 빠져나감.
				} // if문 // 메뉴선택으로
				switch (menu) {
				case 1:
					System.out.println(num + "의 제곱 결과=" + num * num);
					break;
				case 2:
					System.out.println(num + "의 루트결과=" + Math.sqrt(num));
					break;
				case 3:
					System.out.println(num + "의 로그결과=" + Math.log(num));
					break;
				}// switch문
			} // 2)while문
		} // 1)while문
	}// 메인문

}// 클래스문
/*******************************************************************************************************/