package test21;

public class TraningCart extends Cart{
	
public TraningCart(String name, int speed, int damaege) {
	super(name, speed, damaege);
}

public void stop() {
	System.out.println(name+"이 정차합니다.");
}
}