package practice;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt(),rev = 0;
		while(num!=0)
		{
			 int a=num%10;
			 rev=rev*10+a;
			 num=num/10;
			
		}
		System.out.println(rev);

	}

}
