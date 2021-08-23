import java.util.Scanner;

public class Project5_2 {

	public static void main(String[] args) {// 미완성

		Scanner sc = new Scanner(System.in);

		// Project5 무한루프(마음껏 값 입력)후 명령어(정수가 아닌 단어) 입력시 연산.//4장 CafeOrder참조

		String s = sc.next();
		int num;
		int sum = 0;

		int count = 0;
		int i;
		for (i = 0; i < count; i++) {
			System.out.print("값을 입력하세요\n=>");
			num = sc.nextInt();
			s = sc.next();
			sum += num;
			count++;
		} // for문 종료
		System.out.println("합=" + sum);
		System.out.println("평균=" + sum / count);

	}// 메인문

}// 클래스문
/*******************************************************************************************************/