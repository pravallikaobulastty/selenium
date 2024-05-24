package conditional_statements;

import java.util.Scanner;

public class Greatest_Of_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A B C");
		int a,b,c;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a==b && a==c)
			System.out.println("A B C are equal");
		else if(a>b && a<c)
			System.out.println("A is greater");
		else if(b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");
	}

}
