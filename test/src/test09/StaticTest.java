package test09;

public class StaticTest {
	static int numSt =10;
	int num = 20;
	
	public static void main(String[] args) {
		//StaticTest.numSt = 30;
		//StaticTest st = new StaticTest();
		//st.num =100;
		//st.numSt = 100;
		//System.out.println(st.num);
		//System.out.println(st.numSt);
		//st = new StaticTest();
		//System.out.println(st.num);
		//System.out.println(st.numSt);
		//StaticTest st2 = new StaticTest();
		//System.out.println(st2.num);
		//System.out.println(st2.numSt);
		//System.out.println(StaticTest.numSt);
		
		Test t = new Test();
		t.chNum();
		System.out.println(StaticTest.numSt);
		StaticTest.numSt = 30;
		t.chNum();
		System.out.println(StaticTest.numSt);
	}
}
