package ifswitch;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("======과제======");

		int totalcnt, am, cp, cf;
		int am1 = 0, cp1 = 0, cf1 = 0, totalcnt1 = 0;

		for (totalcnt = 0, am = 0, cp = 0, cf = 0;;) {

			System.out.println("주문하시겠습니까?->\n(메뉴:아메리카노, 카페라떼, 카푸치노, 그만, 안사(=No Order))");
			String Order = sc.next();

			if (Order.equals("안사") || Order.equalsIgnoreCase("No Order")) {
				System.out.println("꺼져");
				break;
			}

			switch (Order) {
			case "아메리카노":
				am++;
				am1 = am1 + 3000;
				System.out.println(Order + am + "잔");
				break;
			case "카페라떼":
				cp++;
				cp1 = cp1 + 4000;
				System.out.println(Order + cp + "잔");
				break;
			case "카푸치노":
				cf++;
				cf1 = cf1 + 3500;
				System.out.println(Order + cf + "잔");
				break;
			case "그만":
				totalcnt = am + cp + cf;
				totalcnt1 = am1 + cp1 + cf1;
				if (am > 0) {
					System.out.println("아메리카노" + am + "잔" + am1 + "원,");
				}
				if (cp > 0) {
					System.out.println("카페라떼" + cp + "잔" + cp1 + "원,");
				}
				if (cf > 0) {
					System.out.println("카푸치노" + cf + "잔" + cf1 + "원,");
				}
				if (am <= 0 && cp <= 0 && cf <= 0) {
					System.out.println("꺼져");
				}
				if (totalcnt > 0) {
					System.out.println("총" + totalcnt + "잔" + totalcnt1 + "원입니다.");
				}
				break;
			default:
				System.out.println("안팝니다.");
				break;
			}// switch문 종료

			if (Order.equals("그만"))
				break;

		}// for문 종료

		sc.close();

	}// 메인문

}// 클래스문
/*******************************************************************************************************/