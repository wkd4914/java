package test01;

public class Loop {
	//for문 정확히 정해진것(반복문)
	//while문 이벤트성 정해지지 않은것(반복문x)
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++){
			System.out.println(i);
		}
		
		int i = 1;
		
		for(;i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
	}
}
