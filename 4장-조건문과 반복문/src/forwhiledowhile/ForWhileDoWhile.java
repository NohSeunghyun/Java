package forwhiledowhile;

public class ForWhileDoWhile {

	public static void main(String[] args) {
		// 반복문 3가지 정리

		// FOR문
		int i;// 1 2 3 4 5(참) 6(거짓)
		for (i = 1; i <= 5; i++) {// i:카운팅, 실행에도 관련
			System.out.print(i + " ");
		}
		System.out.println();// 커서를 아래로
		System.out.println();
		
		// WHILE문
		i = 1;
		while (i <= 5) {// 조건문 생략 불가
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println();
		
		/*
		 * DO WHILE문 do{~}while(조건문); ★주의:세미콜론 꼭 찍어야함. 참, 거짓에 관계없이 무조건 한번은 실행.
		 */
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);// 2<=5 부터 비교시작
		System.out.println();
		System.out.println();
		
		System.out.println("****반복문을 이용하여 1~10까지 합 구하기****");
		System.out.println();
		
		int hap = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;// 반복문 사용 안했을경우

		System.out.println("반복문 사용안함=" + hap);
		
		System.out.println();
		System.out.println("======반복문 사용======");
		System.out.println();
		
		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		for (i = 1; i <= 10; i++) {
			hap += i;
		} // for문 종료
		System.out.println("<FOR문>1~10까지 더한 합=" + hap);
		System.out.println();

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 1;
		while (i <= 10) {
			hap += i;
			i++;
		}
		System.out.println("<WHILE문>1~10까지 더한 합=" + hap);
		System.out.println();

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 1;
		do {
			hap += i;
			i++;
		} while (i <= 10);// 2=<10부터 비교시작
		System.out.println("<DO WHILE문>1~10까지 더한 합=" + hap);
		System.out.println();

		System.out.println("****FOR문을 사용하여 1+3+5+7+9의 합****");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		for (i = 1; i <= 9; i = i + 2) {// or i+=2
			hap += i;
		} // for문 종료
		System.out.println("1+3+5+7+9의 합=" + hap);
		System.out.println();

		System.out.println("****WHILE문을 사용하여 1+3+5+7+9의 합****");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 1;
		while (i < 10) {// 1~10사이의 홀수 더한합이기 때문에 9로하나 10으로하나 같다.(= i<=9,i<=10)
			hap += i;

			i += 2;// or i=i+2;
		}
		System.out.println("1+3+5+7+9의 합="+ hap);
		System.out.println();

		System.out.println("★★★★문제.1~100사이의 3의 배수(조건)만 더하기★★★★");
		System.out.println();

		System.out.println("======방법1(DO WHILE문 사용)======");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 0;// or i=3;
		do {
			hap += i;

			i += 3;
		} while (i <= 100);
		System.out.println("1~100까지 3의 배수만 더한 합=" + hap);
		System.out.println();

		System.out.println("======방법2(WHILE문 사용)======");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 0;
		while (i < 100) {// 1~100사이의 3의 배수의합이기 때문에 99로하나 100으로하나 같다.(= i<=99,i<=100)
			hap += i;

			i += 3;// or i=i+3;
		}
		System.out.println("1~100까지 3의배수의만 더한 합=" + hap);
		System.out.println();

		System.out.println("======방법3(DO WHILE문 +IF문 사용)======");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 1;// or i=3;
		do {
			if (i % 3 == 0)
				hap += i;
			i++;
		} while (i <= 100);
		System.out.println("1~100까지 3의 배수만 더한 합=" + hap);
		System.out.println();

	}// 메인문

}// 클래스문
/*******************************************************************************************************/