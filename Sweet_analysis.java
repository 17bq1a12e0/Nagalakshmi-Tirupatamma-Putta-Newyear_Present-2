package epam.com.maven;

import java.util.ArrayList;
import java.util.Scanner;

public class Sweet_analysis {
	static public int S_weight;
	static public int S_price;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Sweets=new ArrayList<String>();
		Sweets.add("Kaja");
		Sweets.add("Malpuri");
		
		
		int price[]=new int[Sweets.size()];
		Kaja k=new Kaja();
		Malpuri m=new Malpuri();
		
		System.out.println("Enter number of sweets do you want?\n");
		System.out.println("Enter number of Kaja Sweet\n");
		int kc=s.nextInt();
		System.out.println("Enter number of Malpuri Sweet\n");
		int lc=s.nextInt();
		
		k.calculate(kc);
		m.calculate(lc);
		price[0]=k.display();
		price[1]=k.display();
		
		System.out.print("Total price of sweets is: ");
		S_price=price[0]+price[1];
		System.out.println(S_price+" Rs\n");
		System.out.print("Total weight of sweets is: ");
		S_weight=m.calculate(m.weight)+k.calculate_w(k.weight);
		System.out.println(S_weight+" grams\n");
		
		
		
	}

}
