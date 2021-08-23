import java.util.Arrays;

public class Project6 {

	public static void main(String[] args) {
		
		/*
		 * ==과제1==
		 * 중첩된 for문을 이용하여 아래내용 출력
		 * [95, 100, 87]
		 * [83, 92, 78] 
		 */
		
		int[][]m=new int[2][3];
		
		m[0][0]=95; m[0][1]=100; m[0][2]=87;
		m[1][0]=83; m[1][1]=92; m[1][2]=78;

		//방법1.
		
		System.out.println("과제1-방법1");
		
		int i;
		int j;
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
				if (j==0) System.out.print("[");
				if (j==m.length)System.out.print(m[i][j]+"]");
				else System.out.print(m[i][j]+", ");
			}// j for문 종료
			System.out.println();
		}// i for문 종료
		
		//방법2.
		
		System.out.println("과제1-방법2");
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
			}// j for문 종료
			System.out.println(Arrays.toString(m[i]));
		}// i for문 종료

		//★★방법3.(선생님)//출력문에 조건연산자 사용한것.공부해두기
		
		System.out.println("과제1-방법3");
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
				if(j==0) System.out.print("[");
				System.out.print(m[i][j]+((j!=m[i].length-1)?", ":"]\n"));
			}//j for문 종료
		}//i for문 종료
		
		//방법4.(선생님)=방법1과 같다
		
		System.out.println("과제1-방법4");
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
				if(j==0) System.out.print("[");
				if(j!=m[i].length-1)System.out.print(m[i][j]+", ");
				else System.out.print(m[i][j]+"]");
			}//j for문 종료
			System.out.println();
		}//i for문 종료
		
		/*
		 * ==과제2==
		 * 중첩된 for문을 이용하여 아래내용 출력
		 * [85, 99]
		 * [88, 100, 95] 
		 */
		
		int[][] e= new int[2][];
		
		e[0]= new int[2];
		e[1]= new int[3];		
		
		try {
			e[0][0]=85; e[0][1]=99;

		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			e[1][0]=88; e[1][1]=100; e[1][2]=95;
		}
		
		//방법1.
		
		System.out.println("과제2-방법1");
		
		for(i=0;i<e.length;i++) {
			for(j=0;j<e[i].length;j++) {
			}// j for문 종료
			System.out.println(Arrays.toString(e[i]));
		}// i for문 종료
		
		//방법2.(선생님)
		
		System.out.println("과제2-방법2");
		
		for(i=0;i<e.length;i++) {
			for(j=0;j<e[i].length;j++) {
				if(j==0)System.out.print("[");
				System.out.print(e[i][j]+((j!=e[i].length-1)?", ":"]\n"));
			}// j for문 종료
		}// i for문 종료
		
		/*
		 * ==과제3==
		 * 중첩된 for문을 이용하여 아래내용 출력
		 * [87, 93]
		 * [97, 88, 100] 
		 */
		
		int[][] s= new int[2][];
		
		s[0]=new int[] {87, 93};
		s[1]=new int[] {97, 88, 100};
		
		//방법1.
		
		System.out.println("과제3-방법1");
		
		for(i=0;i<s.length;i++) {
			for(j=0;j<s[i].length;j++) {
			}// j for문 종료
			System.out.println(Arrays.toString(s[i]));
		}//i for문 종료
		
		//방법2.(선생님)
		
		System.out.println("과제3-방법2");
				
		for(i=0;i<s.length;i++) {
			for(j=0;j<s[i].length;j++) {
				if(j==0)System.out.print("[");
				System.out.print(s[i][j]+((j!=s[i].length-1)?", ":"]\n"));
			}// j for문 종료
		}// i for문 종료
		
		/*
		 * ==과제4==
		 * 각반의 java 성적의 합과 평균 구하기
		 * java성적의 총 합과 총 평균 구하기
		 */
		
		int[][] java= {
				{95, 97},//1반
				{98, 99, 100, 75},//2반
				{100, 88, 92}//3반
		};
		
		//방법1.
		
		System.out.println("과제4-방법1");
		
		int totalsum=0;//총합
		double totalavg=0;//총평균
		int sum1=0;//1반합
		int sum2=0;//2반합
		int sum3=0;//3반합
		double avg1=0;//1반평균
		double avg2=0;//2반평균
		double avg3=0;//3반평균
		int count=0;//총평균을 구하기위한 변수
		for(i=0;i<java.length;i++) {//java성적의 총합과 총평균
			for(j=0;j<java[i].length;j++) {//각반의 java 성적의 합과 평균
				totalsum+=java[i][j];
				count++;
				if(i==0) {
					sum1+=java[0][j];
				}//1반
				if(i==1) {
					sum2+=java[1][j];
				}//2반				
				if(i==2) {
					sum3+=java[2][j];
				}//3반
			}//j for문 종료
			if(i==0) {
				avg1+=(double)sum1/java[i].length;
				System.out.println((i+1)+"반의 합="+sum1+", 평균="+avg1+"입니다.");
			}//1반
			if(i==1) {
				avg2+=(double)sum2/java[i].length;
				System.out.println((i+1)+"반의 합="+sum2+", 평균="+avg2+"입니다.");
			}//2반
			if(i==2) {
				avg3+=(double)sum3/java[i].length;
				System.out.println((i+1)+"반의 합="+sum3+", 평균="+avg3+"입니다.");
			}//3반
		}//i for문 종료
		totalavg+=(double)totalsum/count;
		System.out.println("java성적의 총 합="+totalsum+", 평균="+totalavg+"입니다.");
		
		//★★방법2.(선생님)
		
		System.out.println("★★과제4-방법2");
		
		//각반의 java성적의 합과 평균 구하기
		
		int sum;
		for(i=0;i<java.length;i++) {
			sum=0;
			for(j=0;j<java[i].length;j++) {
				sum=sum+java[i][j];//sum+=java[i][j];
			}//j for문 종료
			System.out.println(i+1+"반의 합="+sum+", 평균="+(double)sum/java[i].length);
		}//i for문 종료
		
		//java성적의 총합과 총평균 구하기
		
		totalsum=0;//방법1에 변수선언 했기때문에 타입선언은생략 초기화만
		count=0;
		for(i=0;i<java.length;i++) {
			for(j=0;j<java[i].length;j++) {
				totalsum+=java[i][j];
				count++;
			}//j for문 종료
			//count로 학생수를 하나하나 카운트하지말고 다른방법으로 할 수 있다.
			//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
			//j for문 밖에 써야함.
			//count+=java[i].length;
		}//i for문 종료
		System.out.println("총 합="+totalsum+", 평균="+(double)totalsum/count);
		
		System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓각반의 성적 합과 평균, 총 성적 합과 평균 합치기↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
		
		totalsum=0;
		count=0;
		for(i=0;i<java.length;i++) {
			sum=0;
			for(j=0;j<java[i].length;j++) {
				totalsum+=java[i][j];
				sum=sum+java[i][j];
			}//j for문 종료
			count+=java[i].length;
			System.out.println(i+1+"반의 합="+sum+", 평균="+(double)sum/java[i].length);
		}//i for문 종료
		System.out.println("총 합="+totalsum+", 평균="+(double)totalsum/count);
		
	}//메인문

}//클래스문
/*******************************************************************************************************/