package random_math;

public class MathExample {

	public static void main(String[] args) {
		
		//ABS : 절대값
		
		System.out.println("======ABS======");
		
		int v1 = Math.abs(-5);// |-5| =5
		double v2 = Math.abs(-3.14);// |3.14| =3.14
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		//CEIL : 보다 큰 정수를 Double형으로 변환
		
		System.out.println("======CEIL======");
		
		System.out.println(Math.ceil(5.3));//5.3보다 큰 정수(6)를 Double형으로 돌려줌->6.0
		System.out.println(Math.ceil(-5.3));//-5.3보다 큰 정수(-5)를 Double형으로 돌려줌->-5.0
		
		//FLOOR : 보다 작은 정수를 Double형으로 변환
		
		System.out.println("======FLOOR======");
		
		System.out.println(Math.floor(5.3));//5.3보다 작은 정수(5)를 Double형으로 돌려줌->5.0
		System.out.println(Math.floor(-5.3));//-5.3보다 작은 정수(-6)를 Double형으로 돌려줌->-6.0
		
		//RINT : 가까운 정수의 실수값
		
		System.out.println("======RINT======");
		
		System.out.println(Math.rint(5.3));//가까운정수 (5)를 double형으로 돌려줌->5.0
		System.out.println(Math.rint(5.7));//가까운정수 (6)를 double형으로 돌려줌->6.0
		
		//ROUND : 반올림
		
		System.out.println("======ROUND======");
		
		System.out.println(Math.round(5.3));//5.3의 반올림->5
		System.out.println(Math.round(5.7));//5.7의 반올림->6
		
		//MAX : 최대값
		
		System.out.println("======MAX======");
		
		System.out.println(Math.max(5, 9));
		System.out.println(Math.max(5.3, 2.9));
		
		//MIN : 최소값
		
		System.out.println("======MIN======");
		
		System.out.println(Math.min(5, 9));
		System.out.println(Math.min(5.3, 2.9));
		
		//난수 생성 : 0.0 <= Math.random() < 1.0
		
		System.out.println("======RANDOM======");
		
		System.out.println(Math.random());
		
		//-1.88~110 난수생성 //(int)(Math.random()*(끝값-시작값+1))+시작값
		
		System.out.println("======88~110사이 난수생성======");
		
		System.out.println((int)(Math.random()*(110-88+1))+88);

	}//메인문

}//클래스문
/*******************************************************************************************************/