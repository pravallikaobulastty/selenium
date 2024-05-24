package basicprograms;
import java.util.Scanner;
public class Costprice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter total selling price 15 items");
		float sp=scan.nextFloat();
		System.out.println("enter total profit of 15 items");
		float prof=scan.nextFloat();
		float cp;
		cp=sp-prof;
		cp=cp/15;
		System.out.println("cost of single item= "+cp);
	}

}
