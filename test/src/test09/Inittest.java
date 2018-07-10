package test09;

public class Inittest {
	int n = 10;
	String str ="abc";
	Inittest(){
		
	}
	public static void main(String[] args) {
		Inittest it = new Inittest();
		it.n = 20;
		System.out.println(it.n);
		it = new Inittest();
		System.out.println(it.n);
		
	}
}
