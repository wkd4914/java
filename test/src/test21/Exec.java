package test21;

public class Exec {
	
	public static void starts(Drive[] ds) {
		for(Drive d :ds) {
			d.start();
		}
	}
	
	public static void attack(Drive[] ds) {
		for(Drive d :ds) {
			System.out.println(d.attack(30));
		}
	}
	
	public static void stop(Drive[] ds) {
		for(Drive d :ds) {
			d.stop();
		}
	}

	public static void main(String[] args) {
		Drive[] d = new Drive[2];
		d[0] = new Lulu("루루",100,50);
		d[1] = new Solid("솔리드",80,50);
		starts(d);
		attack(d);
		stop(d);
	}

}
