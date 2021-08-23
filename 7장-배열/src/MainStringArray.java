import java.util.Scanner;

public class MainStringArray {		
	
	/*
	 * 1.멤버변수
	 * 2.기본생성자 - 
	 * 3.메서드
	 */
	
	//JVM이 main()을 호출할 때 length가 0인 String[]배열객체를 생성하여 호출함.
	public static void main(String[] args) {
		
		if (args.length !=4) {//0 != 4
			System.out.println("실행할 때 4개의 숫자를 입력해주세요.(정수2개, 실수2개)");
			return;//해당 메서드(=main) 종료 -> 프로그램의 종료
//			System.exit(0);//프로그램 강제종료.//return대신쓸수있음
		}// if문 종료
		
		String s1=args[0];//문자열 "10" "'1''0'+무수히 많은 메서드들"
		String s2=args[1];
		String s3=args[2];
		String s4=args[3];
		
		int i1=Integer.parseInt(s1);//"10"->10
		int i2=Integer.parseInt(s2);//"20"->20
		
		double d3=Double.parseDouble(s3);//"1.23"->1.23
		double d4=Double.parseDouble(s4);//"2.3"->2.3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.연산자(+, -, *, /)를 입력하세요.\n=>");
		String opr=sc.next();
		
		switch(opr) {
		case "+" : System.out.println(d3+"+"+d4+"="+add(d3,d4));break;//(=add(d3+d4))//메인문 밖에 객체 선언을 안했을경우 이렇게사용.
		case "-" : System.out.println(d3+"-"+d4+"="+sub(d3,d4));break;//(=add(d3-d4))
		case "*" : System.out.println(d3+"*"+d4+"="+multi(d3,d4));break;//(=add(d3*d4))
		case "/" : System.out.println(d3+"/"+d4+"="+div(d3,d4));break;//(=add(d3/d4))
		default : System.out.println("잘못된 연산자 입니다.");
		}//switch문 종료
		
		System.out.print("2.연산자(+, -, *, /)를 입력하세요.\n=>");
		opr=sc.next();
		
		switch(opr) {
		case "+" : add(i1,i2);break;//System.out.println(i1+"+"+i2+"="+add(i1,i2));break;
		case "-" : sub(i1,i2);break;//System.out.println(i1+"-"+i2+"="+sub(i1,i2));break;
		case "*" : multi(i1,i2);break;//System.out.println(i1+"*"+i2+"="+multi(i1,i2));break;
		case "/" : div(i1,i2);break;//System.out.println(i1+"/"+i2+"="+div(i1,i2));break;
		default : System.out.println("잘못된 연산자 입니다.");
		}//switch문 종료
		
//		System.out.println("10+20=");//System.out.println(add(10,20))//돌려받는 값이 없으면 호출한 측에서 출력 불가능
//		add(10,20);//반한되는 값으로 더이상 실행하지 않을 때
//		
//		MainStringArray msa=new MainStringArray();
//		double result = add(1.23, 2.3)+100;//double result = msa.add(1.23, 2.3)+100;//선언 앞에 static을 붙였기때문에 객체주소로 접근하여 참조시킬 필요가 없다.
//		System.out.println("1.23+2.3="+result);
//		
	}//메인문
	
	//메서드 오버로딩
	
	static void add(int i1, int i2){
		System.out.println(i1+"+"+i2+"="+(i1+i2));
	}//add문 종료
	
	static void sub(int i1, int i2){
		System.out.println(i1+"-"+i2+"="+(i1-i2));
	}//add문 종료
	
	static void multi(int i1, int i2){
		System.out.println(i1+"*"+i2+"="+(i1*i2));
	}//add문 종료
	
	static void div(int i1, int i2){
		System.out.println(i1+"/"+i2+"="+(i1/i2));
	}//add문 종료
	
	//			  (int num1, int nim2)
//	static void add(int i1, int i2){//앞에 static을 붙이면 바로사용가능.//static앞에 void가 붙어있으면 돌려주지 않아 위의 스위치문이 실행이 안됨//해결방법 : 이 문구를 바꾸고 위의 스위치문 변경
//		int result=num1+num2;
//		System.out.println(i1+"+"+i2+"="+(i1+i2));//System.out.println(result);//결과가 출력
//		return;//맨 마지막에 있을때 필요없다.
//	}//add문 종료
	
	static double add(double d1, double d2){//앞에 static을 안붙이면 객체 안에 존재
		return d1+d2;
	}//add문 종료
	
	static double sub(double d1, double d2){
		return d1-d2;
	}//add문 종료
	
	static double multi(double d1, double d2){
		return d1*d2;
	}//add문 종료
	
	static double div(double d1, double d2){
		return d1/d2;
	}//add문 종료
	
//	  (int num1, int nim2)
//	static void add(int i1, int i2){//앞에 static을 붙이면 바로사용가능.//static앞에 void가 붙어있으면 돌려주지 않아 위의 스위치문이 실행이 안됨//해결방법 : 이 문구를 바꾸고 위의 스위치문 변경
	//int result=num1+num2;
//	System.out.println(i1+"+"+i2+"="+(i1+i2));//System.out.println(result);//결과가 출력
	//return;//맨 마지막에 있을때 필요없다.
//	}//add문 종료      //위에서부터 add를 찾아 실행하는데 타입이 다르기 때문에 내가 사용하고자 하는것에 합당한것(int타입을 사용하면 int타입)을 찾아 첫번째 것을 호출함.

}//클래스문
/*******************************************************************************************************/