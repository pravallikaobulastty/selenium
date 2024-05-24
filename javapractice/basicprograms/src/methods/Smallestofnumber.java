package methods;

import java.util.Scanner;

public class Smallestofnumber {
	public void Equal(int a,int b,int c)
	{
		if(a==b && b==c && a==c)
			System.out.println("equal");
	}
	public void Small(int a,int b,int c)
	{
		if(a<b && a<c)
		System.out.println(a);		
	}
	public void smallb(int a,int b,int c)
	{
		if(b<c)
			System.out.println(b);
	}
	public void smallc(int a,int b,int c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		Smallestofnumber obj=new Smallestofnumber();
		obj.Equal(x, y, z);
		obj.Small(x, y, z);
		obj.smallb(x, y, z);
		obj.smallc(x, y, z);
	}
}
