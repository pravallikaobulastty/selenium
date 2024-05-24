package conditional_statements;

import java.util.Scanner;

public class Profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter cost price");
		float cp=scan.nextFloat();
		System.out.println("enter selling price");
		float sp=scan.nextFloat(),profit,loss;
		if(sp>cp)
		{
			profit=sp-cp;
			System.out.println("Made profit with: "+profit);
		}
		else if(sp<cp)
	
		{
			loss=cp-sp;
			System.out.println("Made loss with: "+loss);
		}
		else
			System.out.println("there is not loss or profit");

	}

}
