package string;

import java.util.Scanner;

public class StringCafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Order = null;// 참조하는 객체없다.
		String Order2 = "";// 값이 없는 문자열객체를 참조(=length길이 0)

		// StringCafe에서 마지막 , 출력 안되게 하기 변수선언,length(),subString()이용해보기 다른거사용가능

		int totalcnt, am, cp, cf, totalprice, amprice, cpprice, cfprice;

		cafe: for (totalcnt = 0, am = 0, cp = 0, cf = 0, amprice = 0, cpprice = 0, cfprice = 0, totalprice = 0; true;) {

			System.out.println("주문하시겠습니까?->\n(메뉴:아메리카노(3000원), 카페라떼(4000원), 카푸치노(3500원), 그만, 안사(=No Order))");
			Order = sc.next();

			if (Order.equals("안사") || Order.equalsIgnoreCase("No Order")) {
				break;
			}

			switch (Order) {
			case "아메리카노":
				am++;
				amprice += 3000;
				System.out.println(Order + am + "잔");
				break;
			case "카페라떼":
				cp++;
				cpprice += 4000;
				System.out.println(Order + cp + "잔");
				break;
			case "카푸치노":
				cf++;
				cfprice += 3500;
				System.out.println(Order + cf + "잔");
				break;
			case "그만":
				break cafe;
			default:
				System.out.println("안팝니다.");
				break;
			}// switch문 종료

		} // for문 종료
		if (am > 0) Order2=Order2+"아메리카노"+am+"잔"+amprice+"원,";
		if (cp > 0) Order2=Order2+"카페라떼"+cp+"잔"+cpprice+"원,";
		if (cf > 0) Order2=Order2+"카푸치노"+cf+"잔"+cfprice+"원,";//원:0, ,:1, length:2 (0,length-1)=>(0,1)->원+,이 나와야하지않나 싶은데 ,이 제거됨
		// subString(시작인덱스,끝인덱스)
		totalcnt = am + cp + cf;
		totalprice = amprice + cpprice + cfprice;
		Order2=Order2.substring(0,Order2.length()-1);
		if (totalcnt > 0)
			System.out.println(Order2+"\n총" + totalcnt + "잔" + totalprice + "원입니다.");

	}// 메인문

}// 클래스문
/*******************************************************************************************************/