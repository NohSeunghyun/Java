package forwhiledowhile;

public class Project3 {

	public static void main(String[] args) {

		// ==과제== 1과 50 사이의 숫자를 출력하되 그 중에서 7의 배수인 것은 제외. 단,한줄에 5개씩 옆으로 실행 후 줄바꿈.

		int i;
		int count = 0;

		System.out.println("======continue사용안함(For문)======");

		for (i = 1; i <= 50; i++) {

			if (i % 7 == 0)
				;
			else {
				System.out.print(i + "\t");

				count++;
				if (count % 5 == 0) {
					System.out.println();
				} // count if문 종료
			} // else문 종료
		} // for문 종료
		System.out.println();

		System.out.println("======continue사용안함(While문)======");

		count = 0;
		i = 0;
		while (i <= 49) {
			i++;
			if (i % 7 == 0)
				;
			else {
				System.out.print(i + "\t");

				count++;
				if (count % 5 == 0) {
					System.out.println();
				} // count if문 종료
			} // else문 종료
		} // while문 종료
		System.out.println();

		System.out.println("======continue사용안함(Do While문)======");

		count = 0;
		i = 0;
		do {
			i++;
			if (i % 7 == 0)
				;
			else {
				System.out.print(i + "\t");

				count++;
				if (count % 5 == 0) {
					System.out.println();
				} // count if문 종료
			} // else문 종료
		} while (i <= 49); // do while문 종료
		System.out.println();

		System.out.println("======continue사용함(For문)======");

		count = 0;
		for (i = 1; i <= 50; i++) {

			if (i % 7 == 0)
				continue;

			System.out.print(i + "\t");

//			count++;
			if (++count % 5 == 0)// 더 간결한 방법
				System.out.println();
		} // for문 종료
		System.out.println();

		System.out.println("======continue사용함(While문)======");

		count = 0;
		i = 0;
		while (i++ <= 49) {// 더 간결한 방법
//			i++;
			if (i % 7 == 0)
				continue;
			System.out.print(i + "\t");

			count++;
			if (count % 5 == 0)
				System.out.println();
		} // while문 종료
		System.out.println();

		System.out.println("======continue사용함(Do While문)======");

		count = 0;
		i = 0;
		do {
			i++;
			if (i % 7 == 0)
				continue;
			System.out.print(i + "\t");

			count++;
			if (count % 5 == 0)
				System.out.println();
		} while (i <= 49);// do while문 종료
		System.out.println();

	}// 메인문

}// 클래스문
/*******************************************************************************************************/