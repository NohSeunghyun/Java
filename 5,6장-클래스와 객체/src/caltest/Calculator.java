package caltest;

class Add{//+
	//실질적 기능
	private int cntAdd;
	int add(int n1, int n2) {
		cntAdd++;
		return n1+n2;
		
	}
	double add(double n1, double n2) {
		cntAdd++;
		return n1+n2;
	}
	public int getCntAdd() {
		return cntAdd;
	}
}//add클래스문

class Sub{
	//실질적 기능
	private int cntSub;
	int sub(int n1, int n2) {
		cntSub++;
		return n1-n2;
	}
	double sub(double n1, double n2) {
		cntSub++;
		return n1-n2;
	}
	public int getCntSub() {
		return cntSub;
	}
}//sub클래스문

class Mul{
	//실질적 기능
	private int cntMul;
	int mul(int n1, int n2) {
		cntMul++;
		return n1*n2;
	}
	double mul(double n1, double n2) {
		cntMul++;
		return n1*n2;
	}
	public int getCntMul() {
		return cntMul;
	}
}//mul클래스문

class Div{
	//실질적 기능
	private int cntDiv;
	double div(int n1, int n2) {
		cntDiv++;
		return (double)n1/n2;
	}
	double div(double n1, double n2) {
		cntDiv++;
		return n1/n2;
	}
	public int getCntDiv() {
		return cntDiv;
	}
}//div클래스문

public class Calculator {
	//포함관계-> 캡슐화
	
	private Add a;
	private Sub s;
	private Mul m;
	private Div d;
	
	//생성자
	
	public Calculator() {
		super();
		a=new Add();
		s=new Sub();
		m=new Mul();
		d=new Div();
	}
	
	//메서드-외부에 노출된 버튼
	
	void add(double n1, double n2) {//결과를출력
		System.out.println(n1+"+"+n2+"="+a.add(n1, n2));
	}

	void sub(double n1, double n2) {
		System.out.println(n1+"-"+n2+"="+s.sub(n1, n2));
	}
	
	void mul(double n1, double n2) {
		System.out.println(n1+"X"+n2+"="+m.mul(n1, n2));
	}
	
	void div(double n1, double n2) {
		System.out.println(n1+"/"+n2+"="+d.div(n1, n2));
	}

	void showOperatingTimes() {//실행횟수 출력
		if(a.getCntAdd() > 0) System.out.println("더하기횟수:"+a.getCntAdd());
		if(s.getCntSub() > 0) System.out.println("빼기횟수:"+s.getCntSub());
		if(m.getCntMul() > 0) System.out.println("곱하기횟수:"+m.getCntMul());
		if(d.getCntDiv() > 0) System.out.println("나누기횟수:"+d.getCntDiv());
	}
	
}//클래스문
/*******************************************************************************************************/