package study;

import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("당신의 이름을 적어주세요");
		String A = scan.nextLine();
		
		
		System.out.print("당신의 나이를 적어주세요");
		int B = scan.nextInt();
		
		System.out.print("당신의 성별을 적어주세요");
		String C = scan.nextLine();
	}

}
