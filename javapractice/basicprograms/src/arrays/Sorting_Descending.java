package arrays;

import java.util.Scanner;

public class Sorting_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<size;i++)
		{
			for(int j=0;j<size-i;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting array");
		for(int value:a)
		{
			System.out.print(value+ " ");
		}

	}

}