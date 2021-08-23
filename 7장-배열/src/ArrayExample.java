import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		//배열을 사용하지 않았을 때//4명의 성적 산출하기.
		
		int s1=83;
		int s2=88;
		int s3=95;
		int s4=87;
		
		//더한 합?
		
		int sum=s1+s2+s3+s4;
		System.out.println("합="+sum);
		
		//for(반복문)을 사용하여 산출하기.(잘못된것)
		
		/*
		 * 정수사이에는 일정한 규칙이 없어서 반복문 사용불가.
		 * int i;//for문에 사용하기위한 변수선언.
		 * sum=0;//반드시 초기화해야함.위의 연산데이터가 남아있기때문.
		 * for(i=1;i<=4;i++) {
		 * sum+=si;//잘못된 연산자.
		 * }//for 문 종료
		 */
		
		//배열선언, 생성(heap메모리)과 동시에 값 목록 대입
		
		System.out.println("******배열사용******");
//		int[] scores;//배열선언만 한경우.
		int[] scores = {83, 88, 95, 87};//배열 선언과 동시에 값 목록 대입//반드시 같은 타입만 가능.int타입의 값목록은 int[]로만 넣을수있음.
		      //index    0   1   2   3   으로 들어감. 배열객체에는 반드시 length가 들어감. 여기서 length==4(마지막 index+1), 읽기전용.
		//☆만약 이미 대입되어있는 값을 변경하고싶을때
		scores[0]=93;//83->93으로 바뀜.
		//scores 인덱스값에 들어가있는 (=참조되있는) 값을 확인하고싶을때
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		//for문을 사용하여 산출
		
		sum=scores[0]+scores[1]+scores[2]+scores[3];//0으로 초기화 안해도됨. 초기화하는 이유는 반복문에서 0+1+2+3+4...이런식으로 올라가다가 나온 값이 저장되어있어서 0으로 바꾸는것. 지금 여기서는 대입연산자이기때문에 0으로 초기화안하고 기존 대입연사자를 현 대입연산자로 바꾸는것
		System.out.println("합="+sum);
		
		int i;//index, 반복횟수, 반복하여 실행문에 사용됨.
		sum=0;//위에서 sum값이 위 수식에 들어가있기 때문에 반드시 0으로 초기화하고 진행해야함.만약 초기화안할경우 위수식의 값인 363이 들어있고. 그 값에 아래수식의 값이 들어가기때문에 오류가 발생함 확인하려면 sum=0;을 주석처리하고 실행해보자.
		for(i=0;i<scores.length;i++) {
			sum+=scores[i];	
		}// for문 종료
		System.out.println("합="+sum);
		
		//평균 구하기.
		
		System.out.println("평균="+sum/scores.length);//4칙연산에 의거. 더하기or빼기 보다 곱하기or나누기가 우선적으로 하기때문에 괄호를 안쳐도 됨.//결과가 정수로만 나옴.
		
		//위 연산의 값(정수)을 실수로 바꾸기.
		
		System.out.println("평균="+(double)sum/scores.length);//연산하고자 하는 값 둘중 하나만 강제형변환 하면 실수로 나온다.//뒤의 정수값은 자동으로 실수로 형변환됨.=결과 실수로출력.//데이터 손실이 발생함.
		System.out.println("평균="+sum/(double)scores.length);
		System.out.println("평균="+(double)(sum/scores.length));//만약 괄호를 쳐서 값을 실수로 만들면. 먼저 계산한 값을 실수로 만들기때문에 결과에 오류가 생김.
		
		//char타입배열
		char[] ch = {'a','b','c'};//index값에 문자값을 넣는다.
		System.out.println(ch);//ch:ch타입 배열객체의 주소
		System.out.println("char 배열="+ch);//ch:주소//재정의안했을경우 값이아닌 주소가출력,
		System.out.println("char 배열="+ch.toString());//char타입의 주소.16진수 해시코드.//Arrays를 사용하면 값을 출력할 수 있다.
		
		//반복문을 사용하여 옆으로 출력,탭 크기만큼 띄우면서.
		
		for(i=0;i<ch.length;i++) {
			System.out.print(ch[i]+"\t");	
		}// for문 종료
		System.out.println();
		
		//**************★과제.반복문을 사용하여 옆으로 출력,콤마를 찍어.단, 마지막 콤마를 없애기.**************
		
		//방법-1
		
		System.out.print("방법1=");
		
		char[] ch2 = { 'a', 'b', 'c' };
		for (i = 0; i < ch2.length; i++) {
			//ch2.length의값은 3
			if (i != ch2.length -1) System.out.print(ch2[i] + ",");
			else System.out.print(ch2[i]);//마지막 index에서 ,를찍지않는다.
		} // for문 종료
		System.out.println();
	
		//방법-2 ★★★중요, 하는거 꼭 이해해야함.
		
		System.out.print("방법2=");
		
		String charjoin="";
		for (i = 0; i < ch2.length; i++) {
			charjoin=charjoin+ch2[i]+",";
		} // for문 종료
//		charjoin.substring(0, charjoin.length()-1);//배열객체 charjoin의 값 [a,b,c]
		charjoin=charjoin.substring(0, charjoin.length()-1);//참조시켜 그 값을 저장시킨다
//		System.out.println(charjoin.substring(0, charjoin.length()-1));//한번 사용하고 끝내려면 참조시키지않고 이렇게 표현.
		System.out.println(charjoin);
		//★오해하기쉬운것.
		System.out.println(charjoin.substring(0, charjoin.length()-1));//위 수식값인 [a,b,c]가 저장되어있다가 또 마지막인덱스-1을 출력하기때문에 [a,b,]가 출력되나 참조시키지않아 이값을 데이터에 저장하지않음.
		System.out.println(charjoin.substring(0, charjoin.length()-1));//그래서 이값은 [a,b]가 출력된다고 오해하기쉬움. 위 수식값인[a,b,]를 대입연산자로 저장시키지 않아 원래 참조된 값이 변경되지않음.고로 값은 [a,b,]가출력됨
		
		//방법-3 조건연산자를 사용.
		//조건연산자 (조건문)? 참:거짓
		
		System.out.print("방법3=");
		
		for (i = 0; i < ch2.length; i++) {
			
			System.out.print(ch2[i] + ((i != ch2.length-1)?",":""));
			
		} // for문 종료
		System.out.println();
	
		
		//예외생성->처리하기
		
//		System.out.println(ch[3]);//참조된 인덱스가 'a'=0 'b'=1 'c'=2인데 인덱스3은 없기때문에 예외객체생성됨.
		
		//char[] ch = {'a','b','c'};에 들어가있는 문자를 대문자로 출력하기.
		
		System.out.println("----------------------------");
		
		System.out.println((int)'A');
		System.out.println((int)'a');//대문자와 소문자는 32차이
		
		System.out.println("----------------------------");
		
		for (i=0;i<ch.length;i++) {
			ch[i]-=32;//문자타입 97-32, 98-32, 99-32 => [65, 66, 67] 변환하여 값을 대입.(=ch[i]의 값이 바뀜)
		}// for문 종료
		System.out.println(Arrays.toString(ch));//위 연산값을 문자로 변환하여 출력=>[A,B,C]
		
		System.out.println("----------------------------");
		
		//대문자로 출력된 것을 소문자로 다시 출력하기.(헷갈릴만한 예시.)
		
		System.out.println("----------------------------");
		
		for (i=0;i<ch.length;i++) {
			System.out.print(ch[i]+32+" ");//65+32, 66+32, 67+32 => 97, 98, 99 // 대입연산자를 사용한것이 아니기때문에 ch[i]의 값이 바뀌지않음.단순 ch[i]에 들어있는 char(문자)타입을 정수로 변환하여 연산 후 값만 출력함. 
		}// for문 종료
		System.out.println();
//		System.out.println(Arrays.toString(ch));
		
		System.out.println("----------------------------");
		
		//대문자로 출력된 것을 소문자로 다시 출력하기.(=정수로 나온 값을 문자타입으로 출력하기)
		
		System.out.println("----------------------------");
		
		for (i=0;i<ch.length;i++) {
			System.out.print((char)(ch[i]+32)+" ");//a b c 
		}// for문 종료
		System.out.println();
//		System.out.println(Arrays.toString(ch));
		
		System.out.println("----------------------------");
		
		/*
		 * ArrayIndexOutOfBoundsException, NullPointerException, 등...
		 * :보편적으로 오류(예외객체)는 예외처리(try~cahth)로 처리하지않고, 프로그래머가 알아서 논리적으로 처리함.(=잘못된 코드를 삭제,실수한것을 제거)
		 */
		
		try {
//			System.out.println(ch[3]);//잘못된 코드 삭제
			System.out.println(ch[2]);//3->2로 변경하여 실행되게바꿈.
		} catch (Exception e1) {//예외가 발생하지 않을 경우 실행되지않음
			e1.printStackTrace();
		}//예외처리함.
		
		//Array사용하기
		
		System.out.println(Arrays.toString(ch));//(char타입)ch에 참조되어 있는 값 나열
		
		System.out.println(Arrays.toString(scores));//(int타입)scores에 참조되어 있는 값 나열
		
		Arrays.sort(scores);//scores가 참조하고 있는 값을 정렬.
		
		System.out.println(Arrays.toString(scores));
		
		//배열 선언 후 배열 목록 생성 방법-1
		
		int[] sco1=null;//배열선언.null:참조하는 배열객체 없음.
		
//		System.out.println(sco1[0]);//문법상 오류없음.하지만 실행시 예외객체 발생.//해결방법 : 실행문 드래그->마우스오른쪽클릭->서라운드위드(둘러싸기)->트라이/캐치 블럭
		
		/*
		 * try{예외가 발생할 가능성이 있는 부분} 만약, 예외가 발생하면 밑의 캐치 실행. 발생하지 않으면 캐치 실행하지 않고 지나감.
		 * chtch(Exception e){애외 객체를 잡아서 처리}
		 */
		
		try {
			System.out.println(sco1[0]);
		} catch (Exception e) {//Exception:모든 자식 예외객체의 부모(Object:모든 클래스의 부모)
//			e.printStackTrace();//보기싫기 때문에 보기좋게 바꾸기위해 주석처리.
			System.out.println("배열 객체가 존재하지 않습니다.");//예외객체 생성시 캐치로 처리후 이 문구를 실행.
		}//위 오류를 트라이/캐치블럭을 생성하여 해결.
		
		System.out.println("아아아이이에");//실행안됨. 위 실행문이 실행안되기때문.하지만 그 위 실행문까지는 실행이됨.//트라이/캐치블럭 생성 후 실행이됨.하지만 보기가싫음.(자바가상머신이 처리하였기때문)-> 위 (실행문참조)실행문에서 보기좋게 변경함
		
		/*
		 * 기본값
		 * int(정수)의 기본값:0,
		 * double(실수)의 기본값:0.0,
		 * booleun(참,거짓)의 기본값:fales,
		 * string(문자)의 기본값:null,
		 * char(문자(''))의 기본값:null문자='\0'
		 */
		
		sco1=new int[3];//int []에서 []안에의 수는 length값이 들어감.=>sco1=[0],[0],[0]이 값으로 들어가있음.
		
		System.out.println(Arrays.toString(sco1));
		
		sco1[0]=10;//0인덱스 자리의 값이 10으로 선언.
		for(i=1;i<sco1.length;i++) {//sco1=new int[3];이라는 수식을 위에 사용했기 때문에 지금sco1의 length값은 3
			sco1[i]=sco1[i-1]+10;//sco1[1]=sco[1-1(=0)]+10=>sco1[1]=sco[0](=10)+10=>sco1[1]=10+10(=20)=>sco1[1]=20 =>sco1의 1인덱스값이 20....sco1의 2인덱스값은 30.//10,20,30
		}// for문 종료
		System.out.println(Arrays.toString(sco1));//sco1에 참조된 인덱스값 출력=>sco1에 length값 3을 넣어놨기 때문에 인덱스 0,1,2의 값이 출력됨. 위수식에서 인덱스 0의값은 증가하지않음.
		
		//90 85 99 대입
		
		sco1[0]=90;
		sco1[1]=85;
		sco1[2]=99;
		
		System.out.println(Arrays.toString(sco1));
		System.out.println("int 배열"+sco1.toString());//I@7852e922
		
		String[] s= {"양연석","윤호섭","이수광","전상호"};
		
		//**************★과제2.키보드로 부터 정수를 입력받아 sco1이 참조하는 배열객체에 저장 후 합계와 평균을 구하시오.(위 내용을 응용하여 문제풀기.)**************
		
		Scanner sc=new Scanner(System.in);
				
		int[] sco2 = null;
		System.out.print("배열 크기를 입력하세요\n=>");
		int num=sc.nextInt();
//		sco2 = new int[sc.nextInt()];//변수지정안하고 바로 입력값을 참조시킬수 있음.
		sco2=new int[num];//3을 입력시 [0,0,0]이들어있다.
		
		sum = 0;
		//for (i = 0;1<num; i++)//아래 1<sco2.length와 같음.
		for (i = 0;i<sco2.length; i++) {//sco2 = new int[sc.nextInt()];이것을 위에 사용하면 사용불가. 변수명에 참조시키지 않았기때문
			System.out.print((i+1)+"번째 정수입력\n=>");
			sco2[i] = sc.nextInt();
			sum = sum + sco2[i];//sum+=sco2[i]와같다.//입력받은 값을 합계에 누적.
		} // for문 종료
		System.out.println("합=" + sum);
		System.out.println("평균=" + (double)sum /sco2.length);//sco2 = new int[sc.nextInt()];를 사용했을경우 평균은 num이라는 변수명으로 나누지않고 sco2의 length값으로 나눠야함.
	
		//배열 선언 후 배열목록 생성방법
		
		System.out.println("배열 선언 후 배열목록 생성방법");
		
		int[]sco3=new int[3];//[0,0,0]기본값
		sco3[0]=3;//초기값
		sco3[0]=4;
		sco3[0]=5;
		
		int[]sco4=new int[] {10,20,30};//초기값,new int[]생략가능 ,생략 안할시 new int[]의 length값 생략해야함.생략안할시 오류뜸. new int[] {}에서 {}안의값이 length값이기때문.
		
		int[]sco5= {10,20,30};
		
		int[]sco6=null;//선언
		sco6=new int[] {10,20,30};//new int[]생략불가
		
		/*
		 * 향상된 for문 정리 : indexㄹ 접근하지 않기때문에
		 * 				index로 접근하여 값을 변경하는 실행문에는 사용불가
		 */
		
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
		
		//향상된 for문 사용하여 출력 [0,10,20,30,40]
		
		System.out.println("======향상된for문사용======");
		
		String str="";
		for(int value:arr) {
			str=str+value+", ";//i(index접근법)사용 못함
			
		}//for문 종료
		str=str.substring(0, str.length()-1);
		System.out.println(str);
		
	}//메인문

}//클래스문
/*******************************************************************************************************/