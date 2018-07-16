package test22;

import java.util.ArrayList;
//import java.util.ArrayList; (ctrl shift o)
public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//al.add(31);
		//al.add(20);
		
		for(int i=0; i<6; i++) {
		int num = (int)(Math.random()*45);
		System.out.println(num);
		al.add(num);
		}
		//오른쪽은 배열(index0~&)
		for(int num : al) {
			System.out.println(num);
		}
	}
}
