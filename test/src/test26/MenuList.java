package test26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {
	private static ArrayList<HashMap<String,String>> menuList
	= new ArrayList<HashMap<String,String>>();
	
	public static int insertMenu(HashMap<String,String> menu) {
		int result = 0;
		int uNum = menuList.size()+1;
		try {
			menu.put("uNum", uNum+"");
			menuList.add(menu);
			result = 1;
		}catch(Exception e) {
			System.out.println("이건 아니야");
		}
		return result;
	}
	public static void inputData() {
		HashMap<String,String> hm = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 입력해주세요");
		String menu = scan.nextLine();
		System.out.println("가격을 입력해주세요");
		String price = scan.nextLine();
		System.out.println("인분을 적어주세요");
		String mount = scan.nextLine();
		hm.put("uMenu", menu);
		hm.put("uPrice", price);
		hm.put("uMount", mount);
		
		int cnt = insertMenu(hm);
		if(cnt==1) {
			System.out.println("메뉴추가가 완료되었습니다.");
		}else {
			System.out.println("에러야");
		}
	}
	public static void main(String[] args) {
		inputData();
		System.out.println(menuList);
	}
}
