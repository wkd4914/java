package test15;

public class Exec {

	public static void main(String[] args) {
		//Animal c = new Cat();
		//c= new Cat();
		//c.printInfo();
		Computer c = new PC();
		c.cpu = "I7";
		c.ram = 8;
		c.hdd = "3TB";
		((PC)c).display = "33인치";
		System.out.println(c);
	}

}
