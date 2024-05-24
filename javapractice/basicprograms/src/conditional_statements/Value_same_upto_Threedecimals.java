package conditional_statements;

import java.util.Scanner;

public class Value_same_upto_Threedecimals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two floating number");
		double a,b;
		a=scan.nextDouble();
		b=scan.nextDouble();
		a=a/1000;
		b=b/1000;
		if(a==b)
			System.out.println("Number is same upto three decimals");
		else
			System.out.println("Number is not same upto three decimals");
	}

}
