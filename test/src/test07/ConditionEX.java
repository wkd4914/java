package test07;

import java.util.Scanner;

public class ConditionEX {

	public static void main(String[] args) {
		//A의 국어점수,  B의 국어점수 C의 국어점수 입력하고 그에 평균을 구해라
		Scanner scan = new Scanner(System.in);
		System.out.print("A의 국어 점수 : ");
		String ANum = scan.nextLine();
		System.out.print("B의 국어 점수 : ");
		String BNum = scan.nextLine();
		System.out.print("C의 국어 점수 : ");
		String CNum = scan.nextLine();
		
		int A = Integer.parseInt(ANum);
		int B = Integer.parseInt(BNum);
		int C = Integer.parseInt(CNum);
		
		System.out.println((A+B+C)/3); 
		
		
		
		


	}

}
