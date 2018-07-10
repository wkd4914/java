package test09;

public class Obj {
	int num = 3;
	boolean bl = true;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return 1;
	}
	
	private String getStr() {
		return "abc";
	}
	
	//int getNum() {
	//	return 1;
	//}
	//String getStr() {
		
	//}
	
	void test() {
		int num =10;
		System.out.println(this.num);
		System.out.println(num);
		System.out.println("난 obj의 테스트 함수");
	}
	
	void test2() {
		boolean num = true;
		System.out.println(num);
		System.out.println(bl);
		test();
	}
	
	public static void main(String[] args) {
		Obj o = new Obj();
		o.num = 10;
		o.test();
	}
}