package arrays;

import java.util.Scanner;

public class Average_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int sum=0;
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];

		}
		System.out.println(sum);
		int res=sum/size;
		System.out.println(res);

	}

}
