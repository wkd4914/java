package test13;

public class MethodTest {

	public void print() {
		System.out.println("프린트 함수");
	}
	//public void print(int a) {
		//System.out.println("인트프린트 함수");
	//}
	
	///public void print(String a) {
			///System.out.println("인트프린트 함수");
		///}
	
	
	////public void print(String a,int b) {
	////System.out.println("인트프린트 함수");
     ////}
    /////public void print(String b,int a) {
	/////System.out.println("인트프린트 함수");
     /////} 같은 함수를 가지고 다른일을 하고 싶을 때 "오버 로딩"(상속과는 상관없다)
	
	
	
	public static void main(String [] args) {
		MethodTest mt = new MethodTest();
		mt.print();
	//public static void main(String [] args) {
		//MethodTest mt = new MethodTest();
		//mt.print(1);
	///public static void main(String [] args) {
		///MethodTest mt = new MethodTest();
		///mt.print("장대석");	
	}
}