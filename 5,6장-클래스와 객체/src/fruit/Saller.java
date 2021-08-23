package fruit;

public class Saller {
	
	//1.멤버변수
	
	int numofApple;//사과수
	
	int money;//돈
	
	int APPLE_PRICE;//사과가격

	//2.생성자
	
	public Saller(int numofApple, int money, int aPPLE_PRICE) {
		super();
		this.numofApple = numofApple;
		this.money = money;
		APPLE_PRICE = aPPLE_PRICE;
	}
	
	//3.메서드
	
	int sale(int money) {
		int n=money/APPLE_PRICE;// 돈/사과가격의 몫=사과개수 를 n에참조
		numofApple -= n;//원래의 사과수-판매하는 사과개수
		this.money += money;//원래 가지고 있던 돈+판매한 사과값//원래가지고있던 돈=멤버변수고 받는돈은 매개변수이므로 this.을 붙여 구분해야함. 
		return n;
	}
	
	void showSale( ){
		System.out.println("------판매자 현황------");
		System.out.println("판매 후 남은 사과 : " + this.numofApple);//멤버변수를 확인해야 하므로this.붙임. 생략해도 상관없음. 
		System.out.println("판매자가 가진 전체 돈 : " + money);
	}
	
}//클래스문
/*******************************************************************************************************/