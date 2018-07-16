package test20;

public class ForEachTest {

	public static void main(String[] args) {
		String[] arrStr = new String[4];
		for(int i=0; i<arrStr.length;i++) {
			arrStr[i] = "테스트" + i;
			System.out.println(arrStr[i]);
		
		}
		for(String str:arrStr) {
			System.out.println(str);
		}
		String[]arr = {"민우","현경","승현"};
		System.out.println(arr[1]);
		String[][] multiArr = {{"1","2","3"},{"4"},{"6","7","8"}};
		for(String[] strs:multiArr) {
			for(String str : strs) {
				System.out.println(str);
			}
		}
	}
}