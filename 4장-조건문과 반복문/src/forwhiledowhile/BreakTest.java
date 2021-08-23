package forwhiledowhile;

public class BreakTest {

	public static void main(String[] args) {
		/*
		 * 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지?(초과) 알아보기 이상 : 크거나같다 , 이하: 작거나같다 초과 : 크다 ,
		 * 미만: 작다
		 */

		System.out.println("for문 사용");
		int i, hap = 0;
		for (i = 1;; i++) {// ;true;넣어도 되고 생략해도 됨
			hap += i;// 0+1+2...+14=105.
			if (hap > 100)
				break;// +14=105로되어 멈춤.
		} // for문 종료
		System.out.println(i + "," + hap);// i=14 hap=105

		System.out.println("while문 사용");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 0;// i=1(한번더 실행한 것을 한번더 실행하지 않도록 수정하기)
		while (true) {
			// if (hap>100)break;//(0+0)<=최초의 i=0,+hap=hap+0이기때문에 0+0>+1,2+...+14=105//결과는
			// 같음.
			i++;// 1
			// if (hap>100)break;//결과가 i=15, hap=105로 나옴. 헷갈리지말기. 수식순서에따른 결과 잘 생각해보고 계산.
			hap += i;// 1<i++이후 연산되기 때문에 hap=hap+1이기 때문에 1+로 시작>+2+...+14=105 //hap+=i;는 hap=hap+i와
						// 같다.
			if (hap > 100)
				break;
		}
		System.out.println(i + "," + hap);

		System.out.println("do while문 사용");

		hap = 0;// ★반드시 0으로 초기화,위에서 사용했던것이 누적되어있기때문
		i = 0;//
		do {// do 문은 무조건 1번은 실행함.
			if (hap > 100)
				break;// ★do while의 경우 무조건 한번은 실행하기때문에 만약 조건에 부합해 브레이크가 걸리려면 위에 넣어둬야 효율적.
			i++;
			// if (hap>100)break;//★다른 위치들과 결과 다름,i=15가 나옴. 헷갈리지말기
			hap += i;
			// if (hap > 100)break;
		} while (true);// ★주의 : ;꼭찍어야함.
		System.out.println(i + "," + hap);

	}// 메인문

}// 클래스문
/*******************************************************************************************************/