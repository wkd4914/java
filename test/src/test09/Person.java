package test09;

public class Person {

	
		private String name;
		private int age;
		private String adress;
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		//public String toString() {
			//return "내이름은 :" + this.name;
			//String str = "내이름은 : " + this.name;
			//str += ",나이는 : " + this.age;
			//str += ",주소는 : " + this.adress;
			//return str;
		public String getname() {
			return this.name;
		}
		
		
}