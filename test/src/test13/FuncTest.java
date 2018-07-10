package test13;

public class FuncTest {
	
	//public void printLoop(int start, int end) {
		//for(int i=start; i<=end; i++) {
			//System.out.println(i);
		//}
	//}
	//public static void main(String[] args) {
		//FuncTest ft = new FuncTest();
		//ft.printLoop(1,10);
		//ft.printLoop(3,12);
		//ft.printLoop(100,120);
	//}
	public void reverseLoop(int start, int end) {
		for(int i=start; i>=end; i--) {
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		FuncTest ft = new FuncTest();
		ft.reverseLoop(10, 1);
		ft.reverseLoop(9, 7);
		ft.reverseLoop(1, 10);
	}
	}