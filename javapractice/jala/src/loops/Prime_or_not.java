package loops;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int f=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				f++;
		}
		if(f==2)
			System.out.println("not a prime");
		else
			System.out.println("Its a prime");
		

	}

}
