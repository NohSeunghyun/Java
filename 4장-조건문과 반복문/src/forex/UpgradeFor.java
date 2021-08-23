package forex;

import java.util.Arrays;

public class UpgradeFor {

	public static void main(String[] args) {
		
		//향상된 for문 과제
		
		int i;
		int[] arr= new int [5];//[0,0,0,0,0]
		
		//arr의 값을 10씩증가한값-> [0,10,20,30,40]으로 출력
		
		System.out.println("======10씩 증가======");
		
		for(i=1;i<arr.length;i++) {//arr[0]의값은 변함없이 0이기때문에 i=1부터시작.arr.length값이 5이니 i가 4까지 증가->연산 후 종료
			arr[i]=arr[i-1]+10;//arr[1]=arr[0]의값(=0)+10
		}//for문 종료
		System.out.println(Arrays.toString(arr));
		
		//arr의 값을 20씩 증가한[0,20,40,60,80]출력
		
		System.out.println("======20씩 증가======");
		
		for(i=1;i<arr.length;i++) {
			arr[i]=arr[i-1]+20;//arr[1]=arr[0](=0)+20
//			arr[2]=arr[2-1]+20;//arr[1]=20 이니 arr[2]=20+20이됨.
		}//for문 종료
		System.out.println(Arrays.toString(arr));
		
		System.out.println("======for문으로 출력======");
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+((i !=arr.length-1)?", ":""));
		}//for문 종료
		System.out.println();
		
		//★★과제.[]괄호 붙여보자
		
		System.out.println("------괄호붙이기------");
		
		//방법1.
		
		System.out.print("[");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+((i !=arr.length-1)?", ":"]"));
		}//for문 종료
		System.out.println();
		
		//방법2.
		
		for(i=0;i<arr.length;i++) {
			if (arr[i]==0) System.out.print("["+arr[i]+", ");
			else System.out.print(arr[i]+((i !=arr.length-1)?", ":"]"));
		}//for문 종료
		System.out.println();
		
		//arr의 값을 [0,10,20,30,40]으로 변경 후 향상된 for문 사용하여 출력
		
		System.out.println("======향상된for문사용======");
		
		arr=new int[5];
		
		for(i=1;i<arr.length;i++) {
			arr[i]=arr[i-1]+10;
		}//for문 종료
		String str="";
		for(int value:arr) {
			str=str+value+", ";//i(index접근법)사용 못함
		}//for문 종료
		str=str.substring(0, str.length()-1);
		System.out.println(str);
		
		//★★과제.[]괄호 붙이고 콤마를 지워보자.
		
		System.out.println("------괄호붙이고 콤마지우기------");
		
		str="";
		for(int value:arr) {
			str=str+value+", ";
		}//for문 종료
		str=str.substring(0, str.length()-2);
		System.out.println("["+str+"]");
		
	}//메인문

}//클래스문
/*******************************************************************************************************/