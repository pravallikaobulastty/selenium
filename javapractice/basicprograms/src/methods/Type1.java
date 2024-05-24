package methods;

import java.util.Scanner;

public class Type1 {
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b");
		int a=sc.nextInt(), b=sc.nextInt();
		System.out.println(" type1 static add= "+(a+b));
	}
	public static void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b");
		int a=sc.nextInt(), b=sc.nextInt();
		System.out.println(" type1 static sub= "+(a-b));
	}
	public void mul()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b");
		int a=sc.nextInt(), b=sc.nextInt();
		System.out.println(" type1  multiplication= "+(a*b));

	}
	public static void main(String[] args) {
		Type1.add();
		Type1.sub();
		Type1 obj=new Type1();
		obj.mul();
	}
	

}
