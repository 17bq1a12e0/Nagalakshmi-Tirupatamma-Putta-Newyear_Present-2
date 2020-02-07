package epam.com.maven;

import java.util.Scanner;

public class Candies_analysis {

	public static int Candiespack_weight=5;
	public static int Candiespack_price=10;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of Candiespack: " + Candiespack.range);
    	Sweetballs sw = new Sweetballs();
    	Gems ge = new Gems();
    	System.out.println("Enter Quantities of Sweetballs");
    	sw.quantity(scan.nextInt());
    	System.out.println("Enter Quantities of Gems");
    	ge.quantity(scan.nextInt());
    	if(sw.quantity+ge.quantity<=Candiespack.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candiespack");
    	int o = scan.nextInt();
    	if(o==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(sw.display()<=qun) {
    			System.out.println("Sweetballs are in range of "+qun);
    			System.out.println("No of Sweetballss are : "+sw.display());
    		}
    		else {
    			System.out.println("Gems are in range of "+qun);
    			System.out.println("No of Gems are : "+ge.display());
    		}
    	}
    	else if(o==2) {
        	int total_range = sw.display()+ge.display();
        	if(total_range<Candiespack.range) {
        		System.out.println("Candiespack are with in range");
            	System.out.println("Total number of Candiespack in the present are : " + total_range);
        	}
        	else {
        		System.out.println("Candiespack are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	Candiespack_weight = ge.c_weight(ge.quantity)+sw.c_weight(sw.quantity);
    	System.out.println("Total weight of Candiespack: "+Candiespack_weight+" grms\n");
    	
    	Candiespack_price = ge.c_price(ge.quantity) + sw.c_price(sw.quantity);
    	System.out.println("Total price of Candiespack: "+Candiespack_price+" Rs.\n");
    	}
    	else {
    		System.out.println("Candiespack out of range");
    		return;
    	}
	}
}

