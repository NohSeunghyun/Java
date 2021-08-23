package string;

/*
 * 메서드 영역 = DATE 영역 (리터럴) = 정적 영역 (static) : <공유>
 * stack 영역
 * heap 영역 = 동적 영역
 */
public class StringMethod {

	public static void main(String[] args) {
		// int i=10;//리터럴(이름없는 메모리(=date 영역)에 저장)

		/*
		 * 주소만으로도 값이 출력되는 이유는? 부모인 Object의 toString()메서드를 상속받아 그대로 사용하지않고 재정의했기 때문.
		 * Object의 toString() : 패키지명.클래스명@16진수 해쉬코드 String의 toString() : 객체(주소) 안의 값을
		 * 리턴(출력)할수있도록 재정의.
		 */

		String s1 = "자바";// "문자열 상수"만으로도 객체생성->공유상수풀(메서드 영역)에 올라감
		System.out.println(s1);// s1:주소, 주소가 참조하는 값을 출력
		System.out.println(s1.toString());// string타입은 to string이 재정의되어 주소가 출력되지않고 참조하는 값을 출력.int타입도 마찬가지.

		// 1)concat():두 문자열을 결합(연결)하여 "새로운 문자열"을 생성

		s1 = s1.concat("프로그램");// 그전 객체("자바")의 주소를 새 객체의 주소로 변경
		System.out.println(s1);

		String s2 = s1.concat("어렵다.");
		System.out.println(s2);

		// 2)IndexOf() : 찾고자 하는 해당 문자열의 시작 인덱스 번호를 리턴(출력)해줌
		// 찾고자 하는 문자나 문자열의 존재 여부 확인(0이나 양수(0부터시작):존재함, -1:존재하지않음)

		int startIndex = s2.indexOf("자바");
		System.out.println("'자바'시작인덱스:" + startIndex);

		startIndex = s2.indexOf("프로그램");
		System.out.println("'프로그램'시작인덱스:" + startIndex);

		startIndex = s2.indexOf("어렵다.");
		System.out.println("'어렵다.'시작인덱스:" + startIndex);

		if (s2.indexOf("자바") != -1)
			System.out.println("자바와 관련있다.");
		else
			System.out.println("자바와 관련없다.");

		String s3 = s2.replace("자바", "JAVA");// "자바"->"JAVA"로 변경된 새로운 문자열 객체 생성.//여기까지 s2에 참조된 문자:"자바","프로그램","어렵다."
		System.out.println(s3);

		String s4 = s3.toLowerCase();// "JAVA"->"java"로 변경된 새로운 문자열 객체 생성.//반대->toOuperCase();:대문자로 변환
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s3.equals(s4));// s3는 대문자.s4는 소문자 이기때문에 거짓.
		System.out.println(s3.equalsIgnoreCase(s4));// Ignorecase는 대소문자 구분없이 비교하기때문에 참

		System.out.println("s3 문자열의 길이=" + s3.length());
		System.out.println("s4 문자열의 길이=" + s4.length());

		s3 = s3.substring(4);
		System.out.println(s3);

		System.out.println("s3 문자열의 길이=" + s3.length());

		s4 = s4.substring(4, 8);
		System.out.println(s4);

		char ch = s4.charAt(2);// 0:프 1:로 2:그
		System.out.println(ch);

		// ★★split("구분자") : 문자열을 구분자로 분리

		// 활용방법

		String animals = "cat,dog,rebbit";
		String[] arr = animals.split(",");

		int i;
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// arr[i]안에 주소
		} // for문 종료

		// ★★join("구분자",join할 문자) : 문자열을 구분자로 결합
		String s5 = String.join("/", arr);
		System.out.println(s5);

		/*
		 * 자바에서 char 배열이 아닌 String 클래스를 이용해서 문자열을 처리하는 이유는? String 클래스 = char형 배열+여러 기능을
		 * 가진 메서드를 가지고 있기때문
		 */

		// String -> char[]로 변환

		String str = "ABC";
		System.out.println(str);
		char[] ch1 = str.toCharArray();// char [A,B,C]로 만들어짐
		System.out.println(ch1);// char타입은 주소만 가지고 출력이됨

		// char[]-> String로 변환

		String str1 = new String(ch1);// char[]의ch1의 주소값을 String으로변환
		System.out.println(str1);// str1의 값

		// 위의 문자열중 'a'만 추출하기

		System.out.println(arr[0].charAt(1));

	}// 메인문

}// 클래스문
/*******************************************************************************************************/