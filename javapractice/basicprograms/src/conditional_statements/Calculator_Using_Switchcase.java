package conditional_statements;

import java.util.Scanner;

public class Calculator_Using_Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		System.out.println("Enter the operator");
		char op=scan.next().charAt(0);
		switch(op)
		{
		case'+':
			c=a+b;
			System.out.println("Addition of two number is : "+c);
			break;
		case'-':
			c=a-b;
			System.out.println("Subraction of two number is : "+c);
			break;
		case'*':
			c=a*b;
			System.out.println("multiplication of two numbers is : "+c);
			break;
		case'/':
			c=a/b;
			System.out.println("division of two numbers quoitent is " +c);
			c=a%b;
			System.out.println("division of two numbers remainder is "+c);
			break;
		default:
			System.out.println("Invalid operator");
		}

	}

}
