package fruit;

public class Buyer {
	//1.멤버변수
	
	int money;//돈
	
	int numofApple;//사과바구니(=사과수)

	//2.생성자
	
	public Buyer(int money) {
		super();
		this.money = money;
		//this.numofApple = numofApple;//사과 바구니는 기본값 0으로 채워짐
	}
	
	//3.메서드 : 구매자가 주체
	
	void buy(Saller s,int money) {//판매자가 여러명이 될 수 있기때문에 판매자, 구매할 돈//판매자1,구매금액 
		numofApple += s.sale(money);//판매자에게 돈을주고 받은사과를 사과바구니에 참조.
		this.money -= money;//구매자의 돈(=가지고있는 돈)에서 구매한 돈 만큼 빼기
	}
	
	void showBuy() {
		System.out.println("------구매자 현황------");
		System.out.println("구매한 사과 수 : " + numofApple);
		System.out.println("현재 잔액 : " + money);
	}
	
}//클래스문
/*******************************************************************************************************/