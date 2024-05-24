package loops;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n value");
		int n=sc.nextInt();
		int rev = 0;
		for(int i=n;i<=1;i=i/10)
		{
			int a=i%10;		
			rev=a*10+rev;
		}
		System.out.println("reversed number is: "+rev);	
	}

}
