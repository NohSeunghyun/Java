/*
 * 클래스 2가지
 * 1.라이브러리용(=설계도) : main()없다.
 * 			   	   	    멤버변수,메서드들()
 * 
 * 2.실행용 : main()만 있다.
 * 
 * 3.라이브러리용+실행용 : main()도 있고,
 * 		  			 +멤버변수,메서드들()추가하면 실행용 클래스로도 객체 생성 가능(=라이브러리용도 가능)
 * 
 * 클래스에 static이 있는것 : import할때 메모리에 업로드
 * 클래스에 static이 없는것 : 생성자로 객체를 생성할 때 메모리에 업로드
 * 
 * ★모든 클래스에는 "생성자"가 "존재"한다.
 * 생성자역할 : 객체생성하여 힙메모리에 업로드
 * 
 * public : 접근제한자 - 모두 접근 가능
 * public이 없으면(=default) : 같은 패키지에서만 접근 가능
 */

package ifswitch;

import java.util.Scanner;

public class IfSwitch {

	// 멤버변수(옵션(=필요에 따라 삽입 가능))

	// 생성자가 없으면 컴파일러가 자동으로 "기본생성자"를 만들어 삽입
	// 생성자{}안에 비어있으면 컴파일러가 자동으로 super();삽입
	/*
	 * public IfSwitch () { super();//부모(Object)의 생성자를 호출하여 부모(Object)객체를 생성 }
	 */

	// 메서드(옵션(=필요에 따라 삽입 가능))

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * If문
		 */

		System.out.println("======성적을 If문으로 산출======");

		System.out.print("정수 입력(0~100)->");
		int n1 = sc.nextInt();

		System.out.println("------단독if문------");

		// 단독 if문은 서로 독립적

		if (n1 >= 90 && n1 <= 100)
			System.out.print("A");
		if (n1 >= 80 && n1 < 90)
			System.out.print("B");
		if (n1 >= 70 && n1 < 80)
			System.out.print("C");
		if (n1 >= 60 && n1 < 70)
			System.out.print("D");
		if (n1 < 60)
			System.out.print("F");

		System.out.println("학점");// 문자열에 같은 문구가 반복될시 (ex)A학점,B학점....) sysout println(출력하고자하는)에서 ln은 줄바꿈.ln을 지우고
									// 이수식을 넣는다

		System.out.println("------if~elseif~esle문------");

		// if~else if........else문:한덩어리~여러조건문 중 반드시 하나만 참(=실행)

		if (n1 >= 90 && n1 <= 100)
			System.out.print("A");
		else if (n1 >= 80)
			System.out.print("B");// else의 의미:n1<90이므로 범위지정 필요없음.
		else if (n1 >= 70)
			System.out.print("C");
		else if (n1 >= 60)
			System.out.print("D");
		else
			System.out.print("F");// else의 의미:n1<60이므로 if필요없음.

		System.out.println("학점");

		System.out.println("------중첩if문------");

		// 중첩 if문 // 95~100:A+, 90~94:A....

		if (n1 >= 90) {
			if (n1 >= 95)
				System.out.print("A+");
			else
				System.out.print("A");
		} else if (n1 >= 80) {
			if (n1 >= 85)
				System.out.print("B+");
			else
				System.out.print("B");
		} else if (n1 >= 70) {
			if (n1 >= 75)
				System.out.print("C+");
			else
				System.out.print("C");
		} else if (n1 >= 60) {
			if (n1 >= 65)
				System.out.print("D+");
			else
				System.out.print("D");
		} else
			System.out.print("F");

		System.out.println("학점");

		System.out.println("======Switch문======");

		/*
		 * Switch()문:여러 개 중 하나만 선택하여 실행(if~else if........else문과 호환가능(=비슷)) 단,Switch문은
		 * 표현제한이 있으나 깔끔함.if~else if else문이 표현범위가 넓음 ()안에 들어갈 수 있는 내용:정수, '문자', "문자열"을
		 * 결과로 가지는 것. case는 정수, '문자', "문자열"만 올수있다. ※if문은 조건문.참or거짓으로만 나옴.
		 */

		IfSwitch is = new IfSwitch();
		// int result=is.add(3, 7);//로적고 밑에 반복된변수명을 바꿔도되나 다른방법으로는 바로밑에있는 스위치괄호안에
		// is.add를넣는다

		switch (is.add(3, 7)) {// 위에것을 사용하면 괄호안에 result만 써서 사용가능
		case 1:
			System.out.println("1");
			break;// break가 없으면 스위치문 전체수식을 실행함
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("그 이외");
			break;// 마지막 문에는 break 생략가능
		}

		switch ((int) IfSwitch.add(3.2, 7)) {// 스위치문은 괄호안에 실수를 받을수없음,강제형변환하면 가능함.
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("그 이외");
			break;
		}

		// is.char2()=='a'
		switch (is.char2() + 1) { // =97의2진수//메서드 추가로인한 주소값으로 변경
		case 97:
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default:
			System.out.println("그 이외");
		}

		switch (is.string2()) {// =switch("a"){
		case "a":
			System.out.println("문자열a");
			break;
		case "b":
			System.out.println("문자열b");
			break;
		default:
			System.out.println("그 이외");
		}

		switch ('0') {// 48의2진수
		case 97:
			System.out.println("문자열a");
			break;
		case 'b':
			System.out.println("문자열b");
			break;
		default:
			System.out.println("그 이외");
		}

		switch ("0") {// 문자열 객체안에 "0"값과 무수히 많은 메서드들이 존재
		case "a":
			System.out.println("문자열a");
			break;
		case "b":
			System.out.println("문자열b");
			break;
		default:
			System.out.println("그 이외");
		}

		System.out.println("------성적을 Switch문으로 산출------");

		System.out.println("정수 입력(0~100)->");
		n1 = sc.nextInt();

		switch (n1 / 10) {
		case 10: // System.out.print("A"); break;//같은값을 출력하는경우 생략해도 된다. ☆switch문은 연산후 case별로 출력후
					// break를 만나야 실행종료.
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
		}
		System.out.println("학점");

		System.out.println("------Switch문으로 카페에서 주문하는 상황------");

		System.out.println("주문하시겠습니까?->\n(메뉴:아메리카노, 카페라떼, 카푸치노)중에서 주문");
		String Order = sc.next();// "아메리카노"엔터->버퍼에들어감->버퍼에서 단어를 읽어들여 String객체 생성

		switch (Order) {
		case "아메리카노":
			System.out.println(Order + "3000원입니다.");
			break;
		case "카페라떼":
			System.out.println(Order + "4000원입니다.");
			break;
		case "카푸치노":
			System.out.println(Order + "3500원입니다.");
			break;
		default:
			System.out.println("안팝니다.");
		}

		System.out.println("------DO WHILE문으로 카페에서 주문하는 상황------");//집에서 수정요망
		int i;// main안에 선언한 지역변수 main이 끝나면 사라짐
		System.out.println("주문하시겠습니까?->\n(메뉴:아메리카노, 카페라떼, 카푸치노)중에서 주문,(주문안함 또는 Stop)을 하면 멈춤");
		
		do {Order=sc.next();//"주문안함"
			if (Order.equals("주문안함"))break;
			
			switch (Order) {
			case "아메리카노":
				System.out.println(Order + "3000원입니다.");
				break;
			case "카페라떼":
				System.out.println(Order + "4000원입니다.");
				break;
			case "카푸치노":
				System.out.println(Order + "3500원입니다.");
//			default:System.out.println("메뉴에 없습니다.");//break;생략가능
			}
//			if(Order.equalsIgnoreCase("stop"))break;
		}while(!Order.equalsIgnoreCase("stop"));
		
		System.out.println("------위 상황 반복문------");

		// ★위 상황의 반복문★for(;조건문;)중괄호열고 - 반복구간 - 중괄호닫고//(;조건문;)에서 조건문을 생략하면
		// true(=무한루프(반복)) ex)for(;;)->무한루프,for(i=1;i<10;i++)->10번실행
		i=0;
		for (i = 1; i <= 3; i++) {// for 안에 선언한 지역변수 for이 끝나면 사라짐 //3번만 실행하기

			System.out.println("주문하시겠습니까?->\n(메뉴:아메리카노, 카페라떼, 카푸치노)");
			Order = sc.next();

			switch (Order) {
			case "아메리카노":
				System.out.println(Order + "3000원입니다.");
				break;
			case "카페라떼":
				System.out.println(Order + "4000원입니다.");
				break;
			case "카푸치노":
				System.out.println(Order + "3500원입니다.");
				break;
			default:
				System.out.println("안팝니다.");
			}
		}

		System.out.println("======과제======");
		// ★과제)카페에서 주문을 원하는만큼 '반복'후, 총 주문 출력
		// int i1;//main안에 선언되어 있으므로 같은 변수명을 사용할수없다.그러나 변수값 변경가능.
		int totalcnt, am, cp, cf, totalprice, amprice, cpprice, cfprice;
//		totalcnt=0; am=0; cp=0; cf=0;//초기화, for문에는 괄호안 콤마를찍는것과 같다.

		cafe: for (totalcnt = 0, am = 0, cp = 0, cf = 0, amprice = 0, cpprice = 0, cfprice = 0, totalprice = 0;;) {

			System.out.println("주문하시겠습니까?->\n(메뉴:아메리카노(3000원), 카페라떼(4000원), 카푸치노(3500원), 그만, 안사(=No Order))");
			Order = sc.next();

			if (Order.equals("안사") || Order.equalsIgnoreCase("No Order")) { // equals():대소문자 구분하여 비교,IgnoreCasa=대소문자무시하여
																			// 비교후 같으면 ture
				System.out.println("꺼져");
				break;
			} // 가장 가까운 반복문을 빠져나감(=멈춤)

			switch (Order) {
			case "아메리카노":
				am++;
				amprice += 3000; // am++은 am=am+1과 같다. amprice+=3000은 amprice=amprice+3000과 같다.
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
				totalcnt = am + cp + cf;
				totalprice = amprice + cpprice + cfprice;
				if (am > 0)
					System.out.println("아메리카노" + am + "잔" + amprice + "원,");
				if (cp > 0)
					System.out.println("카페라떼" + cp + "잔" + cpprice + "원,");
				if (cf > 0)
					System.out.println("카푸치노" + cf + "잔" + cfprice + "원,");
				if (am <= 0 && cp <= 0 && cf <= 0)
					System.out.println("꺼져");
				if (totalcnt > 0)
					System.out.println("총" + totalcnt + "잔" + totalprice + "원입니다.");
				break cafe;
			default:
				System.out.println("안팝니다.");
				break;
			}// switch문 종료

			if (Order.equals("그만"))
				break;

		}// for문 종료

		System.out.println("======객체생성======");

		// is는 위에 IfSwitch객체의 주소를 끊고(=참조를 끊고) 새로운 IfSwitch객체의 주소를 받아 참조함.
		// 위의 IfSwitch객체는 쓰레기객체가되어 GC가 자동으로 삭제해줌
		is = new IfSwitch();// static이 없는 메서드 : 생성자로 객체를 생성하여
		int result = is.add(3, 7);// 주소로 접근//위에서 사용한 변수명이기때문에 타입을 없애 변수 재설정 선언하여 사용해도됨.ex)result=is.add(3, 7);
		System.out.println(result);

		double result2 = is.add(1.2, 3);// static이 있는 메서드: 주소로 접근가능하나, 경고가뜸.
		System.out.println(result2);

		result2 = IfSwitch.add(3.7, 2);// static이 있는 메서드 : ★클래스 이름으로 접근 (권장)
		System.out.println(result2);

		sc.close();

	}// 메인문(=main()의 끝=프로그램의 끝)

	// 메서드추가,메서드오버로딩 : 같은 이름의 메서드를 사용할 수 있다. 단, 매개변수의 '수'나'타입'이 달라야함. ★메서드이름은 반드시
	// 소문자로 시작
	int add(int i1, int i2) {// (매개변수는 지역변수=로컬변수이다.) ★반드시 두 정수(이상)를 넣어 추가해야함.//정수값이 int로들어가 연산후 int로 나오므로
								// 메서드앞에 int를 적어야함//이것을 호출하려면 앞에 static을 붙여야 함(static없이 사용하려면 위 설명참고)
		return i1 + i2;// int+int=>int//long타입으로 출력받고싶을때 자동으로 형변환해서 출력받음.(=long add를사용하여)★정수를넣어 연산한것이기
						// 때문에 float이나 double를 사용해 실수로도 받을수 있으나 오차가능성이있다.
	}

	int add(int i1, int i2, int i3) {
		return i1 + i2 + i3;
	}

	static double add(double i1, int i2) {
		return i1 + i2;// double+double(자동형변환)=>double//static을넣어 호출하는데, 위에것 먼저호출하지말고 더블을 사용해 연산결과
						// 출력하고싶을때, 맨위수식(static이 붙은 int수식)에 주석처리한다.
	}

	char char2() {// 빈괄호는 매개값없음,호출 용도
		return 'a';
	}

	String string2() {
		return "a";// string 객체('a'+수많은 메서드들이 존재.)
	}

}// 클래스문
/*******************************************************************************************************/