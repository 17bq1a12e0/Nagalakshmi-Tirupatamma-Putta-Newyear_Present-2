package epam.com.maven;

public class Kaja extends Sweetpack {
	int weight=20;
	int price=25;
	public int display() {
		return total;
	}

	public int calculate_w(int kc) {
		return total=kc*weight;// TODO Auto-generated method stub
		
	}
	public int calculate(int n) {
		return total=n*price;
	}


	

}
