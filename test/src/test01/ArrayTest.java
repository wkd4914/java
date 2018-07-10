package test01;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[0]); // 0번째 방의 값
		arr = new int[3]; // arr의 데이터값이 바뀐다
		System.out.println(arr[0]);
		
	}

}
