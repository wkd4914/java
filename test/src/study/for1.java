package study;

public class for1 {

	public static void main(String[] args) {
		for(int i =2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			if (i == j) {
				System.out.println("안되");
			}
			}
		}
	}
}