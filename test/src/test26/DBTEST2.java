package test26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTEST2 {
	
	public static ArrayList<HashMap<String,String>> userList = new ArrayList<HashMap<String,String>>(); 
	
	public static int insertUser(HashMap<String,String> user) {
		int result = 0;
		int uNum = userList.size()+1;
		try {
			user.put("uNum", uNum+"");
			userList.add(user);
			result = 1;
		}catch(Exception e) {
			System.out.println("지금 코드로 내가 출력될 일은 없어");
		}
		return result;
	}
	
	public static void selectUserList() {
		System.out.println(userList);
	}
	
	public static void inputUser() {
		HashMap<String,String> hm = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("나이를 입력해주세요");
		String age = scan.nextLine();
		hm.put("uName", name);
		hm.put("uAge", age);
		
		int cnt = insertUser(hm);
		if(cnt==1) {
			System.out.println("유저 등록이d 완료 되었습니다.");
		}else {
			System.out.println("뭔지 모르지만 에러야");
		}
	}
	public static void main(String[] args) {
		inputUser();
		inputUser();
		inputUser();
		selectUserList();
	}

	
		



}
