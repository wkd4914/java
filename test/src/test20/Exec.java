package test20;

public class Exec {

	public static void eat(Action p) {
		p.eat();
	}
	public static void main(String[] args) {
		Action act = new Animal();
		act = new Person();
		eat(act);
		eat(new Animal());
		eat(new Person());
		//act.eat();
		//act.move();
		//Animal ani = (Animal) act; 애니멀이라는 클래스에서 액트라는 값만 따로 출력할때 사용한다.
		//act = new Person();
		//act.eat();
		//Person per = (Person) wokr; 
		//act.(Person)work;
	}
}