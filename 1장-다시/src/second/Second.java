/*
 두번째 수업
 주석달기
 */
package second;

public class Second {

	public static void main(String[] args) {
		//주석-컴파일러가 번역안함
		System.out.println("피고오오온");
		System.out.println("적응힘듦\n");
		System.out.println("2+5");
		System.out.println(2+5);
		/*
		 * + : 2가지 기능
		 * 숫자+숫자 = 더한합
		 * "문자열" + 숫자 = "문자열수" 문자열을 연결하는 +
		 */
		System.out.println("2+5"+2+5);//"2+5="+"2"=>"2+5=2"+"5"=>"2+5=25"
		System.out.println("2+5"+(2+5));
		System.out.println("2+5="+(2+5));
		
		System.out.println("문자열을 입력한 그대로 출력(단, 이스케이프는 제외)");
		System.out.println("그대로출력");
		System.out.println("다음줄로\n");
		System.out.println("탭 크기만큼 띄어쓰기\t다음글자\t다음글자");
		System.out.println('a');//'문자1개'
		System.out.println((int)'a');//'문자1개' 'a'를 정수형변환(아스키코드)
		System.out.println("a");//"문자여러개"
		
		
	}

}
