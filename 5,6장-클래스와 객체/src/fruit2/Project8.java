package fruit2;

import java.util.Scanner;

public class Project8 {

	public static void main(String[] args) {
		
		//과제
		//입력받은 정수만큼 구매.
		//무한 반복. 잔액이0원이거나,stop,그만입력시 종료
		//0개 입력시 재주문
		//(-값)입력시 구매자가 판매자에게 판매하는 이상한 현상이 나타남. (-값)입력시 재주문
		//소수점(실수), 문자 입력시 오류 안띄우고 재주문
		
		//구매자 생성 원금20000원,사과10개 가지고있음
		Buyer b1=new Buyer(20000, 10);
		
		//판매자1 생성 간판"판매자1", 사과100개, 원금1300원, 판매가격1000원
		Saller s1=new Saller("판매자1", 100, 1300, 1000);
		
		Scanner sc = new Scanner(System.in);
		
		
		if (b1.getMoney() >= s1.getAPPLE_PRICE()) {

			System.out.println("===================================");
			System.out.println("구매자가 가진 돈은"+b1.getMoney()+"입니다.");
			System.out.println(s1.name+"의 사과1개 가격은"+s1.getAPPLE_PRICE()+"입니다.");
			System.out.println(b1.getMoney()/s1.getAPPLE_PRICE()+"개 살 수 있습니다.");
			System.out.println("===================================");
			
			int a=0;
			while(true) { //=for(;;)
					if (b1.getMoney()==0) break;
					System.out.print("구매할 사과 수 입력 :");
					String num=sc.next();
						if (num.equalsIgnoreCase("stop") || num.equals("그만")) break;
						int b=0;
						try {
							b=Integer.parseInt(num);
						} catch (NumberFormatException e) {
							System.out.println("※다시 주문하세요");
							System.out.println("-----------------------------------");
							continue;
						}//문자나 실수 입력시 재주문
						if (Integer.parseInt(num)<=0) {
							System.out.println("※다시 주문하세요");
							System.out.println("-----------------------------------");
							continue;
							}//if문 종료 : (-값)이나 0개 입력시 재주문
						if (b1.getMoney()>=s1.getAPPLE_PRICE()*Integer.parseInt(num)) {
							b1.buy(s1, s1.getAPPLE_PRICE()*Integer.parseInt(num)) ;
							a+=Integer.parseInt(num);
							System.out.println("※사과 "+num+"개 구매하여 총 "+a+"개를 구매하였습니다.");
							if (b1.getMoney()==0)
							continue;//잔액0원 일 때 아래 실행문 실행할필요 없으니 뛰어넘기
							System.out.println("※잔액 "+b1.getMoney()+"원 남았습니다."+b1.getMoney()/s1.getAPPLE_PRICE()+"개 더 살 수 있습니다.");
							System.out.println("-----------------------------------");
							continue;
							}//if문 종료 : 사과구매
					System.out.println("※구매자의 잔액이 부족하여 사과를 살 수 없습니다.");
					System.out.println("※"+b1.getMoney()/s1.getAPPLE_PRICE()+"개 살 수 있습니다.");
					System.out.println("-----------------------------------");
			}//while문 종료
		}//if문 종료
		else System.out.println("구매자의 잔액이 부족하여 사과를 살 수 없습니다.");

		System.out.println("===================================");
		b1.showBuy();//구매자의 현황
		s1.showSale();//판매자1의 현황
		
	}//메인문

}//클래스문
/*******************************************************************************************************/