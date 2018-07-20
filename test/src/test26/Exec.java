package test26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test26.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		ArrayList<HashMap<String, String>> userList = udao.selectUserInfoList(null);
		System.out.println(userList);
		for(int i=0; i<userList.size();i++) {
			System.out.println(userList.get(i));
		}
		HashMap<String,String> userInfo = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("몇분등록하시겠어요?");
		int max = Integer.parseInt(scan.nextLine());
		for(int i=0; i<max; i++) {
			System.out.println("이름을 입력하세요");
			String name = scan.nextLine();
			System.out.println("나이를 입력하세요");
			String age = scan.nextLine();
			System.out.println("기타 사항을 입력하세요");
			String etc = scan.nextLine();
			userInfo.put("uiName", name);
			userInfo.put("uiAge", age);
			userInfo.put("uiEtc", etc);
			if(udao.insertUerInfo(userInfo)==1) {
				System.out.println("등록성공!");
			}else {
				System.out.println("등록실패");
			}
		}			
		}
	}

