package test23;

import java.util.Scanner;
public class StringToNumber {
	static Scanner scan = new Scanner(System.in);
	static int num =0;
	public static boolean parseInt() {
		try {
			System.out.println("숫자를 입력해주세요");
			num = Integer.parseInt(scan.nextLine());
			return false;
		}catch(NumberFormatException nfe) {
			System.out.println("입력하라는 숫자는 입력안하고");
		}
		    return true;
	}

	public static void main(String[] args) {
		System.out.println("숫자 변환 프로그램을 시작합니다");
		boolean isOk = true;
		while(isOk) {
			isOk = parseInt();
		}
		Integer.getInteger("123");
		System.out.println("니가 입력한 숫자는"+ num + "이구나");
		System.out.println("프로그램이 정상 종료 되었습니다");
		
		
		
		
		//System.out.println("숫자 변환 프로그램을 시작합니다");
		//Scanner scan = new Scanner(System.in);
		//System.out.println("숫자를 입력해주세요");
		//int num = 0;
		//boolean isOk = true;
		//while(isOk) {
		//try {
			//num = Integer.parseInt(scan.nextLine());
			//isOk=false;
		//}catch(NumberFormatException nfe) {
			//System.out.println("입력하라는 숫자는 입력안하고");
		//}
		//}
		//System.out.println("니가 입력한 숫자는"+ num + "이구나");
		//System.out.println("프로그램이 정상 종료 되었습니다");
	}
}

