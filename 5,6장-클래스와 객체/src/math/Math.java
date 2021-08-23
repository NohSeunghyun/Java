/*
 * [static 메서드가 되는 조건]
 * 조건 : 메서드()가 static 이 없는 멤버변수(=instance변수)를 필요로 하지 않고
 * 		"static 멤버변수 또는 매개변수"를 필요로 한다.
 * 조건을 만족하면 static을 붙일 수 있다.
 * 
 * static 멤버변수나 메서드는 해당 클래스가 메모리에 로딩될 때 메모리에 올라와 있음.
 */

package math;

public class Math {
	
	//1.멤버변수=필드:속성
	
	public static final double PI=3.14;
	
	//2.클래스만 생성해도 기본생성자 존재하므로 객체생성가능
	//기본생성자 public Math () {super();}
	
	private Math() {super();}//외부에서 생성자에 접근을 못하게하여 객체생성하는것을 원천적으로 차단
	
	//3.메서드
	
	public static double circleArea(int r){
		//원의 넓이=반지름*반지름*3.141592.....(=PI)
		return r*r*PI;
	}
	
	public static double circleLength(int r){
		//원의 둘레=2*반지름*3.141592.....(=PI)
		return 2*r*PI;
	}
	
	//두 정수를 매개값으로 받아 합을 리턴
	
	public static int add(int a,int b){
		return a+b;
	}

	//두 실수를 매개값으로 받아 합을 리턴
	
	public static double add(double a,double b){
		return a+b;
	}
	
	//★★...가변인수★★:매개변수가 수없이 많아지더라도 연산가능.//여러 매개값들을 "배열"로 생성해서 처리. ☆☆(인수=매개변수=argument)(매개값=인자)
	
	//합
	
	public static int add(int...a){//(10,20,30,40,50)->[10,20,30,40,50] length==5
		int i, hap=0;
		
		/* 일반for문
		 for(i=0;i<a.length;i++) {
			hap+=a[i];
		}//for문 종료 
		*/
		
		//향상된 for문으로 : 배열의 값을 참조. 변경 불가(이유?index를 사용하지 않으므로)
		for(int item:a) {
			hap+=item;
		}//for문 종료
		return hap;
	}
	
	//곱
	
	public static double multi(double...a){
		int i, gop=1;
		
		/* 일반for문
		for(i=0;i<a.length;i++) {
			gop*=a[i];
		}//for문 종료
		*/
		
		//향상된 for문으로
		for(double item:a) {
			gop*=item;
		}//for문 종료
		return gop;
	}
	
	
}//클래스문
/*******************************************************************************************************/