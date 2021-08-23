package forex;

import java.util.Arrays;
import java.util.Scanner;

public class BasicFor {// 이름을 잘못적었을경우 패키지에서 f2를사용해 이름을 바꿔야함.
	// public class BasicFor() {super();}

	public static void main(String[] args) {

		System.out.println("======반복문을 사용안함======");
		System.out.println("오늘도 최선을...");
		System.out.println("오늘도 최선을...");
		System.out.println("오늘도 최선을...");
		System.out.println("오늘도 최선을...");
		System.out.println("오늘도 최선을...");

		/*
		 * '일정한' 규칙성이 있어야 '반복문'을 사용할 수 있다.
		 */

		System.out.println("======반복문을 사용함======");
		int i;
		// i=1 2 3 4 5 (참)=>실행 i=6 (거짓)=>끝
		for (i = 1; i <= 5; i++) {// 5번만 반복
			System.out.println("오늘도 최선을...");
		}

		System.out.println();// 구분을위한빈줄
		for (i = 10; i <= 14; i++) {// 5번만 반복
			System.out.println("오늘도 최선을...");
		}
		System.out.println();
		for (i = 1; i >= -3; i--) {// 5번만 반복
			System.out.println("오늘도 최선을...");
		}

		System.out.println();
		for (i = 1; i <= 9; i += 2) {// 5번만 반복//i=i+2(=i+=2)
			System.out.println("오늘도 최선을...");
		}

		/** 반복문을 사용안하면 **/

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		/*
		 * 반드시 '일정한 규칙성'이 있어야 반복문을 사용할 수 있다.
		 */

		System.out.println("======일정한 규칙성======");

		for (i = 1; i <= 5; i++) {// i:카운팅, 반복하는 실행문에도 사용
			System.out.println(i);
		}
		System.out.println();

		for (i = 0; i <= 4; i++) {// i:카운팅, 반복하는 실행문에도 사용
			System.out.println(i + 1);
		}
		System.out.println();

		/** 반복문을 사용안하면 **/
		int hap = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		System.out.println(hap);// 55

		hap = 0;// 반드시 0으로 초기화
		for (i = 1; i <= 10; i++) {
			hap = hap + i;// 0+1+2+3+4+5...+10(참) +11(거짓)->for문 빠져나옴//hap=hap+i;(= hap+=i;)
		}
		System.out.println(hap);// 55

		/** 1~입력받은 정수까지 더한 결과 **/

		Scanner sc = new Scanner(System.in);

		System.out.print("1부터 입력받은 정수까지 1씩 더한 결과를 구합니다. 마지막 정수 입력>");
		int lastnum = sc.nextInt();

		hap = 0;

		for (i = 1; i <= lastnum; i++) {
			hap += i;
		}
		System.out.println("1부터 " + lastnum + "까지 1씩 더한 결과=" + hap);

		/** firstnum(시작값)~lastnum(끝값)까지 더한 결과 **/

		System.out.println("시작값(정수) 입력>");
		int firstnum = sc.nextInt();

		System.out.println("끝값(시작값보다 크거나 같은 정수) 입력>");
		lastnum = sc.nextInt();

		hap = 0;

		for (i = firstnum; i <= lastnum; i++) {
			hap += i;
		}
		System.out.println(firstnum + "부터 " + lastnum + "까지 1씩 더한 결과=" + hap);

		/** firstnum(시작값)~lastnum(끝값)까지 increnum(증가값)씩 증가한 수를 더한 결과 **/

		System.out.println("시작값(정수) 입력>");
		firstnum = sc.nextInt();

		System.out.println("끝값(시작값보다 크거나 같은 정수) 입력>");
		lastnum = sc.nextInt();

		System.out.println("증가값(정수 단,0제외) 입력>");
		int increnum = sc.nextInt();

		hap = 0;

		for (i = firstnum; i <= lastnum; i += increnum) {
			hap += i;// hap=hap+i
		}
		System.out.println(firstnum + "부터 " + lastnum + "까지 " + increnum + "씩 더한 결과 =" + hap);

		/** 구구단 중 5단만 출력 **/

		// 반복문 사용안함
		System.out.println("5 X " + 1 + " = " + (5 * 1));
		System.out.println("5 X " + 2 + " = " + (5 * 2));
		System.out.println("5 X " + 3 + " = " + (5 * 3));
		System.out.println("5 X " + 4 + " = " + (5 * 4));
		System.out.println("5 X " + 5 + " = " + (5 * 5));
		System.out.println("5 X " + 6 + " = " + (5 * 6));
		System.out.println("5 X " + 7 + " = " + (5 * 7));
		System.out.println("5 X " + 8 + " = " + (5 * 8));
		System.out.println("5 X " + 9 + " = " + (5 * 9));

		System.out.println();// 구분 위한 빈줄

		// 반복문 사용
		for (i = 1; i <= 9; i++) {
			System.out.println("5 X " + i + " = " + (5 * i));
		}

		System.out.println();// 구분 위한 빈줄

		/** 키보드로 입력받은 단 출력 **/

		System.out.println("출력할 단을 입력:");

		int dan = sc.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan * i));
		}

		/** 초기화 여러개, 증감식 여러개 가능 **/
		System.out.println("-------------");
		int k;
		for (i = 1, k = 10; k >= 1; i++, k--) {// 10번 반복하기=>(;i<=10;)or(;k>=1;)
			System.out.println(i + "X" + k + "=" + (i * k));
		}//for문 종료
		
	}// 메인문

}// 클래스문
/*******************************************************************************************************/