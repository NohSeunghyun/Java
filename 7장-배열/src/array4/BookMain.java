package array4;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1=new Book("ss", "aa", 1);
		System.out.println(b1);
		b1.setAuthor("dd");
		System.out.println(b1);
//		b1.author="zz";//직접접근값변경.author private이므로 간접접근으로 값변경해야함.
		System.out.println(b1);
		Book b2=new Book("","",2);
		System.out.println(b2);//author private 값확인
	}

}
