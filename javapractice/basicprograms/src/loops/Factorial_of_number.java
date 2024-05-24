package loops;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;

		}
		System.out.println("Factorial of number is "+f);


	}

}
