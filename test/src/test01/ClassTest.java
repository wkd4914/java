package test01;

public class ClassTest {

	int a = 3;
	
	void test(String name) {//메소드의 선언
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ClassTest ct1 = new ClassTest();// 초기화
		String sr = "asd";//메소드 호출
		ct1.test(sr);
	}
}