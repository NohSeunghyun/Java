package copyrandom;

import java.util.Arrays;
import java.util.Scanner;

public class Project7 {

	public static void main(String[] args) {
		
		/*
		 * ==과제==
		 * 키보드로 입력받아  null값에 채우기
		 * for문을 사용하여 "J,A,V,A,!,~"을 출력
		 */
		
		Scanner sc=new Scanner(System.in);
		
		//방법1.
		
		System.out.println("======방법1======");
		
		char[] arr = {'J','A','V','A'};
		
		System.out.print("늘릴 배열 크기\n=>");
		int size=sc.nextInt();
		char[] arr1=Arrays.copyOf(arr, arr.length+size);
		
		String ch;
		int i;
		for(i=4;i<arr1.length;i++) {
			System.out.print("추가로 넣을 문자를 입력하세요.\n=>");
			ch=sc.next();
			arr1[i]=ch.charAt(0);
		}//for문 종료
		System.out.println("입력값은 "+Arrays.toString(arr1)+"입니다.");
		
		//방법2.
		
		System.out.println("======방법2======");//공부해야함//ArrayCopyRandomExample의 배열복사방법2참고하여공부
		
		System.out.print("늘릴 배열 크기\n=>");
		size=sc.nextInt();
		char[] arr2=Arrays.copyOf(arr, arr.length+size);
		
		String str="";
		System.out.print("추가로 넣을 문자를 입력하세요.\n=>");
		str=sc.next();//여기에 바로 타입선언해도됨 ex)String str=sc.next();
		char[] ch1=str.toCharArray();
		System.arraycopy(ch1, 0, arr2, arr.length, ch1.length);
		for(i=0;i<arr2.length;i++) {
			if(i>=0 && i<=arr2.length-2) System.out.print(arr2[i]+",");
			if(i==arr2.length-1) System.out.println(arr2[i]);
		}//for문 종료
		System.out.println("입력값은 "+Arrays.toString(arr2)+"입니다.");
		
		//방법3.(선생님)//방법1을 더 간략히
		
		System.out.println("======방법3======");
		
		System.out.print("늘릴 배열의 크기>");
		size=sc.nextInt();
		char[] scores=Arrays.copyOf(arr, arr.length+size);
		System.out.println(Arrays.toString(scores));//배열크기확인
		
		for(i=arr.length;i<scores.length;i++) {
			System.out.print("빈 곳에 넣을 문자 입력:");
			scores[i]=sc.next().charAt(0);//문자열을 읽어들임.->캐릭터타입으로 변환->스코어의 배열객체에 참조시킴.charAt(0)은 입력값의 0인덱스를 추출한다는뜻.ex)AB를 입력하면 A를 추출. charAt(1)이면 B를 추출.
		}//for문 종료
		System.out.println("입력값은 "+Arrays.toString(scores)+"입니다.");
		
		//방법4.(선생님)//방법2 간략히and설명
		
		System.out.print("늘릴 배열의 크기>");
		size=sc.nextInt();
		char[] scores1=Arrays.copyOf(arr, arr.length+size);//(복사할(원본) 변수명,복사할 인덱스크기)->복사해서 새로운 객체에참조,저장(=새로운원본 생성)
		System.out.println(Arrays.toString(scores1));//배열크기확인
		
		System.out.print("빈곳에 추가로 입력할 문자 입력:");
		String str1=sc.next();//입력받은 문자열을 str1에 참조
		char[] ch2=str1.toCharArray();//참조된str1을 캐릭터타입으로 변환하여 ch2의 배열객체에 참조
		
		System.arraycopy(ch2, 0, scores1, arr.length, ch2.length);//(복사할(원본) 변수명,시작인덱스,복사받을(새로운 원본) 변수명,복사시작인덱스,복사할갯수인덱스(=0인덱스값만 복사하려면 1))
		
		System.out.println(Arrays.toString(scores1));
		
	}//메인문

}//클래스문
/*******************************************************************************************************/