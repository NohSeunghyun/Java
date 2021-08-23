package math;

import static java.lang.Math.*;//java.lang.Math.일일히 치기 힘들기때문에 임폴트해준다.
import static math.Math.multi;//math패키지의 Math클래스의 multi메서드만 가져옴
public class MathMain {

	public static void main(String[] args) {
		
//		Math m=new Math();//클래스 생성 후 아무것도 안적어도 객체생성됨//기본생성자 생성을 막아버려서 오류가남.
//		System.out.println(m);//Math클래스 생성 후 아무것도 안적어도 객체생성됨.//기본생성자 생성을 막아버려서 오류가남.
		
//		System.out.println("반0지름이 3인 원넓이"+m.circleArea(3));//Math클래스에 반지름메서드 넣고 반지름이 3인 원넓이구하기
		
		System.out.println("반지름이 3인 원넓이="+Math.circleArea(3));
		System.out.println("반지름이 3인 원둘레="+Math.circleLength(3));
		System.out.println("정수:10+20="+Math.add(10, 20));
		System.out.println("실수:0.12+0.88888="+Math.add(0.12, 0.88888));
		//가변인수를 이용해 더한 메서드
		System.out.println("10="+Math.add(10));
		System.out.println("10+20="+Math.add(10, 20));
		System.out.println("10+20+30="+Math.add(10, 20, 30));
		System.out.println("10+20+30+40+50="+Math.add(10, 20, 30, 40, 50));
		//가변인수를 이용해 곱한 메서드
		System.out.println("10="+multi(10));
		System.out.println("10*20="+multi(10,20));
		System.out.println("10*20*30="+multi(10, 20, 30));
		System.out.println("10*20*30*40*50="+multi(10, 20, 30, 40, 50));
		
		
		//자바에서 제공받은 Math 클래스를 사용하고 싶으면 컨트롤+스페이스바 해서 java.lang<<제공받은 Math클래스
		
//		Math.//하지만 제공받은 클래스를 사용하고 싶어도 같은 이름의 클래스가 있을 경우 같은 패키지안의 클래스를 우선으로 사용할수있게 해주어 오류가남.
		
		//사용하고싶다면
//		java.lang.Math. <<로 사용해야함 .뒤에는 사용하고자 하는 메서드 입력//구체적으로 java의lang패키지속Math클래스를 사용한다고 입력해야함.
		
		System.out.println("-3의 절대치="+java.lang.Math.abs(-3));
		System.out.println("2와 8 중 큰 수="+java.lang.Math.max(2, 8));//쓸때마다 자바.랭.매쓰 쓰기힘들면 맨위 클래스문 밖에 임폴트 해준다.
		
		//java.lang.Math.생략하고난 후 쓰기
		System.out.println("2와 8 중 큰 수="+max(2, 8));
		
	}//메인문

}//클래스문
/*******************************************************************************************************/