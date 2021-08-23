import java.util.Arrays;
import java.util.Scanner;

public class Project5_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Project5 입력한 횟수만큼 자동으로 배열객체 저장무한루프(마음껏 값 입력)후 명령어(0) 입력시 연산.
		
		System.out.println("======Do While문 사용======");

		int[] sco1 = null;//빈 배열객체 생성
		int num = 0;//변수 num 생성//입력하는 정수만큼 인덱스값에 참조
		int count=1;//변수 count 생성//length 증가목적
		int sum = 0;//변수 sum 생성//합을 내기위한 변수
		double i = 0;//변수 i 생성//평균을 메기기위한 변수
		do {System.out.print("값을 입력하세요\n=>");
			sco1=new int [count];
			sco1[num] = sc.nextInt();
			if (sco1[num]==0)break;
			sum += sco1[num];
			num++;
			count++;
			i++;
		} while (true); // Do While문 종료
		System.out.println(Arrays.toString(sco1));//반복문에서 length값이 증가하면서 
											//기존에있던 length값을 덮어씌우면서 기존에있던 값들이 계속사라짐.0만나옴;;
											//배열객체에 저장안됨;
		System.out.println("합=" + sum);
		System.out.println("평균=" + sum/i);

		System.out.println("======For문 사용======");
		
//		int[] sco1 = null;//결국 마지막에 연산종료를위해 0을입력하면 sco1의 length값이 0이되기때문에
//		                   //저장되어있던 객체들이 없음.
//		                    //밑의 식이 실행되는것은 배열객체에 저장하는것이 아닌 단순연산;ㅠ
//		int count=1;
//		int num;
//		int sum = 0;
//		int i=0;
//		while (((sco1[count]=(num=sc.nextInt()))!=0)) {
//			System.out.print("값을 입력하세요.입력 후 0을 입력하시면 연산합니다.\n=>");
//			i++;
//			sco1=new int [count];
//			count++;
////			else sco1 = new int[num];//아닐시 num값을 인덱스 int타입으로바꿔 sco1(인덱스)값에 참조.
//								//있으나마나인 수식.
//			sum += sco1[count];
//			System.out.println(Arrays.toString(sco1));//배열객체에 저장되는지 확인
//		} // for문 종료
////		System.out.println(sco1[num]);//배열객체에 참조된 값확인해보기. 연산실행시키려면 0을입력해야하므로 다사라짐.
//										//다른정수를 입력해도 배열객체에 저장되는것이 아닌
//											//덮어씌우기때문에 안됨
////		sco1=new int[num];
//	
//		System.out.println("합=" + sum);
//		System.out.println("평균=" + sum / i);

	}// 메인문

}// 클래스문
/*******************************************************************************************************/