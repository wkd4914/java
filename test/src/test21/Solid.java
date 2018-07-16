package test21;

public class Solid extends Cart {

	public Solid(String name, int speed, int damaege) {
		super(name, speed, damaege);
	}
	public String attack(int dameage) {
		return this.damaege + damaege + "만큼 공격합니다.";
	}
}
