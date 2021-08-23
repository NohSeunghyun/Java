
public class Project4 {

	public static void main(String[] args) {

		// ==과제== 반복문을 사용하여 옆으로 출력,콤마를 찍어.단, 마지막 콤마를 없애기.

		System.out.println("======if문 사용======");

		int i;

		char[] ch = { 'a', 'b', 'c' };
		for (i = 0; i < ch.length; i++) {
			if (i == 2)
				System.out.print(ch[i]);
			else
				System.out.print(ch[i] + ",");
		} // for문 종료
		System.out.println();

		System.out.println("======length문 사용======");

		// 방법-1

		for (i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			if (i + 1 == ch.length)
				break;
			System.out.print(",");
		} // for문 종료
		System.out.println();

		// 방법-2

		for (i = 0; i < ch.length; i++) {
			// ch2.length의값은 3
			if (i != ch.length - 1)
				System.out.print(ch[i] + ",");
			else
				System.out.println(ch[i]);// 마지막 index에서 ,를찍지않는다.
		} // for문 종료

		// 방법-3 ★★★하는거 꼭 이해하기//ArrayExample 클래스에 설명넣음.

		String charjoin = "";
		for (i = 0; i < ch.length; i++) {
			charjoin = charjoin + ch[i] + ",";
		} // for문 종료
		charjoin = charjoin.substring(0, charjoin.length() - 1);
		System.out.println(charjoin);

		System.out.println("======조건연산자 사용======");

		for (i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + ((i != ch.length - 1) ? "," : ""));
		} // for문 종료
		System.out.println();

	}// 메인문

}// 클래스문
/*******************************************************************************************************/