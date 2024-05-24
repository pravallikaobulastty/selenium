package arrays;

import java.util.Scanner;

public class Index_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int i;
		for( i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be find");
		int arrayele=sc.nextInt();
		for(i=0;i<size;i++)
		if(arrayele==a[i])
		{
			System.out.println(i);
		}
	}

}
