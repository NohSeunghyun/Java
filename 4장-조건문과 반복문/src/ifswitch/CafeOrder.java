package ifswitch;

import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/** 카페에서 주문을 원하는 만큼 '반복'(손님 주문(입력)->switch문으로 처리->결과 출력) **/

		// 기존의 "그만요"를 "Stop"으로 바꾸기, 마지막 주문하고 ,를 제외시키기

		String order2 = "";
		String order = null;
		int totalcnt, am, cp, cf;// 변수 선언
		int totalprice = 0, amprice = 0, cpprice = 0, cfprice = 0;
		// totalcnt=0; am=0; cp=0; cf=0;//초기화

		cafe: for (totalcnt = 0, am = 0, cp = 0, cf = 0; true;) {// (;조건문을 생략(true 무한루프);)
			System.out.print("메뉴(아메리카노(3000), 카페라떼(4000), 카푸치노(3500), Stop, 주문안함(=NoOrder))중에서 주문:");
			order = sc.next();// "주문안함"엔터->버퍼에 들어감->버퍼에서 단어를 읽어들여 String 객체 생성

			// equals():대소문자 구분하여 비교, equalsIgnoreCase():대소문자 무시하여 비교 후 같으면 true
			if (order.equals("주문안함") || order.equalsIgnoreCase("NoOrder")) {
				System.out.println("꺼져");
				break;
			} // '가장 가까운' 반복문을 빠져나감(=멈춤)

			order = order.toUpperCase();// 영어가 대문자로 변환

			switch (order) {
			case "아메리카노":
				am++;
				amprice += 3000;
				System.out.println(order + "를 주문하셨습니다.");
				break;
			case "카페라떼":
				cp++;
				cpprice += 4000;
				System.out.println(order + "를 주문하셨습니다.");
				break;
			case "카푸치노":
				cf++;
				cfprice += 3500;
				System.out.println(order + "를 주문하셨습니다.");
				break;
			case "STOP":
				if (am > 0)
					order2 = order2 + "아메리카노 " + am + "잔에 " + amprice + "원,";
				if (cp > 0)
					order2 = order2 + "카페라떼 " + cp + "잔에 " + cpprice + "원,";
				if (cf > 0)
					order2 = order2 + "카푸치노 " + cf + "잔에 " + cfprice + "원,";
				order2 = order2.substring(0, order2.length() - 2);
				totalcnt = am + cp + cf;
				totalprice = amprice + cpprice + cfprice;
				if (totalcnt == 0)
					System.out.println("꺼져");
				if (totalcnt > 0)
					System.out.println(order2 + "\n총 " + totalcnt + "잔, 총 가격은 " + totalprice + "입니다.");
				break cafe;// break;switch()문 빠져나옴
			default:
				System.out.println("메뉴에 없습니다.");// break; 생략가능
			}// switch문 종료

		} // for문 종료
		System.out.println("*************주문 끝*************");
	}// 메인문

}// 클래스문
/*******************************************************************************************************/