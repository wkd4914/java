package test12;

import java.util.Scanner;

public class Car {

	private int speed;
	private String name;
	private String company;
// 	
//  접근 제어자 (static)데이터타입(리턴값이 있을시)  메소드의 이름(){
//	           (리턴값이 없을때 void)

	public void make(String company) {//private -> public 으로 변환 하면서  
		this.company = company;
	}
	
	public String give() {// private이므로 car클래스에서 불러 올수 없으므로 리턴값으로 호출을 한다.
		return company;
	}
	
	
	
	public static void main(String [] args) {
		
	}
	
}