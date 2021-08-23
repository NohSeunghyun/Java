package fruit2;

public class Buyer {
	
	//1.멤버변수
	
	//가진돈
	private int money;//잔액
	private int firstmoney;//원금
	//사과바구니
	private int numofApple;//현재 가지고 있는 사과수
	private int firstnumofApple;//원래 가지고 있던 사과수
	
	//2.생성자
	
	public Buyer(int money, int numofApple) {
		super();
		this.money = money;
		firstmoney = money;
		this.numofApple = numofApple;
		firstnumofApple = numofApple;
	}
	
	//3.메서드
	
	void askApplePrice(Saller s) {
		System.out.println("["+s.name+"]"+"사과 1개 가격이 얼마인가요?");
		s.answer();
	}
	
	void askNumofApple(Saller s) {
		System.out.println("["+s.name+"]"+"사과 몇개가 남았나요?");
//		System.out.println(s.getNumofApple()+"개 남았습니다.");//판매자에 get 메서드 추가 후 구매자 메서드에서 출력되게 할수있고
		s.getNumofApple();//메서드만 불러온다//판매자측에서 출력되게함.
	}
	void buy(Saller s,int money) {
		numofApple += s.sale(money);
		this.money -= money;
	}
	
	int getMoney() {
		return money;
	}

	void showBuy() {
		System.out.println("------구매자 현황------");
		System.out.println("처음 가진 사과 수 : " + firstnumofApple);
		System.out.println("구매한 사과 수 : " + java.lang.Math.abs(numofApple-firstnumofApple));
		System.out.println("현재 가진 사과 수 : " + numofApple);
		System.out.println("구매자가 처음 가진 돈 : " + firstmoney);
		System.out.println("구매자가 사과를 산 돈 : " + (firstmoney-money));
		System.out.println("현재 잔액 : " + money);
	}
	
}//클래스문
/*******************************************************************************************************/