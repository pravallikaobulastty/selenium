package arrays;

import java.util.Scanner;

public class Array_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String name=sc.next();
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(name.charAt(j)+ " ");
			}
			System.out.println();
		}
	}

}
