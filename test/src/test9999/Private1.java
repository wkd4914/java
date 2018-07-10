package test9999;

import java.util.Scanner;

import test12.Car;

public class Private1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car c = new Car();
		System.out.print("회사명을 입력해주세요 : ");
		c.company("");
		String string = scan.nextLine();
		System.out.print("자동차명을 입력해주세요 : ");
		c.name("");
		int  = scan.nextInt();
		System.out.print("속도를 입력해주세요");
		c.speed(scan.nextInt());
		String startNum = scan.nextLine();
	}
}
