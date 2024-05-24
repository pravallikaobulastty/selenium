package conditional_statements;

import java.util.Scanner;

public class Calculator_Using_Character {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		System.out.println("Enter the operator");
		char op=scan.next().charAt(0);
		if(op=='+')
		{
			c=a+b;
			System.out.println("Addition of two number is : "+c);
		}
		else if(op=='-')
		{
			c=a-b;
			System.out.println("Subraction of two number is : "+c);
		}
		else if(op=='*')
		{
			c=a*b;
			System.out.println("multiplication of two numbers is : "+c);
		}
		else if(op=='/')
		{
			c=a/b;
			System.out.println("division of two numbers quoitent is " +c);
		}
		else if(op=='%')
		{
			c=a%b;
			System.out.println("remainder is : "+c);
		}
		else
			System.out.println("Invalid operator");
			
		
	}
}
