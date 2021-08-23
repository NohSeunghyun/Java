/*
 * 저장->컴파일러가 컴파일하면 2진수로된'바이트코드'가만들어짐
 * 컴파일러가 컴파일하기전에 자동으로 삽입
 */
//import java.lang.*;자동으로삽입
public class UseVariable {

	public static void main(String[] args) {// 프로그램의 시작

		// 변수란 변하는값을 표현할수있다

		boolean b = true;// 자료형 변수명 = 리터럴(값);
		System.out.println(b);

		if (b)
			System.out.println("참이면 실행");
		else
			System.out.println("거짓이면 실행");

		b = false;
		System.out.println(b);

		if (b)
			System.out.println("참이면 실행");
		else
			System.out.println("거짓이면 실행");

		if (85 < 70)
			System.out.println("참");
		else
			System.out.println("거짓");

		if (85 > 70)
			System.out.println("참");
		else
			System.out.println("거짓");

		// if (조건이 참/거짓)

		/*
		 * 논리형은 boolean으로 표기 참(true) 또는 거짓(false)만 사용
		 */

		// 자료형-정수,실수,문자,문자열

		System.out.println("------------정수-----------");

		/*
		 * 정수의 표현방식는 네가지 byte=1byte short=2byte int=4byte->현재 주로사용하는 방식 long=8byte
		 */

		byte b1;// 변수선언
		b1 = 7;// 초기화
		System.out.println(b1);
		System.out.println(b1 + 10);
		System.out.println(b1 + (2 + 5));

		int b2;
		b2 = 700;
		System.out.println(b2);
		System.out.println(b2 + 10);
		System.out.println(b2 + (2 + 5));

		short s = 10;// 변수 선언과 동시에 초기화

		// 자료형 변수명=리터럴, 리터럴(이름없는메모리에 저장): 정수(int형인 4바이트), 실수(double 8바이트)

		int c = 10;

		long i = 10000000000L;// L:리터럴값4바이트->8바이트로 변환 (값이 너무 클 경우 뒤에L을 붙여야함,안붙여도 될 경우있음)

		long l = 30;

		System.out.println(c);
		System.out.println(i);
		System.out.println(l);

		System.out.println("-----------정수연산-----------");

		short s1 = 12, s2 = 7;
//		short s2=7; 컨트롤+슬러쉬=주석처리
//		short s3=s1+s2; 할경우 오류, 이유:쇼트는 2바이트, 연산하는 cpu는 4바이트 연산결과 출력시문제발생 해결방법:쇼트대신 인트로 대체,쇼트형변환(문제점:데이터손실)
//		                형변화할때 short s3=(short) (s1+s2); 로 괄호 넣어야함
		short s3 = (short) (s1 + s2);

		short ss1 = 12, ss2 = 7;
		int ss3 = ss1 + ss2;

		System.out.println(s3);
		System.out.println(ss3);// 19.정확한결과나옴, 의미없는 0이있는 2바이트를 버림

		System.out.println("-------------실수-------------");

		/*
		 * 정수와 실수(소수점단위)의 표현방식은 다르다 실수의 표현방식 두가지 float=4byte double=8byte->주로사용
		 */

		double d = 10;// 정수->실수(정수->실수로 자동변환)(10->10.0)
		i = (long) 10.3;// 실수->정수(10.3실수->강제로 10으로 형변환)(데이터 손실 발생가능성 있음)
		float e = 10.37f;// f=리터럴값8바이트->4바이트로 변환(실수명령어 float를사용하면 무조건뒤에f)

		System.out.println(d);
		System.out.println(i);
		System.out.println(e);

		System.out.println("-----------실수연산-----------");// 정확한 연산결과가 안나올수 있음(오차발생가능성)

		double d1 = 0.0000001;
		System.out.println(d1);// 1.0E-7 ->1.0*10-7승
		double d2 = 0.0000001;
		System.out.println(d2);
		System.out.println(d1 + d2);

		double dd1 = 0.0000001;
		double dd2 = 1.0000001;
		System.out.println(dd1 + dd2);

		System.out.println("-------정수->실수 자동형변환------");
		int aaa = 3;
		double bbb = aaa;
		System.out.println(bbb);

		System.out.println("------실수->정수 강제형변환(데이터손실발생가능성있음)------");
		int ccc = (int) 10.33;
		System.out.println(ccc);
		byte a1 = 3;
		byte a2 = 7;
		byte a3 = (byte) (a1 + a2);// 수식앞에 byte안붙일시, 연산데이터가 4바이트(int)이므로 byte에안들어감.해결:수식앞에 byte를붙이거나 명령어를
									// int나long으로 해준다.

		if (d + e < 10)
			System.out.println("ㅋ");
		else
			System.out.println("ㅎ");

		if (d + e > 10)
			System.out.println("ㅋ");
		else
			System.out.println("ㅎ");

		System.out.println("---------문자(아스키코드(c언어)나 유니코드(java)를참조)---------");

		char c1;
		c1 = 'a';// 97의 2진'수'
		char c2 = 'b', c3 = 'c', c4 = ' ';// c2,c3: 98,99의 2진'수'

		System.out.println(c1 + c2 + c3 + c4);// 메모리 안에는 '수'로 존재, 더한결과가 출력
		System.out.println(c1 + "" + c2 + "" + c3 + "" + c4);// ""+문자열 연결하는 연산
		System.out.println(c1 + "" + c2 + "" + c4 + "" + c3);
		System.out.println(c1 + "," + c2 + "," + c4 + "," + c3);
		System.out.println((int) c1 + "," + (int) c2 + "," + (int) c4 + "," + (int) c3);// 문자의 각 코드값

		char c6 = 'A';// 65의 2진수

		System.out.println(c6 + "," + c1);// 문자그대로출력
		System.out.println((int) c6 + "," + (int) c1);// A의정수출력
		System.out.println(c6 + 1);// 변수값의 정수에 +1
		System.out.println((char) (c6 + 1));// 66의 문자출력
		System.out.println("----------------");
		System.out.println('B');
		System.out.println((int) 'B');
		System.out.println(66);
		System.out.println((char) 66);

		int i2 = 97;// 97의2진수

		System.out.println(i2);// 정수명령어사용해서 정수로출력
		System.out.println(c1);// 문자명령어사용해서 문자로출력

		System.out.println((char) i2);// 정수->문자 형변환출력
		System.out.println((int) c1);// 문자->정수 형변환출력

		// 아스키코드 0-127, 유니코드 0-65,535 까지의 정수와 문자값 1:1대입

		char c5 = '가';
		System.out.println(c5);
		System.out.println((int) c5);
		System.out.println("-------------------");
		System.out.println('A' + 32);// 65+32=>97
		System.out.println((char) 'A' + 32);// 97의 문자
		System.out.println("-------------------");
		System.out.println('B' + 32);// 98
		System.out.println((char) 'B' + 32);// 대문자와 소문자의 2진수차이는 32

		c1 = 'a';
		c1 = (char) (c1 - 32);// 결과가 int타입(4바이트) 문자결과는 2바이트.수식앞에 char을 넣어 강제형변환
		System.out.println(c1);//

		short i3 = 127, i4 = 160;// 아스키코드 160부터 다시출력?뭐지
		int i5 = i3 + i4;
		System.out.println(i5);
		System.out.println((char) i5);
		System.out.println((char) i3 + "," + (char) i4 + "," + (char) i5);

		System.out.println("---------------유니코드------------");
		char cc1 = '가';
		System.out.println(cc1);
		cc1 = '\uAC00';// \\u:유니코드
		System.out.println(cc1);
		System.out.println("문자열 그대로.단 \tㄹㄹ\n\n..");// (역슬러쉬)t:탭크기만큼 띄어쓰기(역슬러쉬)n:다음줄 *역슬러쉬는 주석에서도 주석처리가안됨.

//		int ii5=AC00;변수=정수(10진수)라서 실행X해결법은
		int ii5 = 0xac00;// 0x:16진수
		System.out.println(ii5);// 44032 10진수로 출력.
		System.out.println((char) ii5);

		System.out.printf("%d %x %o \n", ii5, ii5, ii5);// f:format(서식을 뜻함)%d:10진수%x(%hex):16진수 %o(%octal):8진수
		System.out.printf("10진수=%d,\t16진수=%x,\t8진수=%o \n", ii5, ii5, ii5);
		System.out.printf("%c %d %c \n", cc1, (int) cc1, cc1);
		String s4 = "문자열2 \n";// 문자열을값으로변형
		System.out.printf("%s,.,.%s", "문자열 \n", s4);// %s(%string):문자열그대로
		double dd3 = 37.77;
		System.out.printf("%f %f \n", 12.34, dd3);
		System.out.printf("%f \n", 12.34);

		System.out.println(i5);// 10진수
		System.out.println(cc1);// 가
		System.out.println(s4);// 문자열2
		// i5의정수(10)을 2진수로 출력하는방법.소문자로시작~():메서드(=함수)기능
		i5 = 10;
		System.out.println(Integer.toBinaryString(i5));
		System.out.println(Integer.toBinaryString(37));
		System.out.println(Integer.toBinaryString(324));
		// 0B:2진수 0x:16진수 0:8진수 로 변경
		int i6 = 0B1010;
		System.out.println("2진수1010을10진수로출력=" + i6);

		i6 = 1010;
		System.out.println("10진수1010을10진수로출력=" + i6);

		i6 = 0x1010;
		System.out.println("16진수1010을10진수로출력=" + i6);

		i6 = 01010;
		System.out.println("8진수1010을10진수로출력=" + i6);

		// 문자:JAVA(2바이트사용)-유니코드사용
		// 교재 68p
		double num1 = 1.2;
		float num2 = 0.9f;

//		int num3=num1+num2;정수는int파일 실수 double파일에 들어가연산,8바이트(1.2)+8바이트(0.9)*자동형변환*->8바이트(2.1)이나 4바이트인 int에 출력불가.
//		형변환후 출력.
		int num3 = (int) (num1 + num2);// 강제형변환,데이터손실발생
		System.out.println(num3);
//		double num3= num1+num2;8바이트인 double로출력하면 데이터손실없이 출력가능
		double num3a = num1 + num2;
		System.out.println(num3a);// 자동형변환,오차발생.

	}// 메인문(=프로그램의 끝)

}// 클래스문
/*******************************************************************************************************/