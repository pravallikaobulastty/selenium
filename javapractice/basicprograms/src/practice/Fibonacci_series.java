package practice;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the end fibonaci series");
		int n =sc.nextInt(),fib=0,a=0,b=1;
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			fib=a+b;
			a=b;
			b=fib;
			
		}
		
	}

}
