package fruit2;

public class Saller {
	
	//1.멤버변수
	
	//간판이름(판매자명)//판매자 여럿을 특징하기위해
	final String name;
	//사과수
	private int numofApple;//구매자가 알수 없기 때문에 private를 붙여 정보보안.
	//가진돈
	private int money;//구매자가 알수 없기 때문에 private를 붙여 정보보안.//원금+수익금
	private int firstmoney;//원금
	//사과가격
	final int APPLE_PRICE;
	
	//2.생성자
	
	public Saller(String name, int numofApple, int money, int aPPLE_PRICE) {
		super();
		this.numofApple = numofApple;
		this.money = money;
		firstmoney = money;//동일한 이름이 아니기때문에 this.생략가능
		APPLE_PRICE = aPPLE_PRICE;
		this.name = name ;
	}
	
	//3.메서드
	
	void answer() {
		System.out.println(APPLE_PRICE+"원 입니다");
	}
	
//	int getNumofApple() {
//		return numofApple;
//	}//구매자 메서드에 출력되게하기
	
	void getNumofApple() {
		System.out.println(numofApple+"개 남았습니다.");//판매자 메서드에 출력되게함
	}

	int getAPPLE_PRICE() {
		return APPLE_PRICE;
	}

	int sale(int money) {
		int n=money/APPLE_PRICE;
		this.money+=money;
		numofApple-=n;
		return n;
	}
	
	void showSale() {
		System.out.println("------["+name+"]현황------");
		System.out.println("판매 후 남은 사과 : " + this.numofApple); 
		System.out.println("판매자가 가진 기존 돈(원금) : " + firstmoney); 
		System.out.println("판매자의 수익 : " + (money-firstmoney));
		System.out.println("판매자가 가진 전체 돈 : "+ money);
	}
	
}//클래스문
/*******************************************************************************************************/