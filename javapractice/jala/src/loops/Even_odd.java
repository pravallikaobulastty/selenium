package loops;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				System.out.println(i+ " is even number");
			else
				System.out.println(i+ " is odd number");
		}

	}

}
