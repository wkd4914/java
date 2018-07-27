package test27;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		List<Number> al = new ArrayList<Number>();
		al.add(10);
		al.add(10.1);
		
		for(Number n:al) {
			System.out.println(n);
		}
		for(int i=0;i<al.size();i++) {
			al.set(i, 30+i);
			System.out.println(al.get(i));
		}
	}
}