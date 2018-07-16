package test21;

public class Army implements Weapon {
	protected int damaege;
	protected String weight;
	protected String length;
	
	public Army(String weight, int damaege, String length) {
		this.damaege = damaege;
		this.weight = weight;
		this.length = length;
	}
	

	@Override
	public String attack(int damaege) {
		return damaege + "로 공격합니다.";
	}

	@Override
	public void length() {
		System.out.println("깁니다.");
	}

	@Override
	public void weight() {
		System.out.println("무겁습니다.");
	}
	
}