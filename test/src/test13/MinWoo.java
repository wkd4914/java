package test13;
class coffee{
	
}

public class MinWoo {
	
	public void doEat() {
		System.out.println("민우씨가 밥을 먹지");
	}
	
	public coffee getcoffee(int money) {
		return new coffee();
	}
	
	public static void main(String[] args) {
		MinWoo mw = new MinWoo();
		mw.doEat();
	}

}
