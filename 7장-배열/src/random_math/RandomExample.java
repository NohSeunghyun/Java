package random_math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		//로또추첨
		
		//선택번호
		
		int[] sn=new int[6];//[0,0,0,0,0,0] 선택번호 6개가 0으로채워짐
		
		Random r=new Random();//(정수)값(=시드값)을 주면 반복실행시 랜덤으로 계속 같은값이 나옴. 비워두면 다른값이나옴.
		
		System.out.println("선택번호:");
		
		int i;
		for(i=0;i<sn.length;i++) {
			sn[i]=r.nextInt(45)+1;//1부터 시작해서 45까지의 랜덤값//r.nextInt(마지막값)+시작값
			System.out.print(sn[i]+" ");
		}//for문 종료
		System.out.println();
		
		/*
		 * Random 클래스
		 * 0   <= nextint(n)    < n
		 * 0   <= nextint(45)   < 45 =>정수값 0~44.
		 * 0+1 <= nextint(45)+1 < 45+1 =>정수값 1~45.
		 * -> r.nextint(45)+1;
		 */
		
		//당첨번호
		
		int[] wn=new int[6];//[0,0,0,0,0,0] 선택번호 6개가 0으로채워짐
		
		r=new Random();
		
		System.out.println("당첨번호:");
		
		for(i=0;i<sn.length;i++) {
			wn[i]=r.nextInt(45)+1;//1부터 시작해서 45까지의 랜덤값//r.nextInt(마지막값)+시작값
			System.out.print(wn[i]+" ");
		}//for문 종료
		System.out.println();
		
		//당첨여부
		
		System.out.print("당첨여부:");
		
		if (Arrays.equals(sn, wn)) System.out.println("축하합니다. 1등에 당첨되었습니다!!");
		else System.out.println("꽝입니다. 다시 사세요.");
		
		/*
		 * 이진'탐색' : 반드시 정렬-> 정렬된 데이터를 대상으로 탐색하는 알고리즘
		 */
		
		//1.정렬
		
		Arrays.sort(sn);
		System.out.println(Arrays.toString(sn));
		
		Arrays.sort(wn);
		System.out.println(Arrays.toString(wn));
		
		//2.binarysearch(배열,찾을값)
		
		int idx=Arrays.binarySearch(wn, 38);//정렬된 배열에서 28을 찾아서 index번호를 출력해줌.
		System.out.println("38은 "+(idx+1)+"번째로 작은 값이다.");
		//1~5등 당첨여부 적어보자.
		
	}//메인문

}//클래스문
/*******************************************************************************************************/