package forex;

public class Project2 {

	public static void main(String[] args) {
		
		//==과제== 구구단 단수를 맨위에 표시 옆으로 출력 후 그 밑에 구구단 옆으로 출력(1단밑에 1단 쭉 나오고 ...9단밑에 9단 쭉 나오게)

		int i, j; // 변수지정

		System.out.println("--------FOR문 사용--------");

		for (i = 1; i <= 9; i++) {
			System.out.print("제 " + i + " 단\t");
		} // 단 표시 i for문 종료
		System.out.println(); // 단 표시
		System.out.println("======================================================================");
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			} // j for문 종료
			System.out.println();// 1x9 2x9....9x9 후 줄바꿈.아래방법들과 다른,가장 단순한방법. if 조건문 안씀.
		} // i for 문 종료

		System.out.println("--------WHILE문 사용--------");

		i = 0;
		while (i <= 8) {
			i++;
			System.out.print("제 " + i + " 단\t");
		} // 단 표시 i while문 종료
		System.out.println();// 단 표시
		System.out.println("======================================================================");
		i = 0;
		while (i <= 8) {
			i++;
			j = 0;
			while (j <= 8) {
				j++;
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
				if (j == 9)
					System.out.println();
			} // j while문 종료

		} // i while문 종료

		System.out.println("--------DO WHILE문 사용--------");

		i = 0;
		do {
			i++;
			System.out.print("제 " + i + " 단\t");
		} while (i <= 8);// 단 표시 i do while문종료
		System.out.println();// 단 표시
		System.out.println("=====================================================================");
		i = 0;
		do {
			i++;
			j = 0;
			do {
				j++;
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
				if (j == 9)
					System.out.println();
			} while (j <= 8); // j do while문 종료

		} while (i <= 8);// i do while문 종료

		System.out.println("--------더 간결하게(FOR문)--------");// 단 표시 수식도 for문안으로 넣기 ★ 몰랐던 방법.

		for (i = 0; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i == 0)
					System.out.print("제 " + j + " 단\t");// j로 단표시.
				else
					System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			} // j for문 종료
			System.out.println();
		} // i for 문 종료

		System.out.println("--------더 간결하게(WHILE문 사용)--------");

		i = 0;
		while (i <= 9) {
			j = 0;
			while (j <= 8) {
				j++;
				if (i == 0)
					System.out.print("제 " + j + " 단\t");
				else
					System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			} // j while문 종료
			i++;
			System.out.println();
		} // i while문 종료

		System.out.println("--------더 간결하게(DO WHILE문 사용)--------");

		i = 0;
		do {
			j = 0;
			do {
				j++;
				if (i == 0)
					System.out.print("제 " + j + " 단\t");
				else
					System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			} while (j <= 8); // j do while문 종료
			i++;
			System.out.println();
		} while (i <= 9);// i do while문 종료

	}// 메인문

}// 클래스문
/*******************************************************************************************************/