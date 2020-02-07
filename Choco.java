package epam.com.maven;

public class Choco {
	int size;
	int price;
}

class Fivestar extends Choco{
	int dweight = 50;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int t_weight(int n) {
		return dweight*n;
	}
	public int t_price(int n) {
		return price*n;
	}
}

class Perk extends Choco{
	int sweight = 30;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int t_weight(int n) {
		return sweight*n;
	}
	public int t_price(int n) {
		return price*n;
	}
}