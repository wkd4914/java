package test01;

public class JavaTest {

	
	public static void main(String[] args) {
		int[] A = new int[3];
		A[0] = 2;
		A[1] = 2;
		A[2] = 2;
		int[] tmpArr = A;
		
		A = new int[5];
		A[0] = tmpArr[0];
		A[1] = tmpArr[1];
		A[2] = tmpArr[2];
		for(int i=0; i<A.length;i++) {
			System.out.println(i);
		}
	}
}
