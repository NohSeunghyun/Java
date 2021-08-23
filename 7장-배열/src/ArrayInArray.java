import java.util.Arrays;

public class ArrayInArray {

	public static void main(String[] args) {
		
		//2차원 배열 선언하는 방법-1
		
						//[3]열의length값				//index번호 0  1  2        0  1  2
		int[][]m=new int[2][3];//[2행]:주소[3열]:인덱스번호 => m[0]-[0][0][0] m[1]-[0][0][0]
					//[2]행의length값					//m[0]배열객체의index0의값은0
		
		System.out.println((m[0]));//m[0] :0행 int[]의주소=>해시태그
		System.out.println((m[1]));//m[1] :1행 int[]의 주소
		
		System.out.println(Arrays.toString(m[0]));//m[0] :0행 int[]의주소에 속한 값들
		System.out.println(Arrays.toString(m[1]));
		
		System.out.println("for문으로 주소에 속한 값들 확인하기");
		
		int i;
		for(i=0;i<m.length;i++) {
			System.out.println(Arrays.toString(m[i]));
		}// for문 종료
		
		System.out.println("향상된 for문으로 주소에 속한 값들 확인하기");
		
		//향상된for : index로 접근해야만 하는 것은 사용못함
		
		System.out.println("향상된for");
		for(int[] arr:m) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=============================");
		//2차원 배열값 넣기-000이나온것을 [0, 0, 0]으로 출력되게 하기
		
		//방법-1
		
		System.out.print("["+m[0][0]+", ");//기본값출력
		System.out.print(m[0][1]+", ");
		System.out.println(m[0][2]+"]");
		
		System.out.print("["+m[1][0]+", ");
		System.out.print(m[1][1]+", ");
		System.out.println(m[1][2]+"]");
		
		//방법-2 반복문으로 쉽게 돌리기위해 변형
		
		System.out.print("[");
		System.out.print(m[0][0]+", ");//기본값출력
		System.out.print(m[0][1]+", ");
		System.out.print(m[0][2]);
		System.out.println("]");
		
		System.out.print("[");
		System.out.print(m[1][0]+", ");//기본값출력
		System.out.print(m[1][1]+", ");
		System.out.print(m[1][2]);
		System.out.println("]");
		
		m[0][0]=95; m[0][1]=100; m[0][2]=87;
		m[1][0]=83; m[1][1]=92; m[1][2]=78;
		
		/*
		 * ★★과제1.
		 * 위 수식을 가지고
		 * 중첩된 for문을 이용하여 아래내용 출력
		 * [95, 100, 87]
		 * [83, 92, 78] 
		 */
		
		System.out.println("======과제1======");
		
		//방법1.
		
		int j;
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
				if (j<=0) System.out.print("[");
				if (j==m.length)System.out.print(m[i][j]+"]");
				else System.out.print(m[i][j]+", ");
			}//j for문 종료
			System.out.println();
		}//i for문 종료
		
		//방법2.
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m.length;j++) {
			}// j for문 종료
			System.out.println(Arrays.toString(m[i]));
		}// i for문 종료
		
		//2차원 배열 선언하는 방법-2
		
		int[][] e= new int[2][];
		System.out.println(Arrays.toString(e));//배열에 참조하는것을 넣지않아 참조하는것이 없다는 null값이 출력.
		
		e[0]= new int[2];//1반2명
		e[1]= new int[3];//2반3명
		
		//초기화
		try {//예외가 발생할 가능성이 있는 부분
			e[0][0]=85; e[0][1]=99; 
//			e[0][2]=83;//예외객체 생성되면 ->jvm이 예외객체를 던져서
//			e[1][0]=88; e[1][1]=100; e[1][2]=95;//실행되지않고
		} catch (Exception e1) {//잡아서
			e1.printStackTrace();//처리
		}finally {//예외발생 여부에 관계없이 실행
			e[1][0]=88; e[1][1]=100; e[1][2]=95;//여기에넣으면 실행되지않은게 실행됨
		}
		
		e[1][0]=88; e[1][1]=100; e[1][2]=95;//여기에넣거나
		System.out.println(Arrays.toString(e[0]));
		System.out.println(Arrays.toString(e[1]));
		
		/*
		 * 중첩된 for문 이용하여 아래내용 출력
		 * [85, 99]
		 * [88, 100, 95]
		 */
		
		System.out.println("======과제2======");
		
		for (i=0;i<e.length;i++) {
			for(j=0;j<e.length;j++) {
			}// j for문 종료
		}// i for문 종료
		System.out.println(Arrays.toString(e));
		
		//2차원 배열 선언하는 방법-3
		
		int[][] s= new int[2][];
		
		s[0]=new int[] {87, 93};//초기값배열
		s[1]=new int[] {97, 88, 100};
		
		/*
		 * 중첩된 for문 이용하여 아래내용 출력
		 * [87, 93]
		 * [97, 88, 100]
		 */
		
		System.out.println("======과제3======");
		
		for (i=0;i<s.length;i++) {
			for(j=0;j<s.length;j++) {
			}// j for문 종료
		}// i for문 종료
		System.out.println(Arrays.toString(s));
		
		//2차원 배열 선언하는 방법-4
		
		int[][] java= {
				{95, 97},//1반 2명
				{98, 99, 100, 75},//2반 4명
				{100, 88, 92}//3반 3명
		};
		
		//int [][] java = {{95, 97}, {98, 99, 100, 75}, {100, 88, 92}};
		
		/*
		 * 각반의 java 성적의 합과 평균 구하기
		 * java성적의 총 합과 총 평균 구하기
		 */
		
		System.out.println("======과제4======");
		
	}//메인문

}//클래스문
/*******************************************************************************************************/