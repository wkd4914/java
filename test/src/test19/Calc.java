package test19;

public class Calc {
	//더하기 add
	//빼기 minus
	//곱하기 multiple
	//나누기 divide
	public void add(int a, int b) {
		System.out.println("더하기"+(a+b));
	}
	public void minus(int a, int b) {
		System.out.println("빼기"+(a-b));
	}
	public void multiple(int a, int b) {
		System.out.println("곱하기"+(a*b));
	}
	public void divide(int a, int b) {
		System.out.println("나누기"+(a/b));
	}
	//public void calc(String op, int num1, int num2) {
		//if(op.equals("+")) {//equals 값이 같다면
		//	add(num1,num2);
		//}
	//}
	private static void main(String[] args) {
		Calc C = new Calc();
		C.add(1, 2);
		C.minus(2, 3);
		C.multiple(4, 5);
		C.divide(6, 6);
	}
}