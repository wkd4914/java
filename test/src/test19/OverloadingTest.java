package test19;

public class OverloadingTest {
	int a = 3;
	
	public void test() {
		
	}
	public int test(int a) {
		return 0;
	}
	public int test(String a) {
		return 0;
	}
	public void test(int a,String b) {
		
	}
	public void test(String b,int a) {
		
	}
	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		ot.a = 10;
		ot.test();
		ot.test(2);
	}

}
