import java.util.Arrays;
import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {

		// ★★★★★ 배열 공부많이하기.

		// ==과제== 키보드로 부터 정수를 입력받아 sco1이 참조하는 배열객체에 저장 후 합계와 평균을 구하시오.

		Scanner sc = new Scanner(System.in);

		System.out.println("======For문 사용======");

		int[] sco1 = null;// 배열 대입선언//length값 null//=>sco1이라는 변수명을가지고 참조하는 배열객체는 없는 배열을 생성
		int num;// ->스캐너로 입력하여 입력값을 넣을수있는 변수를 생성.
		System.out.print("배열 크기를 입력하세요\n=>");
		num = sc.nextInt();// ->스캐너로 입력값을 넣어 변수에 참조.
		sco1 = new int[num];// ->입력값을 얻은 변수를 참조값이 없는 배열객체에 넣어 배열생성.
							// =>(인덱스값)3을넣을시 0인덱스:[0]1인덱스:[0]2인덱스:[0]이생성.입력값이 length값.(마지막 index값+1(=마지막인덱스값을 구하려면 length()-1하면됨))

		int sum = 0;// ->구해야할 공식 합,평균 두가지중 하나인 합의 변수 선언.정수이기때문에 int타입.
		int i;// ->반복문을 돌리기위한 변수선언.length값과 비교하기위해 생성.
		for (i = 0; i < num; i++) {
			System.out.print("값을 입력하세요\n=>");
			sco1[i] = sc.nextInt();
			sum = sum + sco1[i];// (=sum+=sco1[i];)
		} // For문 종료
		System.out.println(Arrays.toString(sco1));// 배열객체에 참조된 인덱스값에 들어가있는 값 확인
		System.out.println("합=" + sum);
		System.out.println("평균=" + (double) sum / num);

		System.out.println("======While문 사용======");

		sco1 = null;
		num = 0;

		System.out.print("배열 크기를 입력하세요\n=>");

		num = sc.nextInt();
		sco1 = new int[num];

		sum = 0;
		i = 0;
		while (i < num) {
			System.out.print("값을 입력하세요\n=>");
			sco1[i] = sc.nextInt();
			sum = sum + sco1[i];
			i++;
		} // While문 종료
		System.out.println(Arrays.toString(sco1));
		System.out.println("합=" + sum);
		System.out.println("평균=" + (double) sum / num);

		System.out.println("======Do While문 사용======");

		sco1 = null;
		num = 0;

		System.out.print("배열 크기를 입력하세요\n=>");

		num = sc.nextInt();
		sco1 = new int[num];

		sum = 0;
		i = 0;
		do {
			System.out.print("값을 입력하세요\n=>");
			sco1[i] = sc.nextInt();
			sum = sum + sco1[i];
			i++;
		} while (i < num); // Do While문 종료
		System.out.println(Arrays.toString(sco1));
		System.out.println("합=" + sum);
		System.out.println("평균=" + (double) sum / num);
		
		System.out.println("======length 사용======");
		
		int[] sco2 = null;
		System.out.print("배열 크기를 입력하세요\n=>");
		num=sc.nextInt();
//		sco2 = new int[sc.nextInt()];//변수지정안하고 바로 입력값을 참조시킬수 있음.
		sco2=new int[num];//3을 입력시 [0,0,0]이들어있다.
		
		sum = 0;
		//for (i = 0;1<num; i++)//아래 1<sco2.length와 같음.
		for (i = 0;i<sco2.length; i++) {//sco2 = new int[sc.nextInt()];이것을 위에 사용하면 사용불가. 변수명에 참조시키지 않았기때문
			System.out.print((i+1)+"번째 정수입력\n=>");
			sco2[i] = sc.nextInt();
			sum = sum + sco2[i];//sum+=sco2[i]와같다.//입력받은 값을 합계에 누적.
		} // for문 종료
		System.out.println("합=" + sum);
		System.out.println("평균=" + (double)sum /sco2.length);
		
		System.out.println("======length 사용2======");
		
		sco2 = null;
		System.out.print("배열 크기를 입력하세요\n=>");
		num=sc.nextInt();
		sco2 = new int[sc.nextInt()];
		
		sum = 0;
		for (i = 0;i<num; i++) {
			System.out.print((i+1)+"번째 정수입력\n=>");
			sco2[i] = sc.nextInt();
			sum = sum + sco2[i];
		} // for문 종료
		System.out.println("합=" + sum);
		System.out.println("평균=" + (double)sum /sco2.length);
		
	}// 메인문

}// 클래스문
/*******************************************************************************************************/