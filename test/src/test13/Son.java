package test13;

public class Son extends Father{
//오버라이딩은 상속이 필요하다
//접근 제어자도 똑같다. private<default<protected<public
	void work() {
		System.out.println("나는 개발일을 하지~");
	}
	
	//String work (String a) {
		//return "abc";
	//}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
		//String s1 = s.work("abc");
		//System.out.println(s.work("abc"));
		//==System.out.println(s1);
	
	}
}
