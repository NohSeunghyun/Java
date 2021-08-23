package fruit2;

import java.util.Scanner;

public class FruitMain {// 다른분 과제소스

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = null;

		Buyer b = new Buyer(20000, 10); // (20000, 10)
		Saller s1 = new Saller("판매점1", 100, 1300, 1000);
		Saller s2 = new Saller("판매점2", 50, 1700, 2000);

		outer: while (true) {
			System.out.println("(1) 판매점1");
			System.out.println("(2) 판매점2");
			System.out.print("선택하세요 (종료하려면 stop 입력):");

			tmp = sc.next();
			System.out.println();// 구분

			if (tmp.equalsIgnoreCase("stop")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			int menu = 0;// 지역변수는 초기화를 해줘야 함
			try {
				menu = Integer.parseInt(tmp);
			} catch (NumberFormatException e) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}

			if (!(1 <= menu && menu <= 2)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			if (menu == 1) {
				System.out.println("====판매점 1에 입장하셨습니다.====");
				b.askApplePrice(s1);
				b.askNumofApple(s1);
			} else if (menu == 2) {
				System.out.println("====판매점 2에 입장하셨습니다.====");
				b.askApplePrice(s2);
				b.askNumofApple(s2);
			}
			inner: while (true) {
				System.out.println("구매자 가진 돈은" + b.getMoney() + "원입니다.");

				if (b.getMoney() == 0) {
					System.out.println("더이상 사과를 구매할 수 없습니다.");
					break outer;
				}

				System.out.println("구매할 사과의 개수를 입력하세요.(계산종료:0)");

				tmp = sc.next();
				
				int num = 0;
				try {
					num = Integer.parseInt(tmp);
				} catch (NumberFormatException e) {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				
				if (num<0) {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				
				if (num == 0) {
					System.out.println("=======계산 종료=========");
					b.showBuy();
					break inner;//inner 생략가능.가장가까운 반복문을 빠져나가기때문.
				}

				switch (menu) {
				case 1:
					int s1_APPLE_PRICE_Value = s1.getAPPLE_PRICE() * num; // 판매처 1에서 내가 구매할 가격
					if (b.getMoney() >= s1_APPLE_PRICE_Value) {
						b.buy(s1, s1_APPLE_PRICE_Value);

						System.out.println("사과 " + num + "개를 구입하셨습니다.");
						break;
					} else {
						System.out.println("구매자의 잔액이 부족하여 사과를 살 수 없습니다.");
						System.out.println();
						break;
					}
				case 2:
					int s2_APPLE_PRICE_Value = s2.getAPPLE_PRICE() * num; // 판매처 2에서 내가 구매할 가격
					if (b.getMoney() >= s2_APPLE_PRICE_Value) {
						b.buy(s2, s2_APPLE_PRICE_Value);
						System.out.println("사과 " + num + "개를 구입하셨습니다.");
						break;
					} else {
						System.out.println("구매자의 잔액이 부족하여 사과를 살 수 없습니다.");
						System.out.println();
						break;
					}
				}// switch 종료

			} // 계산종료
		} // 1번째 while문 종료
		System.out.println();// 구분
		System.out.println("=======구매자의 구매현황=======");
		b.showBuy();
		System.out.println();// 구분
		System.out.println("=======판매점 1의 판매현황=======");
		s1.showSale();
		System.out.println();// 구분
		System.out.println("=======판매점 2의 판매현황=======");
		s2.showSale();
	}//메인문
	
}//클래스문
/*******************************************************************************************************/
