package arrays;

import java.util.Scanner;

public class Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int min=0,max=0;
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
		
			if(a[i]>0)
			
				max=a[i];
				else
					min=a[i];
		}
		
		System.out.println(min+ " "+max);
		
		
		

	}

}
