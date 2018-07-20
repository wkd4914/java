package test26;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("abc1");
		strList.add("abc2");
		strList.add("abc3");
		strList.add("abc4");
		
		int idx = -1; // --------------삭제할것 찾는것
		for(int i=0; i<strList.size();i++) {
			String str = strList.get(i);
			if(str.equals("abc1")) {
				idx = i;
			}
		}
		
		
		System.out.println("삭제 전 : " + strList);  
		if(idx != -1) {
			strList.remove(idx);
		}
		System.out.println(strList);
	}

}
