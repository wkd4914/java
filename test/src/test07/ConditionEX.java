package test07;

import java.util.Scanner;

public class ConditionEX {

	public static void main(String[] args) {
		// ABC의 국어점수를 구하고 그에 따른 우선순위를 정하라
		Scanner scan = new Scanner(System.in);
		System.out.print("A의 국어 점수 : ");
		int a = scan.nextInt();
		System.out.print("B의 국어 점수 : ");
		int b = scan.nextInt();
		System.out.print("C의 국어 점수 : ");
		int c = scan.nextInt();
		//int A = Integer.parseInt(ANum);
		//int B = Integer.parseInt(BNum);
		//int C = Integer.parseInt(CNum);
		int[] arr = new int[3];
		arr[0] = a;	
		arr[1] = b;
		arr[2] = c;
		for(int i=0; i<=2; i++) {
			System.out.println(i);
		}
	}

}
