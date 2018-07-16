package test21;

public class Exec2 {
	
	public static void attack(Weapon[] ws) {
		for(Weapon w:ws) {
			System.out.println(w.attack(50));
		}
	}
	public static void length(Weapon[] ws) {
		for(Weapon w:ws) {
			w.length();
		}
	}
	public static void weight(Weapon[] ws) {
		for(Weapon w:ws) {
			w.weight();
		}
	}

	public static void main(String[] args) {
		Weapon[] w = new Weapon[2];
		w[0] = new Gun("가볍다", 50,"짧습니다");
		w[1] = new Sword("무겁다",70,"깁니다");
		weight(w);
		length(w);
		attack(w);
		
	}

}
