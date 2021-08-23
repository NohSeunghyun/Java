/*
 * 상속?
 * 기존의 클래스를 재사용하여 새로운 클래스를 작성
 * 코드의 재사용성을 높이고 코드의 중복을 제거하여
 * 프로그램의 생산성과 유지보수에 크게 기여
 * 
 * 상속의 방법
 * 1.부모-자식 (예)포유류는 사람이다.(X) 사람(자식=자손)은 포유류(부모=조상=슈퍼클래스)다.(O)
 * 2.클래스 간의 포함 관계 (에) ~은 ~을 가지고 있다. 예)계산기(public)는 더하기기능(클래스를 만들고 계산기클래스에 멤버변수로)을 가지고 있다.
 */

package cal;

class Add{//더하기
	
	//멤버변수
	
	private int cntAdd;//메서드가 호출될 때 마다 1씩 증가.//그냥 재미로 넣어본것
	
	//기본생성자
	
	//카운트를 출력하기위한 메서드
	int getCntAdd() {
		return cntAdd;
	}
	
	//실질적인 기능(메서드)
	int add(int n1,int n2){
		cntAdd++;
		return n1+n2;
	}//정수

	double add(double n1,double n2){
		cntAdd++;
		return n1+n2;
	}//실수
}
class Sub{//빼기
	
	//멤버변수
	
	private int cntSub;//메서드가 호출될 때 마다 1씩 증가.//그냥 재미로 넣어본것
	
	//기본생성자
	
	//카운트를 출력하기위한 메서드
	int getCntSub() {
		return cntSub;
	}

	//실질적인 기능(메서드)
	int sub(int n1,int n2){
		cntSub++;
		return n1-n2;
	}//정수
	
	double sub(double n1,double n2){
		cntSub++;
		return n1-n2;
	}//실수
}
class Mul{//곱하기
	
	//멤버변수
	
	private int cntMul;//메서드가 호출될 때 마다 1씩 증가.//그냥 재미로 넣어본것
	
	//기본생성자
	
	//카운트를 출력하기위한 메서드
	int getCntMul() {
		return cntMul;
	}

	//실질적인 기능(메서드)
	int mul(int n1,int n2){
		cntMul++;
		return n1*n2;
	}//정수
	
	double mul(double n1,double n2){
		cntMul++;
		return n1*n2;
	}//실수
}
class Div{//나누기
	
	//멤버변수
	
	private int cntDiv;//메서드가 호출될 때 마다 1씩 증가.//그냥 재미로 넣어본것
	
	//기본생성자
	
	//카운트를 출력하기위한 메서드
	int getCntDiv() {
		return cntDiv;
	}

	//실질적인 기능(메서드)
	double div(int n1,int n2){
		cntDiv++;
		return (double)n1/n2;//=10/3=3.3333
	}//정수
	
	double div(double n1,double n2){
		cntDiv++;
		return n1/n2;
	}//실수
}

/*
 * 하나의 파일에 여러 클래스를 설계할 때 
 * public은 반드시 1개의 클래스에만 붙일 수 있다. 
 * 파일이름=public 붙인 클래스이름.
 * 
 * 만약 Main()클래스가 같이있다면?
 * public은 무조건 Main()클래스에만 붙일 수 있다.
 * 파일이름=Main()클래스 이름
 */

public class Calculator {
	
	//[포함관계 만드는 순서] 1.멤버변수로 선언
	private Add a;//3.외부에서 접근 불가=>캡슐화=정보보안
	private Sub s;
	private Mul m;
	private Div d;
	
	//2.생성자 생성
	
	public Calculator() {//1).계산기 생성자를 호출할 때 매개변수를 없앤다.(=매개변수가 없는 계산기 생성자 호출)
		super();//2).부모객체를 생성한다.
		a = new Add();//3).Add생성자를 호출시켜 멤버변수에 참조시킨다.(=더하기부품 생성)//아래 생성자 동일.
		s = new Sub();//빼기부품 생성
		m = new Mul();//곱하기 부품 생성
		d = new Div();//나누기 부품 생성
	}//4).최종적으로 계산기 객체 생성.
	
	//4.메서드생성(=외부에 노출된 버튼에 기능 생성)(+,-,*,/ 4가지. 정수,실수를 받을수 있어야하므로 더블로만 만듦)->정수타입으로 만든 메서드는 주석처리.
	
//	public int add(int n1, int n2) {
//		return a.add(n1, n2);//사용자에게 값을 돌려줄 때.//이걸 사용시 값을 받아 다른작업 가능.
////		System.out.println(a.add(n1, n2));//메서드에서 값을 바로 출력할 때 이때, 메서드타입에 void를적어야함.//이걸 사용시 여기서 연산종료.
//	}
//	
//	public int sub(int n1, int n2) {
//		return s.sub(n1, n2);
//	}
//	
//	public int mul(int n1, int n2) {
//		return m.mul(n1, n2);
//	}
//	
//	public double div(int n1, int n2) {//div는 div클래스에서 double타입으로 하였기때문에 타입을 double로 한다.
//		return d.div(n1, n2);
//	}
	
	public double add(double n1, double n2) {
		return a.add(n1, n2);
	}
	
	public double sub(double n1, double n2) {
		return s.sub(n1, n2);
	}
	
	public double mul(double n1, double n2) {
		return m.mul(n1, n2);
	}
	
	public double div(double n1, double n2) {
		return d.div(n1, n2);
	}
	
	//실행횟수를 출력해주는 메서드 추가(재미로)
	//카운트를 private 했기때문에 간접접근으로 값을 얻어와야 하기때문에 get메서드추가.
	
	void showOperatingTimes(){
		if (a.getCntAdd() > 0) System.out.println("덧셈횟수:"+a.getCntAdd());
		if (s.getCntSub() > 0) System.out.println("뺄셈횟수:"+s.getCntSub());
		if (m.getCntMul() > 0) System.out.println("곱셈횟수:"+m.getCntMul());
		if (d.getCntDiv() > 0) System.out.println("나누기횟수:"+d.getCntDiv());
	}
	
}//클래스문
/*******************************************************************************************************/