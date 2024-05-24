package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number n");
		int n = sc.nextInt();
		int r=0,temp=n;
		for(int i=n;n>0;n=n/10)
		{
			int rem=n%10;
			r = r*10+rem;
		}
		System.out.println(r);
		if(r==temp)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		

	}

}
