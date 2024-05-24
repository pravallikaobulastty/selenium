package loops;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int rev=0,temp=n;
		/*
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("Reversed number is "+rev);
		if(rev==temp)
			System.out.println("its pallindrome");
		else
			System.out.println("Not a pallindrome");

*/
		for(int i=n;n>0;n=n/10)
		{
			int rem=n%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		if(rev==temp)
			System.out.println("its pallindrome");
		else
			System.out.println("Not a pallindrome");
	}

}
