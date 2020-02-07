package epam.com.maven;

public class Malpuri extends Sweetpack{
	int weight=10;
	int price=50;
	public int display() {
		return total;
	}

	public int calculate(int lc) {
		return total=lc*weight;// TODO Auto-generated method stub
		
	}
	public int calculate_c(int n) {
		return total=n*price;
	}

}
