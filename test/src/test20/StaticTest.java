package test20;

public class StaticTest {
	static int a = 10;

	public static void main(String[] args) {
		StaticTest.a = 11;
		System.out.println(a);
		StaticTest st = new StaticTest();
		System.out.println(st.a);
	}
	//final class 매서드 넣을수 있다. final class는 상속을 못받는다 매서드는 오버라이딩이 안된다.
}