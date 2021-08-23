package forex;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 구구단 출력

		int i, j;

		for (i = 2; i <= 9; i++) {// 2->3...->9(참)->10(거짓,실행종료)
			for (j = 1; j <= 9; j++) {// 1->2->3...->9(참)->10(거짓,실행종료)
				System.out.println(i + "X" + j + "=" + (i * j));// 2X(1~9)= ->3X(1~9)=...->9X(1~9)=
			} // j for문 종료
			System.out.println("(↑↑" + i + "단↑↑)");
		} // i for문 종료

		// 구구단출력-***제 몇 단***

		for (i = 2; i <= 9; i++) {
			System.out.println("======제 " + i + " 단======");
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			} // j for문 종료
//			System.out.println("(↑↑" + i + "단↑↑)"); 구분위한 줄 이쪽에도 사용가능하나 구구단출력후 아래에 표시됨.
		} // i for문 종료

		// 구구단 출력-옆으로 ***제 몇 단***★★과제★★

		System.out.println("=======과제=======");

		for (i = 1; i <= 9; i++)
			System.out.print("제 " + i + " 단\t");
		System.out.println();// 단 표시
		for (i = 1; i <= 9; i++)
			for (j = 1; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
				if (j >= 9)
					System.out.println();
			} // j for문 종료

		// 2단~입력한 수의 단까지 출력

		System.out.println("단 입력:");
		int dan = sc.nextInt();

		for (i = 2; i <= dan; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + (i * j) + "\t");
				if (j >= 9)
					System.out.println();
			} // j for문 종료
		} // i for문 종료

		System.out.println("======구구단 중에서 \"두 수를 곱해서 72가 되는 것\"만 출력======");

		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i * j == 72)
					System.out.println(i + "X" + j + "=" + (i * j));
			} // j for문 종료
		} // i for문 종료

		System.out.println("======구구단 중에서 \"8*9=72\"만 출력");

		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i == 8 && j == 9)
					System.out.println(i + "X" + j + "=" + (i * j));
			}
		}

		System.out.println("======위 문제 다른방법======");

		outer: for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i * j == 72) {
					System.out.println(i + "X" + j + "=" + (i * j));
					break outer;
				} // if문 종료
			} // j for문 종료
		} // i for문 종료

	}// 메인문

}// 클래스문
/*******************************************************************************************************/