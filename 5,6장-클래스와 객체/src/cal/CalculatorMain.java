package cal;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//계산기 생성
		
		Calculator cal=new Calculator();
		
//		System.out.println("더하기"+cal.add(10, 3));
//		System.out.println("빼기"+cal.sub(10, 3));
//		System.out.println("곱하기"+cal.mul(10, 3));
//		System.out.println("나누기"+cal.div(10, 3));
//		
//		cal.showOperatingTimes(); //아래 문제를 위해 주석처리
		
		//문제
		//1.스캐너로 정수입력받아 연산
		//2.연산자도 입력받아 연산자에 해당되는 연산.
		//3.반복문을 통한 무한루프
		//4.무한루프 종료 명령어
		
		Scanner sc=new Scanner(System.in);
		
		/*
		 * switch():()안에 들어갈 수 있는 내용 - 정수/문자/문자열을 결과로 가질수 있는것.
		 * case 정수/'문자'/"문자열" 상수만 가능
		 */
		while(true) {
			System.out.println("계산할 두 정수를 입력하시오.");
			System.out.print("첫번째 정수 입력:");
			String tmp=sc.next();
			if (tmp.equals("그만")||tmp.equalsIgnoreCase("stop")) {
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
			
			double n1;
			try {//예외가 발생할 가능성이 있는부분 드래그->마우스우클릭->둘러싸기 머시기(=surround with)->try/catch 블럭생성
				n1 = Double.parseDouble(tmp);//예외가 발생할 가능성이 있는부분을 추측해서 넣어야함.
//				System.out.println("실수로 변환");//이 실행문을 무조건 실행해야하는 상황일 때 이 위치에 넣으면 a나 ㅁ(예외객체)을 넣을경우 실행하지않고 캐치문으로 내려감.
			} 
			catch (NumberFormatException e) {
				System.out.println("잘못 입력 하셨습니다.");
				continue;//무조건 반복문 안에서만 사용.컨티뉴를 만나면 아래실행문을 실행하지않고 반복문 처음으로 올라간다.
			}//"ㅁ"이나"a"를 넣을 경우 오류가나기 때문에 예외처리를 해준다.
//			finally {//예외 발생 여부에 관계없이 무조건 실행시켜줌
//				System.out.println("실수로 변환");
//			}
			
			System.out.print("두번째 정수 입력:");
			tmp=sc.next();
			if (tmp.equals("그만")||tmp.equalsIgnoreCase("stop")) {
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
			
			double n2;
			try {
				n2 = Double.parseDouble(tmp);
			} catch (NumberFormatException e) {
				System.out.println("잘못 입력 하셨습니다.");
				continue;
			} finally {
//				System.out.println("실수로 변환");
			}
			
			System.out.print("연산자(+ - X /)를 입력:");
			String opr=sc.next();
			if (opr.equals("그만")||opr.equalsIgnoreCase("stop")) {
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
			switch (opr.toUpperCase()) {//toUpperCase() : 대문자로 변경
			case "+" : System.out.println(n1+"+"+n2+"="+cal.add(n1, n2)); break;
			case "-" : System.out.println(n1+"-"+n2+"="+cal.sub(n1, n2)); break;
			case "X" : System.out.println(n1+"X"+n2+"="+cal.mul(n1, n2)); break;
			case "/" : System.out.println(n1+"/"+n2+"="+cal.div(n1, n2)); break;
			default : System.out.println("잘못된 연산자 입니다."); 
			}//switch문 종료
		}//while문 종료
		cal.showOperatingTimes();
		
	}//메인문

}//클래스문
/*******************************************************************************************************/