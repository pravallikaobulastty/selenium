package arrays;

import java.util.Scanner;

public class Integer_Array_pattern {
	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter size");
			int size=sc.nextInt();
					System.out.println("enter the number");
					int a[]=new int[size];
					for(int i=0;i<size;i++)
					{
						a[i]=sc.nextInt();
					}
					for(int i=0;i<a.length;i++)
					{
						for(int j=0;j<=i;j++)
						{
							System.out.print(a[j]+" ");
						}
						System.out.println();
					}
		}
	}

}
