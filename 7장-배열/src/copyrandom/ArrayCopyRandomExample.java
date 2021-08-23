package copyrandom;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyRandomExample {

	public static void main(String[] args) {
		
		//정수형 배열
		
		int[] a1 = new int[5];//a1이라는 주소를가진 배열객체에 length는 5,값은 [0,0,0,0,0]이 기본값인 객체 배열 생성
		
		Arrays.fill(a1, 2);//초기값을 전부 2로 채움
		
		System.out.println(Arrays.toString(a1));//값이 바꼈는지 확인
		
		//for문을 이용하여 항목값을 모두 3으로 변경 후 출력
		
		int i;
		for(i=0;i<a1.length;i++) {
			a1[i]=3;
		}//for문 종료
		System.out.println(Arrays.toString(a1));
		
		//1~10사이의 정수값을 랜덤으로 넣기
		
		for(i=0;i<a1.length;i++) {
			a1[i]=(int) (Math.random()*10)+1;
//			Math.random();//정수값을 랜덤으로 넣기//실행할 때 마다 값이 달라짐.
		}//for문 종료
		System.out.println("1~10사이 랜덤값 넣기->"+Arrays.toString(a1));
		
		/*
		 *    0.0       <= Math.random()              < 1.0 실수값 (예:0.000123)
		 *    0.0*10    <= Math.random()*10           < 1.0*10
		 * -> 0.0       <= Math.random()*10           < 10.0 실수값 (예:7.2345678)
		 * -> (int) 0.0 <= (int) (Math.random()*10)   < (int) 10.0
		 * -> 0         <= (int) (Math.random()*10)   < 10 정수. 정수값 : 0~9사이의 정수
		 * -> 0+1       <= (int) (Math.random()*10)+1 < 10+1 정수값 : 1~10사이의 정수
		 * 
		 * 공식
		 * (int)(Math.random()몇개)+시작정수;//몇개=마지막수-처음수+1
		 */
		
		//11~29사이의 정수값을 랜덤으로 넣기
		
		for(i=0;i<a1.length;i++) {
			a1[i]=(int) (Math.random()*18)+11;//갯수값 넣으려고 계산하기 귀찮을때=>a1[i]=(int) (Math.random()*(29-11+1)+11;로 하면됨.
		}//for문 종료
		System.out.println("11~29사이 랜덤값 넣기->"+Arrays.toString(a1));
		
		//88~101 사이의 정수값을 랜덤으로 채우기.
		
		for(i=0;i<a1.length;i++) {
			a1[i]=(int) (Math.random()*(101-88+1))+88;
		}//for문 종료
		System.out.println("88~101사이 랜덤값 넣기->"+Arrays.toString(a1));
		
		//문자형 배열
		
		char[] ch = new char[3];//ch라는 주소를가진 배열객체에 length는 3,값은 null(빈)이 기본값은 객체 배열 생성
		System.out.println(Arrays.toString(ch));//값확인.비어있어서 [ , , ]
		
		Arrays.fill(ch, 'A');
		System.out.println(Arrays.toString(ch));//값확인
		
		//for문을 이용하여 항목값을 모두'a'로 변경 후 출력 *'A'와'a'는 32차이인것을 사용하여
		
		for(i=0;i<ch.length;i++) {
			//ch[i]=(char)(ch[i]+32);//(ch[i]+32는 문자를 정수로 변환후 정수를 더한값이기 때문에 앞에 char로 타입을 붙여 출력하여야함.
			ch[i]+=32;//복합대입연산자를 사용하면 연산 후 자동으로 타입변환 후 출력해주기 때문에 따로 타입을 안붙여도됨.그래서 자주 사용한다.
		}//for문 종료
		System.out.println(Arrays.toString(ch));//값확인
		
		/*
		 * 배열 복사 방법
		 */
		
		char[] arr = {'J','A','V','A'};//arr.length==4 인 char타입의 배열객체.
		System.out.println(Arrays.toString(arr));//값확인
		
		//배열 복사 방법-1(for문사용)
		
		char[] arr1 = new char[6];//JAVA를 넣고 뒤에 더 넣고싶다면 length값을 올린다.//초기값인null로 되어있다.
		System.out.println(Arrays.toString(arr1));//값확인
		
		for(i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}//for문 종료
		System.out.println("배열복사방법-1>"+Arrays.toString(arr1));
		
		//배열 복사 방법-2(메서드 사용)//★★★★★공부해야함
		
		char[] arr2 = new char[6];//초기값인 null로 되어있다.
		//char[] arr2 = new char[arr.length+2];//arr의 글자가 많을 경우 length값을 헤아리기 힘들기 때문에 연산으로 하면됨.		
		
		//arraycopy(원본, 원본의시작index, 도착지, 도착지의시작index, 복사할 개수)
		System.arraycopy(arr, 0, arr2, 0, 4);//arraycopy(복사할원본(주소(=객체명)), 복사시점인덱스값, 복사할위치(주소(=객체명)), 복사받을시작위치인덱스값, 복사갯수(length값으로(ex)0인덱스만 복사하려면 1)))
		//System.arraycopy(arr, 1, arr2, 0, 4);//arr의 length값이 4(=4개 문자)인데 1 index부터 복사를하면 4개째 문자가 없기때문에 오류가남.->글자가 많을경우 글자수를 헤아리기 힘들다.이 문제를 해결하기 위해선 61번째줄 확인.
		System.out.println("배열복사방법-2>"+Arrays.toString(arr2));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("늘릴 배열 크기\n=>");
		int size=sc.nextInt();
		String ch1;
		/*
		 * ==과제==
		 * 키보드로 입력받아 arr3의 null값에 채우기
		 * for문을 사용하여 "J,A,V,A,!,~"을 출력
		 */
		
		//★★★배열 복사 방법-3
		
		char[] arr3=Arrays.copyOf(arr, arr.length+size);//char[] arr3=Arrays.copyOf(arr, arr.length+2);//위에 length값이 더 긴 배열객체를 생성하여 그쪽으로 복사하는것 전부 한줄로 만듬.(arrays.copyof(arr, arr.length+2))->arr의값을, arr의 length값+2를 한 배열객체에 넣는다. 그리고 arr3에 참조.
		System.out.println("배열복사방법-3>"+Arrays.toString(arr3));
		
		for(i=4;i<arr3.length;i++) {
			System.out.println("추가로 넣을 문자를 입력하세요.\n=>");
				ch1=sc.next();
			arr3[i]=ch1.charAt(0);
		}//for문 종료
		System.out.println("입력값은 "+Arrays.toString(arr3)+"입니다.");
		
		//★★★배열 복사 방법-4
		
		char[] arr4 =Arrays.copyOfRange(arr, 0, 3+1);//J,A,V,A
		//자바 메서드는 인덱스 2개나오면(시작index, 마지막index)
		System.out.println("배열복사방법-4>"+Arrays.toString(arr4));
		
	}//메인문

}//클래스문
/*******************************************************************************************************/