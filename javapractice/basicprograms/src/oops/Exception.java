package oops;
import java.util.Scanner;
public class Exception {
	public static void main(String[] args) {
		System.out.println("execution started");
		int a=10;
		int c[]= {1,2};
		Scanner scan=null;
		try {
			System.out.println("enter a");
			 a=scan.nextInt();
			System.out.println(c[5]);
			int b=a/0;
			System.out.println(a+" "+b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Soory u cant divide with zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main method termination");
	}

}
