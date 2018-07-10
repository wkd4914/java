package test11;

public class Cat {
	public String name;
	private int age;
	String type;

	public void setAge(int age) {
		this.age = age;
		System.out.println(name + "고양이의 나이는" + this.age);
	}
}