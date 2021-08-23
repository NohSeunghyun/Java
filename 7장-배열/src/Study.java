import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		
		Scanner Scanner=new Scanner(System.in);
		
		int count=0, n=0;//횟수와 키보드로 입력받을 정수를 표현하기위해 변수선언 및 초기화
		double sum=0;//평균을 구하기위한 변수선언 및 초기화(실수(=소수(=소수점단위))로 표현하기위해 double로 표시)
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		
		while ((n=Scanner.nextInt()) !=0) {//키보드로 입력하는 정수가 변수n에 참조됨
			                       //키보드로 입력하는 수가 0이 아닐때 조건문 실행.==0일시 종료
			sum= sum+n;//평균을 구하기위해 비어있는 sum값에 입력받은 정수를 더함.//0.0+1=>1.0
			          // 계속 입력할수록 기존sum값에 입력받은 정수값이 계속더해짐
			count++;//(정수를 입력한 횟수가 있어야 평균을 구할수있으므로 count값 증가)
		}// while문 종료
		System.out.println("수의 개수는"+count+"개이며,");//단순 횟수표현==count값
		System.out.println("평균은"+sum/count+"이며,");//평균을 구하기위해 입력받은 '수'들의 합(sum값)을
		                                            //수의 갯수(count값)으로 나눈다.
		System.out.println("수의 합은"+sum+"입니다.");//sum=입력한 '수'들의 합
		                                //sum의 타입이 double이기떄문에 실수로 표현됨
		                                      
	}//메인문

}//클래스문
/*******************************************************************************************************/