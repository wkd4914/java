package test19;

public class FunkTest {
	
	public void add(int a, int b) {
		System.out.println("인트 더하기 : " + (a+b));
	}
	public void add(long a, long b) {
		System.out.println("롱더하기 : "+ (a+b));
	}

	public static void main(String[] args) {
		FunkTest A = new FunkTest(); 
		//FunkTest ft; 선언
		//FunkTest A = new FunkTest(); 메모리 생성
		A.add(1234456,21321456 );
		A.add(12,123);
	}
}