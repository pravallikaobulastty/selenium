package practice;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the requried factorial number");
		int n=sc.nextInt();
		int s=1,i;
		for( i=1;i<=n;i++)
		{
			 s=s*i;
			 System.out.println(s);	
		}
		System.out.println(s);
	}

}
