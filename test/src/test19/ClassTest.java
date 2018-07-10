package test19;

public class ClassTest {
	int num;
	String str;
	
	public void test() {
		System.out.println("전 누구건가요?");
	}
	public static void main(String[] args) {
		ClassTest A = new ClassTest();
		System.out.println(A.num);
		A.test();
		//A.test();//왼쪽이 부르는 아이, 오른쪽이 불러드리는 값
	}

}
