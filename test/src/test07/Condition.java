package test07;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Scanner scan = new Scanner(System.in);
		System.out.print("시작값을 정해주세요 : ");
		String startNum = scan.nextLine();
		System.out.print("종료값을 정해주세요 : ");
		String endNum = scan.nextLine();
		
		//System.out.printf("start : %s, end : %s", startNum, endNum);
		scan.close();
		
		int sNum = Integer.parseInt(startNum); //parseint = 분석하라(int로 분석하라)
		int eNum = Integer.parseInt(endNum); 
		
		if(sNum>eNum) {
			int tmp = sNum; // tmp = temp 의 약자(임시저장)
			sNum = eNum;
			eNum = tmp;
		}
		
		for(int i = sNum; i<=eNum; i++) {
			System.out.println(i);
		}
		scan.close();
		
		
		
	}

}
