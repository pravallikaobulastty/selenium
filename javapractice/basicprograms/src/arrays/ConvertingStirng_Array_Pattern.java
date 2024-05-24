package arrays;

import java.util.Scanner;

public class ConvertingStirng_Array_Pattern {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("ENter string");
String name=sc.next();
char a[]=name.toCharArray();
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(a[j]+ " ");
	}
	System.out.println();
}
	}

}
