package test12;

import java.util.Scanner;

public class Car {

	private int speed;
	private String name;
	private String company;
// 	
//  접근 제어자 (static)데이터타입(리턴값이 있을시)  메소드의 이름(){
//	           (리턴값이 없을때 void)

	public void make(String company) {
		this.company = company;
	}
	
	public String give() {
		return company;
	}
	
	
	
	public static void main(String [] args) {
		
	}
	
}