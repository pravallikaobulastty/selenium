package arrays;

import java.util.Scanner;

public class Sume_of_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size],sum=0;
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println("using for each loop");
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);
		
		
	}

}
