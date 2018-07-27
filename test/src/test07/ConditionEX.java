package test07;

import java.util.Scanner;

public class ConditionEX {

	public static void main(String[] args) {
		// ABC의 국어점수를 구하고 그에 따른 우선순위를 정하라
		Scanner scan = new Scanner(System.in);
		System.out.print("A의 국어 점수 : ");
		int a = scan.nextline();
		System.out.print("B의 국어 점수 : ");
		int b = scan.nextInt();
		System.out.print("C의 국어 점수 : ");
		int c = scan.nextInt();
		//int A = Integer.parseInt(ANum);
		//int B = Integer.parseInt(BNum);
		//int C = Integer.parseInt(CNum);
		System.out.println(a+b+c);
		
	}

}
