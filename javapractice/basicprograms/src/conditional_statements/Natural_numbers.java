package conditional_statements;

import java.util.Scanner;

public class Natural_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num>=1 && num<=10)
		{
			if(num>0)
				System.out.println(num+" is natural");
			else
				System.out.println(num+" is not a natural number");
		}
		else
			System.out.println("beyond the limit");
	}

}
