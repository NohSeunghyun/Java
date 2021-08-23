/*
 * 클래스는 두가지
 * 1.라이브러리용:main()없음
 * 2.실행용:main()있음
 */
package third;

public class OperationExample {

	public static void main(String[] args) {// 프로그램시작

		System.out.println("------산술연산자------");

		/*
		 * 산술연산자 + - * 나누기(/몫or%나머지)
		 */

		int iv1 = 10;
		int iv2 = 3;
		System.out.println(iv1 + iv2);
		System.out.println(iv1 - iv2);
		System.out.println(iv1 * iv2);
		System.out.println(iv1 / iv2);// 몫을구함
		System.out.println(iv1 % iv2);// 나머지를구함

		double iv1a = 10;// 정수인 int로 나머지를 구하면 3.3333333'''이 안나오고 정수로만 표기.실수로 표현하기위해 실수로바꿔준다.(나누고자하는값들중
							// 아무거나 하나라도 바꿔도됨)
							// 실수 1.0/자동으로 실수3.0->3.33333333'''or 연산식 앞에 실수를
							// 붙여준다(강제형변환)=>System.out.println((double)iv1%iv2);

		System.out.println(iv1a / iv2);// or
		System.out.println((double) iv1 / iv2);// ->16자리까지표기.더정확.
		System.out.println((float) iv1 / iv2);// ->8자리까지표기.

		System.out.println("-------강제 형변환-------");

		/*
		 * 강제로 형변환하면 데이터 손실 발생가능성 있음 =>데이터 손실이 발생하기전 점검
		 */

		byte b = (byte) 123456789;// 강제 형변환

		System.out.println(b + "(데이터손실)");

		System.out.println("-------byte최대,최소값------");

		byte b1 = 127;// 최소값-128~최대값127 (최대값+1=최소값) (최소값-1=최대값)//하지만 int타입이므로 128,-129가 나오므로 강제로
						// byte형변환하여 표현해야함.
		System.out.println(b1 + 1);// 정수연산결과는 int타입이므로 128표현가능.(*byte는127까지표현가능하나)
		System.out.println((byte) (b1 + 1));// 연산타입이int이므로 연산결과도 int타입으로 나온다.그래서 앞에 (byte)를 안붙이면 128이되므로
											// 강제형변환하면-128이나옴.수식에 괄호 꼭붙여야함
		byte b2 = -128;
		System.out.println((byte) (b2 - 1));// 연산타입이int이므로 연산결과도int타입으로나옴,앞에byte를붙여 강제형변환하면 128이나옴

		// 중요!!변수값은 개인연산자로 지정하지않는이상 바뀌지않는다.(=말그대로 연산값으로 변수값이 변하지않음.혼동주의)

		/*
		 * 조건이 될 수 있는 조건 : 결과가 참 또는 거짓 if(조건){참이면 실행;} 한줄만 사용할때는 중괄호 생략가능.두줄이상일땐 반드시 사용
		 * else {거짓이면 실행;}
		 */

		System.out.println("------비교(=관계)연산자------");

		/*
		 * 비교(=관계)연산자 : 수와 수를 비교 크다:>, 작다:<, 크거나같다:>=, 작거나같다:<=, 같다:==, 같지않다:!= 65>97 =>
		 * 결과가 false (수와 수비교) 'A'(65의2진수)<'a'(97의2진수) => 결과가 true (문자와 문자비교(=문자를 표현하는
		 * 2진수를 비교하는것임.))
		 */

		if (65 > 97)
			System.out.println("65");
		else
			System.out.println("97");

		if (65 < 97)
			System.out.println("65");
		else
			System.out.println("97");

		if ('A' < 'a')
			System.out.println("A");
		else
			System.out.println("a");

		if ('A' > 'a')
			System.out.println("A");
		else
			System.out.println("a");

		System.out.println("-----데이터손실 발생전점검-------");

		// 데이터손실 발생전 점검하는방법

		int i = 128;
		System.out.println(i);
		System.out.println((byte) i + "(데이터손실발생)");

		// 방법-1
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없음");
			System.out.println("값을 다시 확인해 주세요");
		} else
			System.out.println((byte) i);

		// 방법-2
		if (!(i >= Byte.MIN_VALUE) || !(i <= Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환할 수 없음");
			System.out.println("값을 다시 확인해 주세요");
		} else
			System.out.println((byte) i);

		// 방법-3
		if (!(i < Byte.MIN_VALUE) && !(i > Byte.MAX_VALUE))
			System.out.println((byte) i);
		else {
			System.out.println("byte타입으로 변환할 수 없음");
			System.out.println("값을 다시 확인해 주세요");
		}

		// 방법-4
		if (i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE)
			System.out.println((byte) i);
		else {
			System.out.println("byte타입으로 변환할 수 없음");
			System.out.println("값을 다시 확인해 주세요");
		}

		/*
		 * 논리 연산자 : !(not) &&(and) ||(or) ! true=>false, ! false=>true true&&true=>둘다
		 * true일때만 결과가 true true||true=>둘중 하나만 true이면 결과가 true
		 * 
		 * 따라서 비교연산자와 논리연산자는 결과가 참 또는 거짓이므로 조건문에 많이사용.
		 */

		System.out.println("------논리연산자------");

		// 사이버머시기

		int i1 = 10, i2 = 2;// 밑수식 정상결과값은 i1=20,i2=4이나,컴파일러가 진행하다가 &&부호 앞이 거짓으로 판명날경우, 뒤에수식을 진행하지않기때문에 뒷수식이
							// 적용되지않아 i2=2가됨
		boolean value = (i1 = i1 + 10) < 10 && (i2 = i2 + 2) < 10;// 20<10 거짓 and 실행안함=>무조건거짓
		System.out.println("이지스78p의value=" + value);// 거짓
		System.out.println("이지스78p의i1=" + i1);// 20
		System.out.println("이지스78p의i2=" + i2);// 2

		i1 = 10;
		i2 = 2;
		value = (i1 = i1 + 10) > 10 || (i2 = i2 + 2) < 10;// 20>10 참 or 실행안함=>무조건참
		System.out.println("이지스78p의value=" + value);// 참
		System.out.println("이지스78p의i1=" + i1);// 20
		System.out.println("이지스78p의i2=" + i2);// 2

		System.out.println("-----해결방안-----");// 뒷수식을 참,거짓판명전 먼저실행.

		i1 = 10;
		i2 = 2;
		i2 = i2 + 2;// =i2+=2<-복합대행연산자
		value = (i1 = i1 + 10) < 10 && i2 < 10;
		System.out.println("이지스78p의value=" + value);// 거짓
		System.out.println("이지스78p의i1=" + i1);// 20
		System.out.println("이지스78p의i2=" + i2);// 4

		i1 = 10;
		i2 = 2;
		i2 += 2;
		value = (i1 = i1 + 10) < 10 || i2 < 10;
		System.out.println("이지스78p의value=" + value);// 참
		System.out.println("이지스78p의i1=" + i1);// 20
		System.out.println("이지스78p의i2=" + i2);// 4

		System.out.println("------형변환-----");

		// 자동형변환 주의사항 : 정수가 실수로 자동형변환시

		int num1 = 123;
		int num2 = 123;
		int num4 = 123456780;
		int num5 = 123456780;

		float num3 = num2;
		num2 = (int) num3;

		float num6 = num5;// 정수->실수 자동형변환 대입.float사용하면 오차발생가능성.double로 사용.
		num5 = (int) num6;

		System.out.println(num1 - num2);
		System.out.println(num4 - num5);

		System.out.println("------자료형값의 사이클------");

		// 자료형의 값이 사이클을 돈다. 최대값+1=최소값

		byte b3 = 127;// 대입연사자를 통해서만 변수의값이 바뀐다.
		System.out.println(b3 + 1);// 변수값+1,최소값으로 안바뀜;
		System.out.println(b3);// 변수값

		System.out.println("------단항연산자------");

		System.out.println(++b3);// 단항연산자++:자신의값을 1증가,--:1감소
		System.out.println(b3);// ++안에 대입연산자가 포함되어있어 변수값이 바뀜.주의!!

		System.out.println("-----단항연산자 단독일때-----");

		/*
		 * 단항연산자 : ++b3(변수명) : b3=b3+1(변수명=변수값+1이란 수식이 들어있음.대입연산자) ++단독일 때는 1증가.(위치 변수명
		 * 앞뒤 상관X)
		 */

		int a1 = 10, a2 = 20, a3;
		System.out.println(a1 + "," + a2);
		a1++;
		++a2;
		System.out.println(a1 + "," + a2);
		System.out.println(++a1 + "," + a2++);// 가독성이안좋음.*12,21출력 후 a2+1(22)
		System.out.println((++a1) + "," + (a2++));// 가독성좋게하기.
		System.out.println(a1 + "," + a2);

		System.out.println("------단항연산자 단독이 아닐떄------");

		/*
		 * ++단독이 아닐때. ++앞에있으면:가장먼저, 뒤에있으면:마지막에
		 */

		a1 = 10;
		a2 = 20;
		a3 = ++a1 + a2++;
		System.out.println(a3);// a1 10->a1 11, 11+20->a3(31) 마지막에 a2 21
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = ++a1 + a2--;
		System.out.println(a3);// a1 10->a1 11, 11+20->a3(31) 마지막에 a2 19
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = ++a1 + ++a2;
		System.out.println(a3);// a1 10->a1 11, a2 20->a2 21, a3 32
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = ++a1 + --a2;
		System.out.println(a3);// a1 10->a1 11, a2 20->a2 19, a3 30
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = a1++ + a2++;
		System.out.println(a3);//
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = a1++ + a2--;
		System.out.println(a3);//
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = a1-- + a2++;
		System.out.println(a3);//
		System.out.println(a1 + "," + a2 + "," + a3);

		a1 = 10;
		a2 = 20;
		a3 = a1-- + a2--;
		System.out.println(a3);//
		System.out.println(a1 + "," + a2 + "," + a3);

		System.out.println("-----단항연산자 부호------");// -1,0,+1*부호(+,-)도 연산자다.

		int n1 = 5;

		System.out.println(+n1);
		System.out.println(-n1);

		short n2 = 7;
		short n3 = (short) +n2;// 변수명=리터럴(값),변수,메서드*정수(int)->short 강제형변환or int,long사용
		System.out.println(n3);

		System.out.println("-----복합대입연산자-----");

		// 복합대입연산자

		i = 1;
		i++;// i=i(=1(변수지정값))+1;i값은2
		System.out.println(i);

		i += 1;// i=2+1;복합대입연산자.i값은 3
		System.out.println(i);
		i += 3;// i=3+3;i값은 6
		System.out.println(i);
		i -= 3;// i=6-3;i값은3
		System.out.println(i);
		i *= 2;// i=3*2;i값은6
		System.out.println(i);
		i /= 2;// i=6/2;i값은3
		System.out.println(i);
		i %= 2;// i=3%2;i값은1
		System.out.println(i);

		System.out.println("------비트연산------");

		/*
		 * 단항연산자 : !, ++, --, ~ 논리연산자 : ! : 참<->거짓, && : 둘다 참이면 참, || : 둘중 하나만 참이면 참
		 * 비트연산자(2진수연산) : 1.~ : ~1 => not1(=0) ~0=> not0(=1) ex)~10010110=>01101001 2.&
		 * : 1&1 => 앤드중심으로 양쪽결과값이 1일경우면 1 3.| : 1|1 => or중심으로 양쪽결과값이 둘중 하나만 1이면 1 4.^ :
		 * 1^0=>둘 다 다르면 1 1^1=>0 0^1=>1 비트연산자 인데 산술연산이 가능 << : 곱하기, >> : 나누기(몫)
		 */

		int nu1 = 5;
		int nu2 = 3;

		System.out.println(Integer.toBinaryString(nu1));// 정수의2진수값 00000000 00000000 00000000 00000101 의미없는 0 생략->0101
		System.out.println(Integer.toBinaryString(nu2));// 00000000 00000000 00000000 00000011->0011

		System.out.println(nu1 & nu2);// 둘다 1일경우 1->0001
		System.out.println("5&3=" + (nu1 & nu2));// 0001
		System.out.println("5|3=" + (nu1 | nu2));// 0111
		System.out.println("5^3=" + (nu1 ^ nu2));// 0110

		System.out.println("~5=" + ~nu1);// ~0101->1010
		System.out.println("~5+1=" + (~nu1 + 1));// 중요!not(정수)+1=-(정수)
		System.out.println(~7 + 1);
		System.out.println(~99 + 1);

		System.out.println("--------비트이동연산자---------");

		// 비트이동연산자 : <<:곱하기2, >>:나누기2의몫 //연산속도가 빨라 사용

		System.out.println(3 << 1);// 3*2(=3을2비트왼쪽으로이동(빈부분은0으로채움))//0011->0110
		System.out.println(3 << 2);// 3*2*2//1100
		System.out.println(3 << 3);// 3*2*2*2//00011000
		System.out.println(3 << 4);// 3*2*2*2*2//00110000

		System.out.println(16 >> 1);// 3/2(=16을 1비트 오른쪽으로 이동(빈부분을 부호비트로채움(양수는0,음수는1)))//10000->01000
		System.out.println(16 >> 2);// 3/2/2//00100

		System.out.println("--------조건연산자-------");

		// 음수(0보다작다)를 양수로 바꾸기

		int x = 10, y = -5, z = 0;

		// 방법-1(if문 사용)
		if (x >= 0)
			x = x;
		else
			x = -x;// 만약 x의변수값이 음수일경우,-(-10)=>10.<<-음수를 양수로 바꾸기
		if (y >= 0)
			y = y;
		else
			y = -y;
		if (z >= 0)
			z = z;
		else
			z = -z;
		System.out.println(x + "," + y + "," + z);

		// 방법-2(조건연산자 사용)//괄호안에 조건문을넣어 ?(물음) 참일경우: 거짓일경우;

		x = 10;
		y = -5;
		z = 0;// 기존의 변수값에 새로운 변수값을 넣을때는 ,(콤마) 쓰지말고 ;(세미콜론)을 써야함 클래스타입은 지정되어있어 안써도됨

		x = (x >= 0) ? x : -x;
		y = (y >= 0) ? y : -y;
		z = (z >= 0) ? z : -z;
		System.out.println(x + "," + y + "," + z);

	}// 메인문(=프로그램의 끝)

}// 클래스문
/*******************************************************************************************************/