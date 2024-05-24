package arrays;

import java.util.Scanner;

public class Couunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int c=0,c1=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='*')
				c++;
			else if(ch=='#')
				c1++;
		}
			if(c==c1)
				System.out.println(0);
			else if(c>c1)
				System.out.println("positive Number");
			else 
				System.out.println("Negative number");
		

	}

}
