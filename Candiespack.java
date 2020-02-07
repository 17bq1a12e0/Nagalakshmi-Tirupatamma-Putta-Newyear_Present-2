package epam.com.maven;

public class Candiespack extends App{
	int quantity;
	static int range=100;
}

class Sweetballs extends Candiespack{
	int jweight = 4;
	int price = 5;
	public int display() {
		return quantity;
	}
	public void quantity(int n) {
		quantity=n;
	}
	public int c_weight(int n) {
		return jweight*n;
	}
	public int c_price(int n) {
		return price*n;
	}
}

class Gems extends Candiespack{
	int lweight = 9;
	int price = 8;
	public int display() {
		return quantity;
	}
	public void quantity(int n) {
		quantity=n;	
	}
	public int c_weight(int n) {
		return lweight*n;
	}
	public int c_price(int n) {
		return price*n;
	}
}
