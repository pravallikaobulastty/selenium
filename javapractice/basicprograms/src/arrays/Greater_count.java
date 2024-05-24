package arrays;

import java.util.Scanner;

public class Greater_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size],c=0;
		System.out.println("Enter the array Values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]>=a[0])
				c++;
		}
		System.out.println(c);
		

	}

}
