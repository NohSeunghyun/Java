package caltest;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		//calculator 객체생성
		Calculator c=new Calculator();
		//두수와 연산자 (+,-,x,/)입력받아 계산처리한 결과 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("계산기를 실행합니다.");
		while(true) {
			System.out.println("연산할 두 수를 입력하세요.");
			System.out.println("=================================");
			
			System.out.print("첫번째 수를 입력하세요.>");
			String a=sc.next();
				if (a.equals("그만")||a.equalsIgnoreCase("stop")) {
					System.out.println("프로그램을 종료합니다."); 
					break;
				}
			double n1;
			try {
				n1 = Double.parseDouble(a);
			} catch (NumberFormatException e1) {
				System.out.println("수를 잘못 입력 하셨습니다.");
				continue;
			}
			
			System.out.print("두번째 수를 입력하세요.>");
			a=sc.next();
				if (a.equals("그만")||a.equalsIgnoreCase("stop")) {
					System.out.println("프로그램을 종료합니다."); 
					break;
				}
			double n2;
			try {
				n2 = Double.parseDouble(a);
			} catch (NumberFormatException e) {
				System.out.println("수를 잘못 입력 하셨습니다.");
				continue;
			}
			
			System.out.print("연산자(+,-,x,/)를 입력하세요.>");
			String opr=sc.next();
				if (opr.equals("그만")||opr.equalsIgnoreCase("stop")) {
					System.out.println("프로그램을 종료합니다."); 
					break;
				}
			switch(opr.toUpperCase()) {
			case "+" : c.add(n1, n2); break;
			case "-" : c.sub(n1, n2); break;
			case "X" : c.mul(n1, n2); break;
			case "/" : c.div(n1, n2); break;
			default : System.out.println("연산자를 잘못 입력하셨습니다.");
			}//switch문 종료
		}//while문 종료
		c.showOperatingTimes();
		
	}//메인문

}//클래스문
/*******************************************************************************************************/