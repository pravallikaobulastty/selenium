package conditional_statements;

import java.util.Scanner;

public class Calculator_Using_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		System.out.println("Enter the operator");
		String op=scan.next();
		if(op.equals("add"))
		{
			c=a+b;
			System.out.println("Addition of two number is : "+c);
		}
		else if(op.equals("subraction"))
		{
			c=a-b;
			System.out.println("Subraction of two number is : "+c);
		}
		else if(op.equals("multiplication"))
		{
			c=a*b;
			System.out.println("multiplication of two numbers is : "+c);
		}
		else if(op.equals("division"))
		{
			c=a/b;
			System.out.println("division of two numbers quoitent is " +c);
			c=a%b;
			System.out.println("remainder is : "+c);
		}
		else
			System.out.println("Invalid operator");
	}

}
