package test26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {

	public static ArrayList<HashMap<String,String>> userList = new ArrayList<HashMap<String,String>> ();
	
	public static int insertUser(HashMap<String,String> user){
		int result = 0;
		int uNum = userList.size()+1;
		try {
			user.put("uNum", uNum+"");
			userList.add(user);
			result = 1;
		}catch(Exception e){
			System.out.println("지금 코드로 내가 출력될일은 없어");
		}
		return result;
	}
	
	public static void selectUserList() {
		for(int i=0;i<userList.size();i++) {
			HashMap<String,String> user = userList.get(i);
			System.out.println((i+1) + "번째 유저 정보 : " + user);
			}
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
			System.out.println("유저등록이 완료되었습니다.");
		}else {
			System.out.println("뭔지 모르지만 에러 났어요");
		}
	}
	public static HashMap<String,String> getUser(String uName){
		for(int i = 0; i<userList.size();i++) {
			HashMap<String,String> user = userList.get(i);
			if(user.get("uName").equals(uName)) {
				return user;
			}
		}
		return null;
	}
	public static int userIndexOf(String uName) {
		for(int i=0; i<userList.size();i++) {
			HashMap<String,String> user = userList.get(i);
			if(user.get("uName").equals(uName)) {
				return i;
			}
		}
		return -1;
		
	}
	public static void removeUser(HashMap<String,String>user) {
		userList.remove(user);
	}
	public static void removeUser1(HashMap<String, String> searchUser) {
		userList.remove(searchUser);
	}
	public static void main(String[] args) {
		inputUser();
		inputUser();
		inputUser();
		selectUserList();
		int idx = userIndexOf ("홍길동");
		if(idx != -1) {
			removeUser(idx);
		}
		HashMap<String,String> searchUser = getUser("홍길동"); 
		if(searchUser != null) {
			removeUser(searchUser);
		}
		System.out.println("검색된 유저 :" + searchUser);
	}

	}
