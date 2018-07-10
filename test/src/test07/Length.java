package test07;

public class Length {

	public static void main(String[] args) {//sort 클래스의 legth 사용하는 구문
		int size = 10;
		int []arrNum = new int[size];
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 70;
		arrNum[3] = 50;
		arrNum[4] = 40;
		
		for(int i=0; i<arrNum.length; i++) {
		if(arrNum[i]%20==0 && arrNum[i]!=0) {
			System.out.println(arrNum[i]);
			}
		}
		//String str = new String("abc");=
		//String str = "abc 1";
		//system.out.println(str.length());
		//String[] arrStr =new String[5];
		//arrStr[0] = "a";
		//arrStr[1] = "b";
		//arrStr[2] = "c";
		//arrStr[3] = "d";
		//arrStr[4] = "e";
		//for(int i=0; i<arrStr.length; i++){
			//System.out.println(arrStr[i]);}
		String str = "a,b,c,d,e";
		String[] arrStr = str.split(",");
		for(int i=0; i<arrStr.length;i++) {
			System.out.println(arrStr[i]);
		}
		
		
	}
}
