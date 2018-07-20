package test23;


import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		//키 벨류 맵이 가지고 있는 배열기능
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("이름", "장대석");
		hm.put("주소", "부천");
		hm.put("애완동물이름", "두방이");
	    
		String name = hm.get("이름");
		System.out.println(name);	
	}
}
