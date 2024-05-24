package practice;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt(),sum=0;
		while(n!=0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
	}

}
