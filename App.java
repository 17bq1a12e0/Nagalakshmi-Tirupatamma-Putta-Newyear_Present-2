package epam.com.maven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter maximum price of New Year Gift");
        int mp=s.nextInt();
        ArrayList<String> Candies=new ArrayList<String>();
        ArrayList<String> Chocolates=new ArrayList<String>();
        //Candiespack.add("gems");
        //Candiespack.add("Sweetballs");
        Chocolates.add("Fivestar");
        Chocolates.add("Perk");
        
       
        
        System.out.println("CandiesPack class\n");
        Candies_analysis.main(args);
        
        System.out.println("ChoclatesPack class\n");
        Choco_analisys.main(args);
        System.out.println("SweetPack class\n");
        Sweet_analysis.main(args);
        
        int total_weight=0;
        total_weight=Sweet_analysis.S_weight+Candies_analysis.Candiespack_weight+Choco_analisys.tw_choco;
        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");
        
        int total_price=0;
        total_price=Sweet_analysis.S_price+Candies_analysis.Candiespack_price+Choco_analisys.tc_choco;
        if(mp<total_price) {
        	System.out.println("Gift price more than expected. Please get within range");
    }
        else {
        	System.out.println("Total price of the gift is"+total_price+"Rs.");
        }
        
        
        
        
        
        
    }
}
