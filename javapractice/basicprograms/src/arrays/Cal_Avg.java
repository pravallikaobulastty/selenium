package arrays;

import methods.Type1;

import java.util.Scanner;

public class Cal_Avg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		Type1.add();
		int a[]=new int[size],sum=0;
		double avg=0;
		Type1.add();
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			 avg=(double)sum/size;
	}
		System.out.println("Average is: " +avg);
	}

}
