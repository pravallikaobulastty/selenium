package conditional_statements;

import java.util.Scanner;

public class Greatest_Of_Two_Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A B values");
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		if(a>b)
			System.out.println("A is greater");
		else if(b>a)
			System.out.println("B is greater");
		else 
			System.out.println("A B are equal");
		
	}

}
