package test27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5; i++) {
			System.out.println("이름을 입력해주세요");
			String name = scan.nextLine();
			System.out.println("나이를 입력해주세요");
			int age = Integer.parseInt(scan.nextLine());
			pList.add(new Person(name,age));
		}
		for(int i=0;i<5; i++) {
			System.out.println(pList.get(i).getName());
			System.out.println(pList.get(i).getAge());
		}
}
}
