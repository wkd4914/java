package test21;

public class Gun extends Army{

	public Gun(String weight,int damaege,String length) {
		super(weight, damaege, length);
	}
	public String attack(int damaege) {
		return this.damaege + damaege + "로 공격합니다.";
}
}