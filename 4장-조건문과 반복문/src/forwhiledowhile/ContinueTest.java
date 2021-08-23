package forwhiledowhile;

public class ContinueTest {

	public static void main(String[] args) {

		/*
		 * 1과 10 사이의 숫자를 출력하되 그 중에서 3의 배수인 것은 제외. 1 2 4 5 7 8 10 (3 6 9 제외)
		 */

		System.out.println("======continue사용안함======");

		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 3 != 0)
				System.out.print(i + "\t");
		}
		System.out.println();// 한줄 내림,위 실행문을 옆으로 실행시켰기 때문

		System.out.println("======continue사용함======");

//		int i;//위에 변수선언을 해줬기때문에 필요없음.넣으려면 i=0;만 넣어도됨.
		for (i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				continue;// continue를 만나면 바로 아래 실행문을 실행하지않고 제일밑으로 내려갔다가 다시올라옴.
			else
				System.out.print(i + "\t");// else 생략가능.
		}
		System.out.println();

		/*
		 * ==과제== 1과 50 사이의 숫자를 출력하되 그 중에서 7의 배수인 것은 제외. 단,한줄에 5개씩 옆으로 실행 후 줄바꿈.
		 */

		System.out.println("======continue사용안함======");

		int count = 0;

		for (i = 1; i <= 50; i++) {

			if (i % 7 == 0)
				;

			else {
				System.out.print(i + "\t");

				count++;
				if (count % 5 == 0)
					System.out.println();
			}
		}
		System.out.println();

		System.out.println("======continue사용함======");

		count = 0;
		for (i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.print(i + "\t");

//			count++;
			if (++count % 5 == 0)// 더 간결한 방법
				System.out.println();
		}
		System.out.println();

	}// 메인문

}// 클래스문
/*******************************************************************************************************/