package test07;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로 구분하여 입력!");
		String pointStr = scan.nextLine();
		scan.close();
		
		String[] arrStr = pointStr.split(".");
		int[] arrNum = new int[arrStr.length];
		//for(int i=0; i<arrStr.length;i++) {
		//	System.out.println((i+1)+"번째 점수 :" + arrStr[i]);}
		
		for(int i=0; i<arrStr.length;i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
		}
		
		for(int i = 0; 1 < arrNum.length; i++) {
			for(int j = i + 1; i<arrNum.length; j++) {
				if(arrNum[i]> arrNum[j]) {
					int tmp = arrNum[j];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}

		
	}

}
