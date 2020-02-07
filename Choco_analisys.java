package epam.com.maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Choco_analisys {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
    	Fivestar f = new Fivestar();
    	Perk p = new Perk();
    	
    	
    	System.out.println("Enter quantity of Fivestar: ");
    	int fq = scan.nextInt();
    	
    	System.out.println("Enter quantity of Perk: ");
    	int pq = scan.nextInt();
    	System.out.println("Enter size of Fivestar ");
    	f.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of Perk");
    	p.getsize(scan.nextInt());
    	
    	System.out.println("Enter price of Fivestar: ");
    	f.price = scan.nextInt();
    	
    	System.out.println("Enter price of Perk: ");
    	p.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = f.display();
    	int ss = p.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("Fivestar");
        		ch.add("Perk");
        	}
        	else{
        		ch.add("Perk");
        		ch.add("Fivestar");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Perk");
    		ch.add("Fivestar");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input!Please Enter valid input");
    		return;
    	}
    	
    	tw_choco = f.t_weight(fq) + p.t_weight(pq);
    	System.out.println(tw_choco +" Grms");
    	
    	tc_choco = f.t_price(fq) + p.t_price(pq);
    	System.out.println(tc_choco +" Rc.");
	}
	
}


