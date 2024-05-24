package conditional_statements;

import java.util.Scanner;

public class Positive_Or_Negative_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		if(n>0)
			System.out.println("Positive number");
		else if(n<0)
			System.out.println("Negative number");
		else
			System.out.println("Number is zero");

	}

}
